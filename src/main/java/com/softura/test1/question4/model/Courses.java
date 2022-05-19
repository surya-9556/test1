package com.softura.test1.question4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@EqualsAndHashCode(callSuper = false)
public class Courses {
    private String courseName;
    private double coursePrice;
    private CourseType courseType;
}
