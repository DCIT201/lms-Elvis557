import java.util.ArrayList;
import java.util.List;

public class Library{
    private List<Book> books; //list to store books in the library

    //Constructor to initialize the library
    public Library(){
        books = new ArrayList<>();
    }

    //Add a book to the library
    public void addBook(Book book){
        books.add(book);
    }

    //Remove a book from the library by title
    public boolean removeBook(String title){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                books.remove(book);
                return true;
            }
        }
        return false; //Book not found
    }

    //search for a book by title
    public Book searchBook(String title){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }

        return null; //Book not found
    }

    //display all books
    public void displayBooks(){
        for(Book book : books){
            System.out.println(book);
        }
    }
}