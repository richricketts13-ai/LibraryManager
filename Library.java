import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;
  

    //Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        
    }
    


    //Methods
    public void addBook(Book book) {

        if (book == null) {

            System.out.println("Error: Cannot add a null book.");

            return;
        } else if (books.contains(book)) {

            System.out.println("Error: Book already exists in the library.");

            return;
        } else {

            books.add(book);

            System.out.println("Book added: " + book.getTitle() + " by " + book.getAuthor());
        }
    }



    public void addMember(Member member) {

        if (member == null) {

            System.out.println("Error: Cannot add a null member.");

            return;
        } else if (members.contains(member)) {

            System.out.println("Error: Member already exists in the library.");

            return;
        } else {
            

            members.add(member);
            

            System.out.println("Member added: " + member.getName());
        }


    }





    public void returnBook(Member member, Book book) {

        if (member == null || book == null) {

            System.out.println("Error: Member and book cannot be null.");

            return;
        }
        else if (!members.contains(member)) {

            System.out.println("Error: Member does not exist in the library.");

            return;
        }
        else if (!books.contains(book)) {

            System.out.println("Error: Book does not exist in the library.");

            return;
        } 
        else if (!member.getBorrowedBooks().contains(book)) {
            System.out.println("Error: " + member.getName() + " has not borrowed " + book.getTitle() + ".");

            return;
        }

            member.returnBorrowedBook(book); 
            book.setAvailable(true);
            System.out.println("Book successfully returned: " + book.getTitle());
        

    }


    public void checkoutBook ( Member member, Book book) {

        if (book == null || member == null) {

            System.out.println("Error: Book and member cannot be null.");

            return;
        }
        else if (!members.contains(member)) {

            System.out.println("Error: Member does not exist in the library.");

            return;
        }
        else if (!books.contains(book)) {

            System.out.println("Error: Book does not exist in the library.");

            return;
        } 
        else if (!book.isAvailable() ){
            System.out.println("Error: Book is currently not available.");

            return;
        }

            member.borrowBook(book); 
            System.out.println("Book successfully borrowed: " + book.getTitle());
            
        

    }

        


    

public Book findBook(String title) {

if (title == null || title.trim().isEmpty()) {

        System.out.println("Error: Title cannot be null or empty.");

        return null;
    }
    else if (this.books.isEmpty()) {

        System.out.println("No books in the library.");

        return null;
    } 
        System.out.println("Searching for book: " + title);
    
    for (Book book : this.books) {

        if (book.getTitle().equalsIgnoreCase(title)) {

            return book;
        }
    }
    System.out.println("Book not found: " + title);

    return null;
}




public Member findMember(String name) {

    if (name == null || name.trim().isEmpty()) {

        System.out.println("Error: Name cannot be null or empty.");

        return null;
    }
    else if (this.members.isEmpty()) {

        System.out.println("No members in the library.");

        return null;
    } 
        System.out.println("Searching for member: " + name);
    
    for (Member member : this.members) {

        if (member.getName().equalsIgnoreCase(name)) {

            return member;
        }
    }
    System.out.println("Member not found: " + name);

    return null;
}






public void displayMembers() {

    if (members.isEmpty()) {

        System.out.println("No members in the library.");

        return;
    }
    System.out.println("Members of the library:");

    for (Member member : members) {

        System.out.println("- " + member.getName() + " (ID: " + member.getMemberId() + ")");
    }
}





public void displayBooks() {

    if (books.isEmpty()) {

        System.out.println("No books in the library.");

        return;
    }
    System.out.println("Books in the library:");
    for (Book book : books) {

        System.out.println("- " + book);
     }
  }
















}























