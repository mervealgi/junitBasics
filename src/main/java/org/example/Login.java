package org.example;

public class Login {

    public Object loginUser(String username , String password){

         if(username.equals("username") && password.equals("12345")){
             return true;
         } else {
             return "Username and password error";
         }
    }
}
