package study.designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author heqingqing
 * @Description: $
 * @date 2019/7/7 21:59
 */
public class Test implements InvocationHandler {

    private Object target;

    public Test(Object object){
        this.target = object;
    }

    @Override
    public Object invoke(Object object, Method method,Object[] args) throws Throwable{
        // 这里可以做增强
        System.out.println("收钱");

        Object result = method.invoke(target, args);

        return result;
    }

    // 生成代理类
    public Object CreatProxyedObj()
    {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

}
