package com.quintus;


import java.util.ArrayList;

public class Circle extends Shape {
    public Circle(double radius, Point center) {
        this.x=center.x;
        this.y=center.y;
        this.points= new ArrayList<Point>();
        double t=0;
        while (t<=2*Math.PI) {
            points.add(new Point((float) (Math.cos(t)*radius), (float) (Math.sin(t)*radius)));
            t+=Math.PI/(radius*2);
        }
    }
}
