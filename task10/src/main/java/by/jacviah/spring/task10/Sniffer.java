package by.jacviah.spring.task10;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class Sniffer implements MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        if (!method.isAnnotationPresent(Profiling.class)) {
            return invocation.proceed();
        }

        long before = System.nanoTime();
        Object returnObj = invocation.proceed();
        long after = System.nanoTime();
        System.out.println("метод " + method.getName() + " работал: " + (after - before) + " наносекунд");
        return returnObj;
    }
}