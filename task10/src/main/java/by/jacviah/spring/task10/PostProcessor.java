package by.jacviah.spring.task10;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class PostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = bean.getClass();
        Method[] methods = beanClass.getMethods();
        for (Method meth : methods) {
            if (meth.isAnnotationPresent(Profiling.class)) {
                ProxyFactory proxyFactory = new ProxyFactory();
                proxyFactory.addAdvice(new Sniffer());
                proxyFactory.setTarget(bean);
                return beanClass.cast(proxyFactory.getProxy());
            }
        }
        return bean;
    }
}
