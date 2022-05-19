package com.softura.test1.question4.utils;

import com.softura.test1.question4.model.CoursesOffered;
import com.softura.test1.question4.model.Employee;

import java.io.IOException;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        EnteringDetails employees = new EnteringDetails();
        Register register = new Register();

        boolean understood = false;
        do{
            System.out.println("1: Register for a course");
            System.out.println("2: De Register for a course");
            System.out.println("3: List of courses offered");
            System.out.println("4: List of employees registered for a specific course");

            System.out.println("Choose your type: ");
            int option = scanner.nextInt();


            switch (option){
                case 1:
                    register.register((Employee) employees.Details());
                    understood = true;
                    break;
                case 2:
                    register.deRegister((Employee) employees.Details());
                    understood = true;
                    break;
                case 3:
                    System.out.println("Courses Offered by company are");
                    for(CoursesOffered offered:CoursesOffered.values()){
                        System.out.println(offered);
                    }
                    understood = true;
                    break;
                case 4:
                    register.getDetailsOfCourseRegistered();
                    understood = true;
                    break;
                default:
                    System.out.println("Choose correct option");
                    break;
            }
        }while (!understood);

    }
}
