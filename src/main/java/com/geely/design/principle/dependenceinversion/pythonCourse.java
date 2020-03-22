package com.geely.design.principle.dependenceinversion;

public class pythonCourse implements ICource{
    @Override
    public void studyCourse() {
        System.out.println("我在学习Python");
    }
}
