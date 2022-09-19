package com.example.a8you;

import java.util.ArrayList;

public class User {

    public String username, email, weight, height, age, bmi;
    public ArrayList<String> userDataArray;
    public User(){
    }

    public enum genderEnum {
        MALE, FEMALE, Other;
    }
    public User(String username, String email){
        this.username = username;
        this.email = email;
    }

    public void User(String username, String height , String weight, String age){
        this.username = username;
        this.height = height;
        this.weight = weight;
        this.age = age;
//        userDataArray.add(username);
//        userDataArray.add(height);
//        userDataArray.add(weight);
//        userDataArray.add(age);
    }

    public double setBmi(){
        double bmiD = Double.valueOf(weight) / Math.pow(Double.valueOf(height), 2);
//        bmi = String.valueOf(bmiD);
        return bmiD;
    }

//    public String gender(String gender) {
//        if (gender.equalsIgnoreCase("male")){
//            gender = "male";
//        } else
//        return gender
//    }
}
