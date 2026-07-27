package cwork9;

import java.util.ArrayList;
public class Member{
    private String id; 
    private String name; 
    
    private ArrayList<Book> books = new ArrayList<>();
    
    public Member(String id, String name){ 
        this.id=id; 
        this.name=name; 
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    
    public void borrowBook(Book b){ 
        if(!b.isBorrowed()){ 
            b.borrow(); books.add(b); 
            System.out.println(name+" borrowed "+b); 
        } 
    }
    public void returnBook(Book b){ 
        if(books.remove(b)){ 
            b.returnBook(); System.out.println(name+" returned "+b); 
        } 
    }
}