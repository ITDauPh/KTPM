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
public class Author {
    private String name;
    private String email;
    private char   gender;

    public Author(){
        
    }
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public String toString(){
        return "Author[name= "+ name+ ", email= "+ email+", gender= "+gender+"]";
    }
//    public Author tacgia(String name1, String 1, char gender1){
//       Author author = null;
//       author.setName(name);
//       author.setEmail(email);
//       author.setGender(gender);
//            return author;
//    }
//    public Author getAuthor(){
//       Author author = new Author("Dung Vu","dinhdung32@gmail.com",'m');
//       return author;
////    }
    public static void main(String[] args) {
        Author a= new Author("Dung_Vu", "dinhdung521@gmail.com", 'm');
        System.out.println(a.toString());
    }
}
