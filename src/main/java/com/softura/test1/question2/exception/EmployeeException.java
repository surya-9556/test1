package com.softura.test1.question2.exception;

import java.util.regex.Pattern;

public class EmployeeException {
    static String userNamePattern="[A-Za-z]{5,25}";

    public static boolean validateUserName(String userName){
        return Pattern.matches(userNamePattern,userName);
    }

    public static boolean validateAge(int age){
        if(age < 18){
            return false;
        }else return age <= 60;
    }
}
