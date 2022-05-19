package com.softura.test1.question3.utils;

import com.softura.test1.question3.model.DailyWorker;
import com.softura.test1.question3.model.SalariedWorker;
import com.softura.test1.question3.model.Worker;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of employee");
        Worker worker = new DailyWorker();
        worker.setTypeOfEmployee(scanner.next());
        System.out.println("Enter number of employee");
        int numberOfEmp = scanner.nextInt();
        DailyWorker[] dailyWorkers = new DailyWorker[numberOfEmp];
        SalariedWorker[] salariedWorkers = new SalariedWorker[numberOfEmp];
        DailyWorker dailyWorker = null;
        SalariedWorker salariedWorker = null;

        if(Objects.equals(worker.getTypeOfEmployee(), "DailyWorker")){
            for(int i = 0; i<dailyWorkers.length; i++){
                dailyWorker = new DailyWorker();
                System.out.println("Enter Employee name");
                dailyWorker.setName(scanner.next());
                scanner.nextLine();
                System.out.println("Enter salary rate");
                dailyWorker.setSalaryRate(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("Enter start appointment yyyy-mm-dd");
                dailyWorker.setStartDate(LocalDate.parse(scanner.nextLine()));
                System.out.println("Enter end appointment yyyy-mm-dd");
                dailyWorker.setEndDate(LocalDate.parse(scanner.nextLine()));


                dailyWorker.setWorkerGetsAmount(dailyWorker.pay(dailyWorker.getSalaryRate()));

                dailyWorkers[i] = dailyWorker;
            }

            for(DailyWorker dailyWorkerObj:dailyWorkers)
                System.out.println(dailyWorkerObj);

        } else if (Objects.equals(worker.getTypeOfEmployee(), "SalariedWorker")){
            for(int i = 0; i<salariedWorkers.length; i++){
                salariedWorker = new SalariedWorker();
                System.out.println("Enter Employee name");
                salariedWorker.setName(scanner.next());
                scanner.nextLine();
                System.out.println("Enter salary rate");
                salariedWorker.setSalaryRate(scanner.nextDouble());
                scanner.nextLine();

                salariedWorker.setWorkerGetsAmount(salariedWorker.pay(salariedWorker.getSalaryRate()));
                salariedWorkers[i] = salariedWorker;
            }

            for(SalariedWorker salariedWorkerObj:salariedWorkers)
                System.out.println(salariedWorkerObj);

        }else {
            System.out.println("Please provide correct employee details");
        }
    }
}
