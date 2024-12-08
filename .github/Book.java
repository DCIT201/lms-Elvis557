public class Book{
    private String title;
    private String author;
    public boolean isAvailable;

    //constructor to initialize the book details
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Default: the book is available
    }

    //getter and setter methods
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean available){
        isAvailable = available;
    }

    //toString() method for displaying book details
    @Override
    public String toString(){
        return "Book [Title=" + title + ", Author=" + author + ", Available=" + isAvailable + "]";
    }
}
