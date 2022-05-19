package com.softura.test1.question4.utils;

import com.softura.test1.question4.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Register extends Employee {
    List<Employee> employees = new ArrayList<Employee>();
    StringBuilder sb = new StringBuilder();

    public void register(Employee e) throws FileNotFoundException {

        employees.add(e);
        PrintWriter printWriter = new PrintWriter(new File("D:\\csv\\Employee-details.csv"));

        sb.append("Employee Id"+",");
        sb.append("Employee Name"+",");
        sb.append("Course Registered"+",");
        sb.append("Course price"+",");
        sb.append("Course type"+",");
        sb.append("\r\n");

        sb.append((int) e.getEmployeeId()+",");
        sb.append(e.getEmployeeName()+",");
        sb.append(e.getCourseName()+",");
        sb.append((int) e.getCoursePrice()+",");
        sb.append(String.valueOf(e.getCourseType())+",");
        sb.append("\r\n");

        printWriter.write(sb.toString());

        System.out.println("Added a record");
        printWriter.close();

    }

    public void deRegister(Employee e) {
        employees.remove(e);
        System.out.println("Employee details: "+employees );
        System.out.println("Successfully de registered the employee");
    }

    public void getDetailsOfCourseRegistered() throws IOException {

        String file = "D:\\csv\\Employee-details.csv";
        String line = "";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((line = bufferedReader.readLine()) != null) {
                String[] row = line.split(",");
                for (String index : row) {
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
