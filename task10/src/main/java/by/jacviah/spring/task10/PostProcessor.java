package by.jacviah.spring.task10;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class PostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = bean.getClass();
        Method[] methods = beanClass.getMethods();
        for (Method meth : methods) {
            if (meth.isAnnotationPresent(Profiling.class)) {
                ProxyFactory proxyFactory = new ProxyFactory();
                proxyFactory.addAdvice(new MethodInterceptor(){
                    @Override
                    public Object invoke(MethodInvocation invocation) throws Throwable {
                        Method method = invocation.getMethod();
                        if (method.isAnnotationPresent(Profiling.class)) {
                            long before = System.nanoTime();
                            Object returnObj = invocation.proceed();
                            long after = System.nanoTime();
                            System.out.println("метод " + method.getName() + " работал: " + (after - before) + " наносекунд");
                            return returnObj;
                        }
                        return invocation.proceed();
                    }
                });
                proxyFactory.setTarget(bean);
                return proxyFactory.getProxy();
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
