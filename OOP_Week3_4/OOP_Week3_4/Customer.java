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
public class Customer {
    private int ID;
    private String name;
    private int discount;
    private char gender;
    public Customer(){
        
    }
    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;

    }

    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public String toString(){
        return name+"("+ID+")";
    }
    public static void main(String[] args) {
        Customer a= new Customer(321, "thitbo", 30);
        System.out.println(a.toString());
    }
}
