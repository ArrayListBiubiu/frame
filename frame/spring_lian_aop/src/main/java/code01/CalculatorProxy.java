package code01;

import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CalculatorProxy {

    public static Calculator getProxy(final Calculator calculator) {

        // 获取被代理对象的 "类加载器"
        ClassLoader loader = calculator.getClass().getClassLoader();
        // 获取被代理对象的 "所有接口"
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
        // 用来执行被代理类需要执行的方法
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    //开始调用被代理类的方法
                    result = method.invoke(calculator, args);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return result;
            }
        };
        Object o = Proxy.newProxyInstance(loader, interfaces, handler);
        return (Calculator) o;
    }
}
