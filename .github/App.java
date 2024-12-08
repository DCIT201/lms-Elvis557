public class App{
    public static void main(String[] args){
        //Create Library object
        Library library = new Library();

        //Add books to the library
        library.addBook(new Book("The Alchemist", "Romeo and Juliet"));
        library.addBook(new Book("Spiderman 2", "Titanic" ));
        library.addBook(new Book("Home alone", "Deadpool"));

        //Display all books
        System.out.println("Books in the library: ");
        library.displayBooks();

        //Create a patron
        Patron patron = new Patron("Elvis", 121);

        //Patron borrows a book
        Book bookToBorrow = library.searchBook("1984");
        if(bookToBorrow != null){
            patron.borrowBook(bookToBorrow);
        }

        //Display borrowed books
        patron.displayBorrowedBooks();

        //return the books
        patron.returnBook(bookToBorrow);

        // Display books in the library again
        System.out.println("\nBooks in the library after return:");
        library.displayBooks();


    }
}