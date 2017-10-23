package com.company.model;

public class Rectangle extends Parallelogram {
    public Rectangle(double firstSide, double secondSide) {
        super(firstSide, secondSide);
        name = "прямоугольник";
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
