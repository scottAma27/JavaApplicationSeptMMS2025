package cwork9;
 
import java.util.ArrayList;

public class Librarian {

    private String name; 
    
    private ArrayList<Book> books = new ArrayList<>(); 
    private ArrayList<Member> members = new ArrayList<>();
    
    public Librarian(String name){ 
        this.name=name; 
    }
    public void addBook(Book b){ 
        books.add(b); 
    }
    public void registerMember(Member m){ 
        members.add(m); 
    }
    public void displayAvailableBooks(){ 
        for(Book b: books) 
            if(!b.isBorrowed()) b.display(); 
    }
}

