// package libararyproject;

class Book {
    private String title;
    private String author;
    private int id; // Unique identification number

    // Constructor to set title, author, and generate a unique ID
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = generateUniqueId();
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for ID (no setter to prevent external modification)
    public int getId() {
        return id;
    }

    // Generate a unique ID (for demonstration purposes)
    private static int nextId = 1;
    private int generateUniqueId() {
        return nextId++;
    }
}

// Library class managing a collection of Book objects
class Library {
    private Book[] books; // Array to store books
    private int numBooks; // Number of books in the library

    // Constructor to initialize the library
    public Library(int capacity) {
        books = new Book[capacity];
        numBooks = 0;
    }

    // Add a book to the library
    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
            System.out.println("Book added: " + book.getTitle());
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Borrow a book by ID
    public void borrowBook(int id) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getId() == id) {
                System.out.println("Book borrowed: " + books[i].getTitle());
                // Implement borrowing logic (e.g., mark as borrowed)
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
    }

    // Return a book by ID
    public void returnBook(int id) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getId() == id) {
                System.out.println("Book returned: " + books[i].getTitle());
                // Implement return logic (e.g., mark as available)
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
    }
}

// Main class to demonstrate library functionality
public class Main {
    public static void main(String[] args) {
        Library library = new Library(10); // Create a library with a capacity of 10 books

        // Add some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        library.addBook(book1);
        library.addBook(book2);

        // Borrow and return books (using IDs)
        library.borrowBook(book1.getId());
        library.returnBook(book1.getId());
    }
}
