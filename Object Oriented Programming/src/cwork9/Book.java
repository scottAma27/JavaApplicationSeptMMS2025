package cwork9;

public class Book{

    private String id; 
    private String title; 
    private String author; 
    private boolean borrowed;
    
    public Book(String id, String title, String author){ 
        this.id = id; 
        this.title = title; 
        this.author = author; 
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public boolean isBorrowed(){ 
        return borrowed; 
    }
    public void borrow(){ 
        borrowed = true; 
    }
    public void returnBook(){ 
        borrowed = false; 
    }
    public void display(){ 
        System.out.println(id + " | " + title + " | " + (borrowed?"Borrowed":"Available")); 
    }
} 

