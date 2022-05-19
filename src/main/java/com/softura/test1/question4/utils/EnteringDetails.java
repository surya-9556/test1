package com.softura.test1.question4.utils;

import com.softura.test1.question4.model.CourseType;
import com.softura.test1.question4.model.Employee;

import java.util.Objects;
import java.util.Scanner;

public class EnteringDetails {
    public Object Details(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of employee registering for course");
        int numberOfEmployeeRegister = scanner.nextInt();
        scanner.nextLine();
        Employee[] employees = new Employee[numberOfEmployeeRegister];
        Register register = new Register();
        Employee employee = null;

        for(int i = 0; i<employees.length; i++){

            employee = new Register();

            System.out.println("Enter Employee id");
            employee.setEmployeeId(scanner.nextInt());

            System.out.println("Enter Employee name");
            employee.setEmployeeName(scanner.next());

            System.out.println("Enter course name");
            employee.setCourseName(scanner.next());
            if(Objects.equals(employee.getCourseName(), "java")){
                employee.setCoursePrice(2000);
                employee.setCourseType(CourseType.valueOf("Online"));
            }else if(Objects.equals(employee.getCourseName(), "python")){
                employee.setCoursePrice(4000);
                employee.setCourseType(CourseType.valueOf("ClassRoomBased"));
            }else{
                System.out.println("Please provide a valid course");
            }
            employees[i] = employee;
        }

        for(Employee employeeObj : employees)
            return employeeObj;

        return null;
    }
}
