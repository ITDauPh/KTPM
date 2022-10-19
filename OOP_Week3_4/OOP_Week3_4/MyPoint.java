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
public class MyPoint {
    private int x=0;
    private int y=0;
    public MyPoint(){
        
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
       int [] xy = new int[2];
       xy [0]=x;
       xy [1]=y;
       return xy;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "("+x+","+y+")"; 
    }
    public double distance(int x,int y){
        return Math.sqrt(Math.pow((this.x-x),2) + Math.pow((this.y-y),2));
    }
    public double distance(MyPoint another ){
         return Math.sqrt(Math.pow((this.x-another.x),2) + Math.pow((this.y-another.y),2));
    }
    public double distance(){
        return Math.sqrt(Math.pow((this.x),2) + Math.pow((this.y),2));
    }
    public static void main(String[] args) {
        MyPoint a= new MyPoint(3, 4);
        MyPoint b= new MyPoint(3, 0);
        System.out.println(a.toString());
        System.out.println(a.distance(1,2));
        System.out.println(a.distance(b));
        System.out.println(a.distance());
    }
}
