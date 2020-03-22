package com.geely.design.principle.openclose;

public class Test {

    public static void main(String[] args) {
        ICource iCourse = new javaDiscountCource(96,"设计模式",348d);

        javaDiscountCource javaCourse = (javaDiscountCource) iCourse;

        System.out.println("课程ID:"+javaCourse.getId()+"课程名称："+javaCourse.getName()+"课程原价："+javaCourse.getOrignPrice()+"课程折扣价格："+javaCourse.getPrice());
    }

}
