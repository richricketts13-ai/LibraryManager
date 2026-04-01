import java.util.Scanner;


public class LibraryApp {
public static void main(String[] args) {
    runMenu();
    
}

public static void runMenu() {

Library library = new Library();

Scanner input = new Scanner(System.in);

int choice = 0;

int idCounter = 1234; // Starting ID for members

while (true) {

System.out.println("Library Management System");
System.out.println("1. View Books");
System.out.println("2. View Members");
System.out.println("3. Borrow Book");
System.out.println("4. Return Book");
System.out.println("5. Add Book");
System.out.println("6. Add Member");
System.out.println("7. Exit");
System.out.print("Enter your choice: ");

choice = input.nextInt();
input.nextLine(); // Consume newline

switch (choice) {
    case 1 -> library.displayBooks();
    case 2 -> library.displayMembers();
    case 3 -> {

        System.out.println("Enter Member Name: ");
        String memberName = input.nextLine();
        Member member = library.findMember(memberName);
        System.out.println("Enter Book Title: ");
        String bookTitle = input.nextLine();
        Book book = library.findBook(bookTitle);
            if (member != null && book != null) {
            library.checkoutBook(member, book);
            }
        
        }
        case 4 ->{
            System.out.println("Enter Member Name: ");
            String memberName = input.nextLine();
            Member member = library.findMember(memberName);
            System.out.println("Enter Book Title: ");
            String bookTitle = input.nextLine();
            Book book = library.findBook(bookTitle);
            if (member != null && book != null) {
                library.returnBook(member, book);
            }
            
        }
        case 5 -> {
            System.out.println("Enter Book Title: ");
            String bookTitle = input.nextLine();
            System.out.println("Enter Book Author: ");
            String bookAuthor = input.nextLine();
            Book newBook = new Book(bookTitle,bookAuthor);
        
            library.addBook(newBook);
            
        }

        case 6 -> {
            System.out.println("Enter Member Name: ");
            String memberName = input.nextLine();
            Member newMember = new Member(memberName, idCounter);
            idCounter++;
            library.addMember(newMember);
        }
        case 7 -> {
            System.out.println("Exiting...");
            input.close();
            return;
        }
   }
}


































    }
    
}