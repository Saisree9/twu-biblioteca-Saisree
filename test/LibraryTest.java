import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by sailaksh on 26/02/15.
 */
public class LibraryTest {
    private  Library library=new Library();
    private ArrayList<Book> bookList =new ArrayList<Book>();

    @Test
    public void should_test_book_present_in_library(){

        library.addBook(new Book("Java","j",1));

        assertEquals(true, library.isBookPresentInLibrary("Java"));
    }
}
