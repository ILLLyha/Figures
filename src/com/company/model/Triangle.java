package com.company.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Triangle extends Figure {
    protected double firstSide;
    protected double secondSide;
    protected double thirdSide;


    public Triangle(double firstSide,
                    double secondSide,
                    double thirdSide)
                     {
        this.name = "Треугольник";
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;

    }

    public double getPerimeter() {
        return firstSide + secondSide +
                thirdSide;
    }

    @Override
    public double getArea() { return Math.sqrt(0.5*getPerimeter()*(0.5*getPerimeter()-firstSide)*(0.5*getPerimeter()-secondSide)*(0.5*getPerimeter()-thirdSide));

    }


    public String getInfo() {
        return name + " со сторонами " +
                firstSide + ", " + secondSide + ", " +
                thirdSide;
    }
}