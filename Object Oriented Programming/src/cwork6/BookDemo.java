package cwork6;

public class BookDemo{

    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book("Sapa.come", "Garri", 2000);
        
        b1.display();
        b2.display();
    }
}

