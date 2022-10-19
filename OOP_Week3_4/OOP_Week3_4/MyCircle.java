/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Week3_4;

/**
 *
 * @author Admin
 */
public class MyCircle {
    private MyPoint center;
    private int radius=1 ;
    public MyCircle(){
        
    }
    public MyCircle(int x, int y , int radius){
        center= new MyPoint(x, y);
        this.radius=radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public String toString(){
        return "MyCircle[radius= "+radius+", center={"+center+"]";
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public double distance(MyCircle another){
       return center.distance(another.center);
    }
    
    public static void main(String[] args) {
        MyPoint a= new MyPoint(3, 4);
        MyPoint c= new MyPoint(2, 1);
        MyCircle b= new MyCircle(a, 3);
        MyCircle d = new MyCircle(c, 1);
        System.out.println(b.toString());
        System.out.println(b.getArea());
        System.out.println(b.getCircumference());
        System.out.println(b.distance(d));
    }
}
 