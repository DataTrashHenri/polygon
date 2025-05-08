package com.quintus;

import java.util.ArrayList;
import java.util.List;

public class BezierCurve extends Shape {
    private List<Point> inputPoints;
    public BezierCurve(List<Point> inputPoints){
        this.inputPoints=inputPoints;
        calculateBezierCurve(inputPoints,points);
    }
    public BezierCurve() {
        this.inputPoints= new ArrayList<>();
    }
    public void addInputPoint(Point point) {
        this.inputPoints.add(point);
    }
    private void calculateBezierCurve(List<Point> inputPoints, List<Point> outputPoints) {
        List<Path> paths=new ArrayList<>();
        int level=0;
        int leftPerLevel=inputPoints.size()-1;
        while (level< inputPoints.size()-1) {
            while (leftPerLevel>0) {
                if (level==0) {
                    Path path = new Path(new Path(inputPoints.get(0)), new Path(inputPoints.get(1)));
                } else {
                    path
                }
                leftPerLevel--;
            }
            level++;
            leftPerLevel=inputPoints.size()-level-1;
        }

    }
}
