package com.uriel.DesignPatterns.prototype_exercise;

class Point{
    private int x, y;

    private Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    Point(Point other)
    {
        this(other.x,other.y);
    }
}

