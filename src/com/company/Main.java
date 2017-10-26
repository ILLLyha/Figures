package com.company;

import com.company.model.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Figure> figureList = new ArrayList<>();

        Quadrilateral quadrilateral = new Quadrilateral(5, 10, 15, 20);
        figureList.add(quadrilateral);

        Parallelogram parallelogram = new Parallelogram(10, 5);
        figureList.add(parallelogram);

        Rectangle rectangle = new Rectangle(10, 5);
        figureList.add(rectangle);

        Rhombus rhombus = new Rhombus(5);
        figureList.add(rhombus);

        Square square = new Square(5);
        figureList.add(square);

        Triangle triangle = new Triangle(3, 5, 7);
        figureList.add(triangle);

        TrianglePU trianglePU = new TrianglePU(3,4,5);
        figureList.add(trianglePU);

        TriangleRS triangleRS = new TriangleRS(5,5,5);
        figureList.add(triangleRS);

        TriangleRB triangleRB = new TriangleRB(6,6,2);
        figureList.add(triangleRB);

//commit
        /*
        for(int i=0; i < figureList.size(); i++ ){
            System.out.println(figureList.get(i).getInfo());
            System.out.println("Периметр равен " + figureList.get(i).getPerimeter());
            double area = figureList.get(i).getArea();
            if(area > 0)
                System.out.println("Площадь равна " + area);
        }
        */

        for (Figure figure : figureList) {
            System.out.println(figure.getInfo());
            System.out.println("Периметр равен " + figure.getPerimeter());
            try {
                System.out.println("Площадь равна " + figure.getArea());
            } catch (NotImplementedException e){
                System.out.println("Площадь не может быть вычислена");
            }
            System.out.println();
        }

    }
}