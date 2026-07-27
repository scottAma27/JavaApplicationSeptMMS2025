/*
	write a program that stores 10 book titles in an array and allow users to view all the 
	books, search for a book.
*/

import java.util.Scanner;

public class BookLibrary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int i = 0;
        String[] books = {
            "precious litle Darling", "Something must to kill a man", "History of Nigeria",
            "Pride of Africa", "The Hobbit", "Harry Potter",
            "How to handle situations", "Lord of the Rings",
            "Animal Farm", "Brave New World"
        };

        while(i<=10) {
            System.out.println("\n===== BOOK LIBRARY MENU =====");
            System.out.println("1. View All Books");
            System.out.println("2. Search for a Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if(choice == 1){
                System.out.println("\n--- ALL BOOKS ---");
                for(i = 0; i < books.length; i++) {
                    System.out.println((i+1) + ". " + books[i]);
                }
            }
            else if(choice == 2){
                System.out.print("Enter book title to search: ");
                String search = sc.nextLine().toLowerCase();
                boolean found = false;

                for(i = 0; i < books.length; i++){
                    if(books[i].toLowerCase().contains(search)){
                        System.out.printf("Found: %n",books[i]);
                        found = true;
                    }
                }
                // if(!found) System.out.println("Book not found");
				if(i == books.length - 1) {
					System.out.println("Book not found!");
            }
            else if(choice == 3){
                System.out.println("Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid choice!");
            }
		}
        sc.close();
    }
	}
}