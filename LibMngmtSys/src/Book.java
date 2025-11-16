public class Book {
    private String title;
    private String authorName;
    private String isbn;
    private boolean available;

    

    public Book (String title, String authorName, String isbn, boolean available) {
        this.title = title;
        this.authorName = authorName;
        this.isbn = isbn;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    @Override
    public String toString() {
        return "Book [title: " + title + ", authorName: " + authorName + ", isbn: " + isbn + ", available: " + (available ? "Yes" : "No")
                + "]";
    }
}