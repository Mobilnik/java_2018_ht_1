package ru.milandr.courses.arshanskiy;

import java.util.Scanner;

public class Point {
    public double x;
    public double y;

    //Reading and writing...

    public void showX(){
        System.out.println(x);
    }

    public void showY(){
        System.out.println(y);
    }

    Scanner in = new Scanner(System.in);

    public void inputX(){
        x = in.nextDouble();
    }

    public void inputY(){
        y = in.nextDouble();
    }

    //Main methods...

    public double findDistance(Point pointExample){
        double distance;
        distance = Math.sqrt(Math.pow((x - pointExample.x),2) + Math.pow((y - pointExample.y),2));

        return distance;
    }

    public void printEquationLine(Point pointExample){

        double variable;

        variable = (pointExample.y - y)/(pointExample.x - x);
        System.out.print(variable);
        variable = pointExample.y - (variable*x);
        System.out.print("x");
        if (variable > 0)
            System.out.print(" + ");
        else
            System.out.print(" ");
        System.out.print(variable);
        System.out.println(" = y");
    }

    public void findLineSegmentMiddle(Point pointExample){

        double middleX, middleY;

        middleX = (x + pointExample.x)/2;
        middleY = (y + pointExample.y)/2;
        System.out.print("(");
        System.out.print(middleX);
        System.out.print(";");
        System.out.print(middleY);
        System.out.println(")");

    }

    public void printEquationCircle(Point pointExample){

        double radius;

        radius = Math.pow((x - pointExample.x),2) + Math.pow((y - pointExample.y),2);
        System.out.print("(");
        System.out.print("x");
        System.out.print(" - ");
        System.out.print(x);
        System.out.print(")");
        System.out.print("^2 ");
        System.out.print("+ ");

        System.out.print("(");
        System.out.print("y");
        System.out.print(" - ");
        System.out.print(y);
        System.out.print(")");
        System.out.print("^2 = ");

        System.out.println(radius);
    }

}