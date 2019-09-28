package com.uriel.DesignPatterns.prototype_exercise;

class Line
{
    private Point start, end;

    private Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    public Line deepCopy()
    {
        return new Line(
                new Point(this.start),
                new Point(this.end));
    }
}
