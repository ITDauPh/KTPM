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
public class Book2 {
    private String name;
    private Author [] authors;
    private double price;
    private int qty=0;

    public Book2(String name, Author[] authors, double price,int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty=qty;
    }

    public Book2(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
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
        String array="";
        for (int i=0;i<authors.length-1;i++){
            array += authors[i].getName()+",";
        }
        array+= authors[authors.length-1].getName();
        return "Book[name= "+ this.getName()+", author={ "+ array  +"},price= "+this.getPrice()+", qty= "+this.getQty()+"]";
    }
    public String getAuthorNames(){
        String AuthorNames= "";
        for(int i=0;i<authors.length-1;i++){
            AuthorNames += authors[i].getName() + ",";
        }
        AuthorNames += authors[authors.length-1].getName();
        return AuthorNames;
    }
    public static void main(String[] args) {
        Author b= new Author("Dung_Vu", "dinhdung521@gmail.com", 'm');
        Author c= new Author("Dung_Vu1", "dinhdung5211@gmail.com", 'f');
        Author[] authors ={b,c};
        Book2 a= new Book2("Doramon",authors , 15000, 3);
        System.out.println(a.getAuthorNames());
        System.out.println(a.toString());
    }
}
