public class Book {
    //Fields
    private String title;

    private String author;

    private boolean isAvailable;

    //Constructor
    public Book (String title, String author) {

        this.title = title;

        this.author = author;

        this.isAvailable = true; //Default to available when a book is created
    }

    //Getters and Setters
    public String getTitle() {

        return title;
    }


    public String getAuthor() {

        return author;
    }


    public boolean isAvailable() {

        return isAvailable;
    }



    public void setAvailable(boolean available) {

        isAvailable = available;
    }

    //toString method for easy display
    @Override
    public String toString() {
        return title + " by " + author + " - " + (isAvailable ? "Available" : "Checked Out");
    }
            



































}