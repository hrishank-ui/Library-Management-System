import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void viewAllBooks() {
        if(books.isEmpty()) {
            System.out.println("No books are present");
        }

        else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public Book searchByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(String isbn) {
        Book book = searchByIsbn(isbn);

        if(book == null) {
            System.out.println("Book not found with ISBN: " + book);
        }

        else if(!book.isAvailable()) {
            System.out.println("Book is currently not available");
        }

        else {
            book.setAvailable(false);
            System.out.println("You have borrowed: " + book.getTitle());
        }
    }

    public void returnBook(String isbn) {
        Book book = searchByIsbn(isbn);

        if(book == null) {
            System.out.println("Book not found with ISBN: " + book);
        }

        else if(book.isAvailable()) {
            System.out.println("This book was not borrowed");
        }

        else {
            System.out.println("You have returned: " + book.getTitle());
        }
    }
}
