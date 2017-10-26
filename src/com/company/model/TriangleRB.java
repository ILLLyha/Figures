package com.company.model;

public class TriangleRB extends Triangle {
    public TriangleRB(double firstSide, double secondSide, double thirdSide) {
        super(firstSide, secondSide, thirdSide);
        this.name = "Равнобедренный треугольник";
    }

    @Override
    public double getPerimeter() {
        return (firstSide * 2 + thirdSide);
    }

    @Override
    public double getArea() { return Math.sqrt(0.5*getPerimeter()*(0.5*getPerimeter()-firstSide)*(0.5*getPerimeter()-secondSide)*(0.5*getPerimeter()-thirdSide));

    }

    @Override
    public String getInfo() {
        return name + " со сторонами "
                + firstSide + ", " +  secondSide + ", " + thirdSide;
    }
}
