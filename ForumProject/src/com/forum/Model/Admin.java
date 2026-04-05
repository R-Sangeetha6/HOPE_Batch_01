package com.forum.Model;

public class Admin extends User{

    public Admin(int id,String username){
        super(id,username);
    }

    public void displayRole(){
        System.out.println("Admin : "+getUsername());
    }
}