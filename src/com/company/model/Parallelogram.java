package com.company.model;

public class Parallelogram extends Quadrilateral {
    public Parallelogram(double firstSide, double secondSide) {
        super(firstSide, secondSide, firstSide, secondSide);
        this.name = "параллелограмм";
    }

    @Override
    public double getPerimeter() {
        return (firstSide + secondSide) * 2;
    }

    @Override
    public String getInfo() {
        return name + " со сторонами "
                + firstSide +" и " + secondSide;
    }
}
