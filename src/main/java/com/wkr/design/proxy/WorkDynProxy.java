package com.wkr.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author wkr
 * @Description: jdk动态代理
 * @date 2022/9/519:41
 */
public class WorkDynProxy {
    public Object createProxy(Object proxiedObject) {
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, new DynamicProxyHandler(proxiedObject));
    }
    private class DynamicProxyHandler implements InvocationHandler {
        private Object proxiedObject;
        public DynamicProxyHandler(Object o) {
            proxiedObject = o;
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("start invoke: "+proxiedObject.getClass().getSimpleName()+"."+method.getName()+"("+ Arrays.toString(args) +")");
            Object result = method.invoke(proxiedObject, args);
            System.out.println("end invoke");
            return result;
        }
    }
}
