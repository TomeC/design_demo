package com.wkr.design.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author wkr
 * @Description: cglib 代理
 * @date 2022/9/615:25
 */
public class WorkerInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("begin "+proxy.getSuperName()+":"+method.getName()+"("+ Arrays.toString(args) +")");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("end");
        return result;
    }
    public static Object getProxy(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        // 设置类加载
        enhancer.setClassLoader(clazz.getClassLoader());
        // 设置被代理类
        enhancer.setSuperclass(clazz);
        // 设置方法拦截器
        enhancer.setCallback(new WorkerInterceptor());
        // 创建代理类
        return enhancer.create();
    }
}
