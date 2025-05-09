package com.quintus;

import java.util.ArrayList;
import java.util.List;

public class BezierCurve extends Shape {
    List<Point> inputPoints;
    private List<List<Path>> layer;
    public BezierCurve(List<Point> inputPoints){
        this.inputPoints=inputPoints;

        layer= new ArrayList<>();

        int i=0;
        while (i<(inputPoints.size()-1)){
            layer.add(new ArrayList<>());
            i++;
        }
        points= new ArrayList<>();
        calculateBezierCurve(inputPoints,points);

    }
    public BezierCurve() {
        this.inputPoints= new ArrayList<>();
    }
    public void addInputPoint(Point point) {
        this.inputPoints.add(point);
    }
    private void calculateBezierCurve(List<Point> inputPoints, List<Point> outputPoints) {

        for (int i=0; i< layer.size();i++) {
            if(i==0) {
                for (int j=0; j<inputPoints.size()-1; j++) {
                    layer.get(0).add(new PointPath(inputPoints.get(j),inputPoints.get(j+1)));
                }
            }else  {
                for (int j=0;j<layer.get(i-1).size()-1;j++) {
                    layer.get(i).add(new ComplexPath(layer.get(i-1).get(j),layer.get(i-1).get(j+1)));
                }
            }
        }
        float t=0;
        while (t<=1) {
            outputPoints.add(layer.get(layer.size()-1).get(0).getFromT(t));
            t+=0.001;

        }

        //outputPoints.add(new Point(100,100));
        System.out.println(layer.size()+"ok");
        for ( var layer:layer) {
            System.out.println(layer.size());
        }

    }
}
