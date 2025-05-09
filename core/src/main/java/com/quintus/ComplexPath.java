package com.quintus;

public class ComplexPath extends Path {
    Path path1;
    Path path2;
    public ComplexPath(Path path1, Path paht2) {
        this.path1 = path1;
        this.path2 = paht2;
    }
    @Override
    public Point getFromT(double t) {
        return new Point((float) (path1.getFromT(t).x+t*(path2.getFromT(t).x-path1.getFromT(t).x)), (float) (path1.getFromT(t).y+t*(path2.getFromT(t).y-path1.getFromT(t).y)));
    }
}
