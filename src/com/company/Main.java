package com.company;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String command = "Users.HelloWorld";

        String className = "com.company."+command.split("\\.")[0];
        String methodName = command.split("\\.")[1];

        Class usersClass = Class.forName(className);

        Method usersClassMethod1 = usersClass.getMethod(methodName);
        usersClassMethod1.invoke(null);

        Method usersClassMethod2 = usersClass.getMethod("GetFirstUser");
        User user = (User) usersClassMethod2.invoke(null);
        System.out.println(user.Id+" "+user.Name);

        Method usersClassMethod3 = usersClass.getMethod("GetUserById", String.class);
        User user2 = (User) usersClassMethod3.invoke(null,"1");
        System.out.println(user2.Id+" "+user2.Name);
    }
}
