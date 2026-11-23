package com.example.app;

import com.example.core.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {
        User user = new User(1, "Prathmesh");
        System.out.println(user);
        System.out.println(new ObjectMapper().writeValueAsString(user));
    }
}
