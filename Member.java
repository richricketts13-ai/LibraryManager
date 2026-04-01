import java.util.ArrayList;


public class Member {

    //Fields
    private String name;
    private int memberId;
    private ArrayList<Book> borrowedBooks;

    //Constructor
    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void viewBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has not borrowed any books.");
        } else {
            System.out.println(name + " has borrowed the following books:");
            for (Book book : borrowedBooks) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    //Methods 

    
    public void borrowBook(Book book) {
        if (book == null) {

            System.out.println("Error: Book doesn't exist");
            
            return;
        }  
            else if (borrowedBooks.contains(book)) {

            System.out.println(name + " has already borrowed " + book.getTitle() + ".");
        } 
        else if (book.isAvailable()) {

            borrowedBooks.add(book);

            book.setAvailable(false);

            System.out.println(name + " has borrowed " + book.getTitle() + " by " + book.getAuthor());
        } else {

                System.out.println("Sorry, " + book.getTitle() + " is currently not available.");
            }

    }


        
        
        
        
        
        
        
        













    
    public void returnBorrowedBook(Book book) {
        if (book == null) {
            System.out.println("Error: Book doesn't exist");
            return;
        }  
           else if (borrowedBooks.contains(book)) {

            borrowedBooks.remove(book);

            book.setAvailable(true);

            System.out.println(name + " has returned " + book.getTitle() + " by " + book.getAuthor());
        } else {
                System.out.println(name + " cannot return " + book.getTitle() + " because it was not borrowed.");
            }
    
        }
        











}
