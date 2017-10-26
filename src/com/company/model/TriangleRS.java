package com.company.model;

public class TriangleRS extends Triangle {
    public TriangleRS(double firstSide, double secondSide, double thirdSide) {
        super(firstSide, secondSide, thirdSide);
        this.name = "Равносторонний треугольник";
    }

    @Override
    public double getPerimeter() {
        return (firstSide * 3);
    }

    @Override
    public double getArea() { return Math.sqrt(0.5*getPerimeter()*(0.5*getPerimeter()-firstSide)*(0.5*getPerimeter()-firstSide)*(0.5*getPerimeter()-firstSide));

    }

    @Override
    public String getInfo() {
        return name + " со сторонами "
                + firstSide;
    }
}
