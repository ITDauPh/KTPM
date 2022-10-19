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
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    public MyTriangle(){
        
    }
    public MyTriangle(int x1,int y1, int x2, int y2, int x3, int y3){
        this.v1= new MyPoint(x1, y1);
        this.v2= new MyPoint(x2, y2);
        this.v3= new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public String toString(){
        return "MyTriangle[v1=("+v1+"),v2=("+v2+"),v3=("+v3+")]";
    }
    public double getPerimeter(){
        System.out.println("Chu vi tam giac:");
        return v1.distance(v2)+v1.distance(v3)+v2.distance(v3);
    }
    public String getType(){
        double a= v1.distance(v2);
        double b= v1.distance(v3);
        double c= v2.distance(v3);
        if(a==b){
            return "Equilateral";
        }
        if(a==b && b==c){
            return "Isosceles";
        }
            return "Scalene";
        
    }
    public static void main(String[] args) {
        MyTriangle a= new MyTriangle(2, 1, 3, 0, 1, 3);
        System.out.println(a.toString());
        System.out.println(a.getPerimeter());
        System.out.println(a.getType());
             
    }
}
