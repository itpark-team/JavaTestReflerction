package com.company;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

public class Users {

    public static void HelloWorld() {
        System.out.println("hello world");
    }

    public static User GetFirstUser(){
        return new User(1, "Петя");
    }

    public static User GetUserById(String parameters) {

        int id = Integer.parseInt(parameters);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "Петя"));
        users.add(new User(2, "Вася"));
        users.add(new User(3, "Галя"));

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).Id == id) {
                return users.get(i);
            }
        }
        return null;
    }
}
