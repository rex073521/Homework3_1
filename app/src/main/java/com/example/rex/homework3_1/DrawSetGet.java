package com.example.rex.homework3_1;

/**
 * Created by REX on 2015/3/28.
 */
public class DrawSetGet {
    private float radius;
    private float x;
    private float y;
    private String color;
    private int rectRight;
    private int rectTop;
    private int rectLeft;
    private int rectBottom;

    DrawSetGet(){}

    DrawSetGet(String color,int x,int y,int radius){
        this.setColor(color);
        this.setX(x);
        this.setY(y);
        this.setRadius(radius);
    }

    DrawSetGet(String color, int rectRight,int rectTop,int rectLeft,int rectBottom){
        this.setColor(color);
        this.setRectRight(rectRight);
        this.setRectTop(rectTop);
        this.setRectLeft(rectLeft);
        this.setRectBottom(rectBottom);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRectRight() {
        return rectRight;
    }

    public void setRectRight(int rectRight) {
        this.rectRight = rectRight;
    }

    public int getRectTop() {
        return rectTop;
    }

    public void setRectTop(int rectTop) {
        this.rectTop = rectTop;
    }

    public int getRectLeft() {
        return rectLeft;
    }

    public void setRectLeft(int rectLeft) {
        this.rectLeft = rectLeft;
    }

    public int getRectBottom() {
        return rectBottom;
    }

    public void setRectBottom(int rectBottom) {
        this.rectBottom = rectBottom;
    }
}
