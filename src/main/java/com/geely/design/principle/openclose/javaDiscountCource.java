package com.geely.design.principle.openclose;

public class javaDiscountCource extends JavaCourse{
    public javaDiscountCource(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOrignPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
