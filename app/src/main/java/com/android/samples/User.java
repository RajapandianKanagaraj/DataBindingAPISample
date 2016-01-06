package com.android.samples;

/**
 * Created by a6000388 on 1/5/16.
 */
public class User {

    public String firstName;
    public String lastName;
    public String age;
    public String email;
    public String phoneNumber;
    public boolean isAdult = false;

    public User(){
        this.firstName = "Vandu";
        this.lastName = "Murugan";
        this.age = "17";
        this.email = "vandu.murugan@gmail.com";
        this.phoneNumber = "555-666-8888";

        if(Integer.parseInt(age) > 18){
            isAdult = true;
        }else{
            isAdult = false;
        }
    }
}
