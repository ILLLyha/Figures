package com.company.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Quadrilateral extends Figure {

    protected double firstSide;
    protected double secondSide;
    private double thirdSide;
    private double fourthSide;

    public Quadrilateral(double firstSide,
                         double secondSide,
                         double thirdSide,
                         double fourthSide) {
        this.name = "четырёхугольник";
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide = fourthSide;
    }

    public double getPerimeter() {
        return firstSide + secondSide +
                thirdSide + fourthSide;
    }

    public double getArea() {
        throw new NotImplementedException();
    }

    public String getInfo() {
        return name + " со сторонами " +
                firstSide + ", " + secondSide + ", " +
                thirdSide + ", " + fourthSide;
    }
}