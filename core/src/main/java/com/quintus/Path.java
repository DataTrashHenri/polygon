package com.quintus;

import java.util.ArrayList;
import java.util.List;

public abstract class Path{

    private double t;

    public List<Point> outputPoints;



    public abstract Point getFromT(double t);

}
