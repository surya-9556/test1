package com.softura.test1.question3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@EqualsAndHashCode(callSuper = false)
public class SalariedWorker extends Worker{
    private static int noOfWorkingHoursInWeek = 40;
    private double workerGetsAmount;

    @Override
    public double pay(double pay) {

        return noOfWorkingHoursInWeek * pay;
    }
}
