package com.quintus;

import java.util.ArrayList;

public class Complex extends Shape{
    public Complex(Point start,double boundX,Transformable transformable) {
        this.x= start.x;
        this.y= start.y;
        float t=0;
        float generatedT;
        this.points= new ArrayList<Point>();
        while (t<=boundX) {
            generatedT = transformable.generatePair(t);
            points.add(new Point(t,generatedT));
            t+=0.01;
        }
    }
}
