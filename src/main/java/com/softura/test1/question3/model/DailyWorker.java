package com.softura.test1.question3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.temporal.ChronoUnit;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

@EqualsAndHashCode(callSuper = false)
public class DailyWorker extends Worker{
    private LocalDate startDate;
    private LocalDate endDate;

    private double workerGetsAmount;

    @Override
    public double pay(double pay) {
        long noOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        return noOfDaysBetween * pay;
    }
}
