package com.company.model;

public class Rhombus extends Parallelogram {

    public Rhombus(double firstSide) {
        super(firstSide, firstSide);
        name = "ромб";
    }

    @Override
    public double getPerimeter() {
        return firstSide * 4;
    }

    @Override
    public String getInfo() {
        return name + " со стороной " + firstSide;
    }
}
