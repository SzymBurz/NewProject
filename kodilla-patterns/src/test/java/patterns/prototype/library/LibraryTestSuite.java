package patterns.prototype.library;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        Book b1 = new Book("xcv","yui",LocalDate.of(2011, 01, 01));
        Book b2 = new Book("qwe","dfg",LocalDate.of(2012, 01, 01));
        Book b3 = new Book("asd","jhg",LocalDate.of(2013, 01, 01));
        Book b4 = new Book("rty","sfd",LocalDate.of(2014, 01, 01));



        Library library = new Library("Library no.1");
        library.books.add(b1);
        library.books.add(b2);
        library.books.add(b3);
        library.books.add(b4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library no. 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library no.3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(b1);

        assertEquals(3,library.getBooks().size());
        assertEquals(3,clonedLibrary.getBooks().size());
        assertEquals(4, deepClonedLibrary.getBooks().size());
    }
}
