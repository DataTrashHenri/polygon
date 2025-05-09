package com.quintus;

import java.util.List;

public class PointPath extends Path {

    Point point1;
    Point point2;
    public PointPath(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    @Override
    public Point getFromT(double t) {
        return new Point((float) (point1.x+t*(point2.x-point1.x)), (float) (point1.y+t*(point2.y-point1.y)));
    }
}
