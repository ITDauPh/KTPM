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
public class Book1 {
    private String name;
    private Author author;
    private double price;
    private int qty=0;
    public Book1(){
    }

    public Book1(String name, Author author, double price,int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty=qty;
    }

    public Book1(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString(){
        Author a= new Author(author.getName(),author.getEmail(),author.getGender());
        return "Book[name= "+ this.getName()+", "+a.toString()+"price= "+this.getPrice()+" qty= "+this.getQty()+"]";
    }
//       public Author tacgia(){
//       Author author = null;
//       author.setName("Dung vu");
//       author.setEmail("dinhdung43@gmail.com");
//       author.setGender('m');
//       return author;
//    }
    public static void main(String[] args) {
        Author b= new Author("Dung vu","dinhdung43@gmail.com",'m');
        Book1 a= new Book1("Doremon",b,15000,5);
        System.out.println(a.toString());
    }
}
