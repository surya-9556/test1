package com.softura.test1.question2;

import com.softura.test1.question2.exception.AgeException;
import com.softura.test1.question2.exception.NameException;
import com.softura.test1.question2.models.Employee;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(System.in);
            Employee employee = new Employee();
            System.out.println("Enter employee name: ");
            employee.setName(scanner.next());
            scanner.nextLine();
            System.out.println("Enter employee age: ");
            employee.setAge(scanner.nextInt());
            scanner.nextLine();


            employee.validName(String.valueOf(employee.getName()));
            System.out.println("Employee Name:- " + employee.getName());
            employee.validAge(employee.getAge());
            System.out.println("Employee Age:- " + employee.getAge());
        }
        catch (NameException ex){
            System.out.println("Caught the exception");

            // printing the message from InvalidNameException object
            System.out.println("Exception occurred: " + ex);
        } catch (AgeException e) {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occurred: " + e);
        }
    }
}
