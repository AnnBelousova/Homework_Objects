import java.util.Scanner;

public class Library {
    private static Book[] books;
    static Scanner scanner = new Scanner(System.in);
    static int arrSize;

    public Library(int arrSize) {
        this.arrSize = arrSize;
    }


    public void addBook(Book[] books) {
        System.out.println("\nEnter author first and last name:");
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        Author author = new Author(firstName, lastName);
        System.out.println("Title:");
        String title = scanner.nextLine();
        System.out.println("Year:");
        int year = scanner.nextInt();
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = new Book(author, title, year);
                break;
            }
        }
    }

    public void printBookInfo(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = new Book(new Author("", ""), "", 0);
            } else {
                System.out.printf("\n%s: %s: %s", books[i].getAuthor().toString(), books[i].getTitle(), books[i].getYear());
            }
        }
        System.out.println();
    }

    public void findAndPrintBookByTitle(String title, Book[] books){
        for (int i = 0; i < arrSize; i++) {
            if(title.equals(books[i].getTitle())){
                System.out.println(books[i].getTitle() + " was published in " + books[i].getYear());
            }
            else{
                System.out.println("The book was not founded.");
            }
            return;
        }
    }

    public void changeBookByTitle(String title, int year, Book[] books) {
        for (int i = 0; i < arrSize; i++) {
            if(title.equals(books[i].getTitle())){
                books[i].setYear(year);
                System.out.println("The year of book: " + books[i].getTitle() + " has been changed to  " + books[i].getYear());
            }
            else{
                System.out.println("The book was not founded.");
            }
            return;
        }
    }
}
