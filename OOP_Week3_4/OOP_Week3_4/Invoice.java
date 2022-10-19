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
public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;
    public Invoice(){
        
    }

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public double getAmountAfterDiscount(){
        return amount-amount*customer.getDiscount()/100;
    }
    public static void main(String[] args) {
        Customer b= new Customer(32134,"thit heo", 30);
        Invoice a= new Invoice(3234, b, 15000);
        System.out.println(a.getCustomerName());
        System.out.println(a.getAmountAfterDiscount());
    }
}
