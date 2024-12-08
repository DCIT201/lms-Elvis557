import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private int id;
    private List<Book> borrowedBooks;

    //constructor
    public Patron(String name, int id){
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    //Borrow a book
    public void borrowedBook(Book book){
        if(book.isAvailable){
            borrowedBooks.add(book);
            book.setAvailable(false); // Mark the book as unavailable
            System.out.println(name + " borrowed: " + book.getTitle());
        }
        else{
            System.out.println("The book was not borrowed by " + name);
        }
    }

    //return a book
    public void returnBook(Book book){
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true); // Mark the book as available
            System.out.println(name + " returned: " + book.getTitle());
        }
        else {
            System.out.println("The book was not borrowed by " + name);
        }
    }

    //display borrowed books
    public void displayBorrowedBooks(){
        System.out.println("Books borrowed by " + name + ":");
        for(Book book : borrowedBooks){
            System.out.println(book.getTitle());
        }
    }
}