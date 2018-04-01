package org.gupao.study.pattern.chapter.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author shen
 * @create 2018-03-28 22:00
 * @desc
 **/
public class JdkHandler implements InvocationHandler {


    /**
     * 代理对象
     */
    private Object target;

    public JdkHandler(Object target) {
        this.target = target;
    }


    public Object getInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.printf("method %s execute before \n", method.getName());
        Object result = method.invoke(target, args);
        System.out.printf("method %s execute get result %d \n", method.getName(), result);
        System.out.printf("method %s execute after", method.getName());
        return result;
    }
}
