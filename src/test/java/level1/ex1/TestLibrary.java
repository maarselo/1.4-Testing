package level1.ex1;

import level1.ex1.model.Library;
import level1.ex1.services.ManageLibrary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestLibrary {
    private Library library;
    private ManageLibrary manageLibrary;

    @BeforeEach
    public void setup() {
        this.library = new Library();
        this.manageLibrary = new ManageLibrary(library);
    }

    @Test
    public void testAssertListNotNullAfterCreate() {
        assertNotNull(library.getBooks());
    }

    @Test
    public void testAssertsCorrectSize() {
        manageLibrary.addBook("Ratatouille");
        manageLibrary.addBook("The principe");
        assertEquals(2, library.getBooks().size());
    }

    @Test
    public void testIfIndexIsCorrect() {
        manageLibrary.addBook("Ratatouille");
        assertEquals("Ratatouille", manageLibrary.catchBookByIndex(0));
    }

    @Test
    public void testAddDuplicatesNotAllowed() {
        manageLibrary.addBook("Ratatouille");
        manageLibrary.addBook("Ratatouille");
        assertEquals(1, library.getBooks().size());
    }

    @Test
    public void testGetBookByIndex() {
        manageLibrary.addBook("Ratatouille");
        manageLibrary.addBook("The principe");
        assertEquals("The principe", manageLibrary.catchBookByIndex(1));
    }

    @Test
    public void testAddBookCheckIfChanges() {
        manageLibrary.addBook("Ratatouille");
        manageLibrary.addBook("Atenas");
        manageLibrary.addBook("Grecia");
        assertEquals(3, library.getBooks().size());
    }

    @Test
    public void testDeleteBookCheckIfChanges() {
        manageLibrary.addBook("Ratatouille");
        manageLibrary.addBook("Atenas");
        manageLibrary.addBook("Grecia");
        manageLibrary.deleteBook("Atenas");
        assertEquals(2, library.getBooks().size());
    }

    @Test
    public void testSortedAfterAdd() {
        manageLibrary.addBook("Zoo");
        manageLibrary.addBook("Animal Farm");
        manageLibrary.addBook("Moby Dick");

        List<String> sorted = library.getBooks();
        assertEquals(List.of("Animal Farm", "Moby Dick", "Zoo"), sorted);
    }
}
