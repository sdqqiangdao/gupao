package org.gupao.study.pattern.chapter.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author shen
 * @create 2018-04-01 10:53
 * @desc
 **/
public class CglibHandler implements MethodInterceptor {


    private Object target;

    public CglibHandler(Object target) {
        this.target = target;
    }

    public Object getInstance() {
        //创建加强器，用来创建动态代理类
        Enhancer enhancer = new Enhancer();
        //为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
        enhancer.setSuperclass(this.target.getClass());
        //设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦截
        enhancer.setCallback(this);
        // 创建动态代理类对象并返回
        return enhancer.create();
    }

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.printf("method %s execute before \n", method.getName());
        Object result =  proxy.invokeSuper(obj, args);
        System.out.printf("method %s execute get result %d \n", method.getName(), result);
        System.out.printf("method %s execute after", method.getName());
        return result;
    }
}
