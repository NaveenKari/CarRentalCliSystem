package com.demo.User;

import java.util.UUID;

public class UserDAO {

    private static final User[] users = new User[]{
            new User(UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3"), "James","Fal",21,"911"),
            new User(UUID.fromString("b10d126a-3608-4980-9f9c-aa179f5cebc3"), "Jamila","vegas",19,"000"),
            new User(UUID.fromString("2ea85178-fada-4279-9d5e-eea627049fa2"), "Naveen","Kari",19,"000"),
            new User(UUID.fromString("576590ff-57a1-4df3-8430-79980eb42343"), "Sindhu","Raavi",19,"000"),
            new User(UUID.fromString("9d818235-ce3b-40e8-b74a-3674985c6bcd"), "Venakat","vegas",19,"000"),
            new User(UUID.fromString("87cb62d9-d262-4174-b1b2-957f9e2a1f40"), "Chandu","gudi",19,"000"),
            new User(UUID.fromString("42004f7a-0d04-45d7-807c-dbacf35db2bb"), "Yash","vegas",19,"000")

    };

    public User[] getUsers(){return users;}


}
