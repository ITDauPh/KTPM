/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Week3_4;

import java.util.jar.Attributes;

/**
 *
 * @author Admin
 */
public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
        public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
        public String toString(){
            return customer.getName()+"("+id+")"+ ", balance= "+balance;
        }
        public String getCustomerName(){
            return customer.getName();
        }
        public void deposit(double amount){
             this.balance+= amount;
             System.out.println("so tien sau khi nap them vao la`:"+ this.balance);
             
        }
        public void withdraw(double amount){
            if(amount<=balance){
                this.balance-= amount;
                System.out.println("so tien sau khi rut la:"+this.balance);
            }
            else{
                System.out.println("amount withdrawn exceeds the current balance!");
            }
        }
        public static void main(String[] args) {
            Customer b= new Customer(501, "Van Dau", 'm');
            Account a= new Account(130, b);
            System.out.println(a.toString());
            System.out.println(a.getCustomerName());
            a.deposit(300000);
            a.withdraw(150000);
    }
}
