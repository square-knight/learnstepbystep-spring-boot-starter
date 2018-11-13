package com.fxp.myaop.function;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Usage:
 * <p>
 * Description:
 * User: fuxinpeng
 * Date: 2018-11-13
 * Time: 2:03 PM
 */
@Component
public class AopCreater implements BeanPostProcessor{
    @Override
    public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
        Class<?> aClass = bean.getClass();
        WithAspect annotation = aClass.getAnnotation(WithAspect.class);
        if(null != annotation){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(aClass);
            enhancer.setCallback(new InvocationHandler() {
                @Override
                public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                    System.out.println("aop before");
                    try{
                        Object invoke = method.invoke(bean, objects);
                        System.out.println("aop after return");
                        return invoke;
                    }catch (Exception e){
                        System.out.println("aop after throw");
                        throw e;
                    }
                }
            });
            return enhancer.create();
        }
        return bean;
    }
}
