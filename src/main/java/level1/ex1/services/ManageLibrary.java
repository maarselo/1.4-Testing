package level1.ex1.services;

import level1.ex1.model.Library;

import java.util.Comparator;

public class ManageLibrary {

    private Library library;

    public ManageLibrary (Library library) {
        this.library = library;
    }

    public void addBook(String bookName) {
        if (this.library.getBooks().contains(bookName)){
            System.out.println("No possible duplicates.");
            return;
        }
        if (bookName.isEmpty()) {
            System.out.println("The name of the book cannot be empty");
            return;
        }
        this.library.getBooks().add(bookName);
        System.out.println("The book " + bookName +  " was successfully added ");
        sortLibrary();
    }

    public void showBooks() {
        this.library.getBooks().forEach(System.out::println);
    }

    public String catchBookByIndex(int number)
    {
        try {
            String book = this.library.getBooks().get(number);
            System.out.println("The book with index "+ number + " is " + book);
            return (book);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        return (null);
    }

    public void addBookOnIndex(int index, String bookName) {
        if (this.library.getBooks().contains(bookName)){
            System.out.println("No possible duplicates.");
            return;
        }
        if (bookName.isEmpty()) {
            System.out.println("The name cannot be empty");
            return;
        }
        this.library.getBooks().add(index, bookName);
        System.out.println("The book " + bookName +  " was successfully added on " + index + " index position.");
    }

    public void deleteBook(String bookName) {
        if (this.library.getBooks().remove(bookName)) {
            System.out.println("Book " + bookName + " deleted successfully.");
        } else {
            System.out.println("The book was not found.");
        }
        sortLibrary();
    }

    void sortLibrary() {
        this.library.getBooks().sort(Comparator.naturalOrder());
    }

}
