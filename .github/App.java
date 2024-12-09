package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("My heart", "Elvis Boateng", 2020));
        library.addBook(new Book("Lord of the rings", "Janeth Ansong", 1919));

        // List all books
        System.out.println("Books in the library:");
        library.listBooks();

        // Create a patron
        Patron patron = new Patron("Aces", 1);

        // Borrow a book
        patron.borrowBook(new Book("My heart", "Elvis Boateng", 2020), library);

        // List borrowed books
        System.out.println("\nBorrowed books:");
        patron.listBorrowedBooks();

        // Return a book
        patron.returnBook(new Book("My heart", "Elvis Boateng", 2020), library);

        // Final library state
        System.out.println("\nBooks in the library after operations:");
        library.listBooks();
    }
}
