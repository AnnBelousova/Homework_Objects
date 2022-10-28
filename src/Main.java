import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[5];
        Scanner scanner = new Scanner(System.in);
        int choice;
        Book book1 = new Book(new Author("Andrey", "Lykov"), "Fiction Book", 2015);
        Book book2 = new Book(new Author("Kirill", "Ezhov"), "Fantastic Book", 1999);
        books[0] = book1;
        books[1] = book2;
        book2.setYear(2000);
        String title = "Fiction Book";
        int year = 2020;

        Library library = new Library(books.length);
        library.addBook(books);
        System.out.println();
        System.out.println("Select the action: " +
                "\n1 - To display book list" +
                "\n2 - To add book" +
                "\n3 - To find and print book by title" +
                "\n4 - To change published year" +
                "\n0 - To exit");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                library.printBookInfo(books);
                return;
            case 2:
                library.addBook(books);
                library.printBookInfo(books);
                return;
            case 3:
                library.findAndPrintBookByTitle(title, books);
                return;
            case 4:
                library.changeBookByTitle(title, year, books);
                return;
            case 0:
                System.exit(0);
        }

    }
}