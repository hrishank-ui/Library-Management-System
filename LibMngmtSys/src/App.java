import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== LIBRARY MANAGEMENT SYSTEM MENU ======");
            System.out.println("1. Add a new book");
            System.out.println("2. View all books");
            System.out.println("3. Borrow book by ISBN");
            System.out.println("4. Retrun book by ISBN");
            System.out.println("5. Exit");

            System.out.println();

            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("Enter title of the book: ");
                    String title = sc.nextLine();
                    System.out.println("Enter author name: ");
                    String authorName = sc.nextLine();
                    System.out.println("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    library.addBook(new Book(title, authorName, isbn, true));
                    break;
                
                case 2:
                    library.viewAllBooks();
                    break;
                
                case 3:
                    System.out.print("Enter ISBN to borrow: ");
                    String borrowIsbn = sc.nextLine();
                    library.borrowBook(borrowIsbn);
                    break;

                case 4:
                    System.out.print("Enter ISBN to return: ");
                    String returnIsbn = sc.nextLine();
                    library.returnBook(returnIsbn);
                    break;

                case 5:
                    System.out.println("Exiting the system...");
                    break;
            }
        } while(choice != 5);

        sc.close();
    }
}
