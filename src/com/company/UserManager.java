package com.company;

public class UserManager {
 public void add (User user) {
     System.out.println(user.userId + " kaydedildi.");
    }
    public void addMultipleUser (User[] users){
     for (User user:users){
         add(user);
     }

    }
}
