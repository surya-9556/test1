package com.softura.test1.question3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Worker {
    private String name;
    private double salaryRate;
    private String typeOfEmployee;

    public abstract double pay(double pay);
}
