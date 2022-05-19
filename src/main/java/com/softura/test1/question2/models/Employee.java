package com.softura.test1.question2.models;

import com.softura.test1.question2.exception.AgeException;
import com.softura.test1.question2.exception.EmployeeException;
import com.softura.test1.question2.exception.NameException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String name;
    private int age;

    public void validName(String name) throws NameException {
        if(EmployeeException.validateUserName(this.name)){
            this.name = name;
        }else {
            throw new NameException("Please enter a valid name");
        }
    }

    public void validAge(int age) throws AgeException{
        if(EmployeeException.validateAge(age)){
            this.age = age;
        }else {
            throw new AgeException("Please provide a valid age");
        }
    }
}
