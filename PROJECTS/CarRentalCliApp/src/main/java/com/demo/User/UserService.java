package com.demo.User;

import com.demo.Car.Car;

import java.util.Objects;
import java.util.UUID;

public class UserService {

    private static final UserDAO userDAO = new UserDAO();

    public User[] getUsers(){
        return userDAO.getUsers();
    }

    public User getUserById(String id){
        int index = 0;
        User[] users = userDAO.getUsers();
        for(int i = 0; i<users.length;i++){
            if(Objects.equals(users[i].getId().toString(), id)){
                index = i;
            }
        }
        return users[index];
    }
}
