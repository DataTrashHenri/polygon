package com.quintus;

import java.util.ArrayList;
import java.util.List;

public class Path {
    private final Path start;
    private final Path end;
    private double t;
    private Point singePoint;
    public List<Point> points;

    public Path(Path start, Path end){
        this.start=start;
        this.end=end;
        this.t=0;
        this.points= new ArrayList<>();
        while (t<=1) {
            points.add(new Point((float) (start.getFromT(t).x+((end.getFromT(t).x-start.getFromT(t).x)*t)), (float) (start.getFromT(t).y+((end.getFromT(t).y-start.getFromT(t).y)*t))));
            t+=0.001;
        }
    }
    public Path(Point point) {
        this.singePoint = point;
        this.start=null;
        this.end=null;
        this.points= new ArrayList<>();
        points.add(point);
    }
    public Point getFromT(double t) {
        if(start==null) return singePoint;
        return new Point((float) (start.getFromT(t).x+((end.getFromT(t).x-start.getFromT(t).x)*t)), (float) (start.getFromT(t).y+((end.getFromT(t).y-start.getFromT(t).y)*t)));
    }

}
