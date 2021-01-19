package ioc.code01;


import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * 方法拦截器，
 * 当调用目标方法时，会被MyMethodInterceptor拦截，并调用intercept()方法，完成对目标方法的加强。
 */
public class MyInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("目标方法执行之前");
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("目标方法执行之后");
        return object;
    }
}
