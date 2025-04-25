package com.quintus;

import java.util.ArrayList;

public class Polygon extends Shape{
    public Polygon(double radius, Point center, int corners) {
        this.x=center.x;
        this.y=center.y;
        this.points= new ArrayList<Point>();
        double t=0;
        double angle=2*Math.PI/corners;
        for(int i=0;i<corners;i++){
            points.add(new Point((float) (Math.cos(t)*radius), (float) (Math.sin(t)*radius)));
            t+=angle;
        }

    }
}
