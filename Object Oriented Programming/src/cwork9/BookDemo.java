package cwork9;

public class BookDemo {

    public static void main(String[] args) {
        Librarian lib = new Librarian("Mrs. Andrea");
        Book b1 = new Book("B1", "Let my people go", "Sapa");
        Member m1 = new Member("M1", "John");
        
        lib.addBook(b1);
        lib.registerMember(m1);
        lib.displayAvailableBooks(); 
        m1.borrowBook(b1); 
        lib.displayAvailableBooks();
    }
}

