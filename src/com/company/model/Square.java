package com.company.model;

public class Square extends Rhombus  {

    public Square(double firstSide) {
        super(firstSide);
        name = "квадрат";
    }

    @Override
    public double getArea() {
        return Math.pow(firstSide, 2);
    }
}
