package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<User> userList = new ArrayList();

        userList.add(new User("Anton", 37));
        userList.add(new User("Anton", 38));
        userList.add(new User("Anton", 39));
        userList.add(new User("Anton", 37));
        userList.add(new User("Tanya", 37));
        userList.add(new User("Tanya", 38));
        userList.add(new User("Tanya", 40));
        userList.add(new User("Victor", 39));
        userList.add(new User("Victor", 40));
        userList.add(new User("Victor", 39));

        System.out.println(userList.toString());

        UserService service = new UserService();



        System.out.println(service.userMethod(userList));
    }
}
