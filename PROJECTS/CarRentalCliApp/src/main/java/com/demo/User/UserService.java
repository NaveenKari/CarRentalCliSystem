package com.demo.User;

public class UserService {

    private static final UserDAO userDAO = new UserDAO();

    public User[] getUsers(){
        return userDAO.getUsers();
    }
}
