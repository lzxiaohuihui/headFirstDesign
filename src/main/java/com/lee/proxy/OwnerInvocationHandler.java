package com.lee.proxy;

import sun.management.Agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OwnerInvocationHandler implements InvocationHandler {

    Person person;

    public OwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")){
            return method.invoke(person, args);
        }
        else if (method.getName().startsWith("setGeekRating")){
            throw new IllegalAccessError();
        }
        else if (method.getName().startsWith("set")){
            return method.invoke(person, args);
        }
        return null;
    }

    Person getOwnerProxy(Person person){
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }
}
