import java.util.ArrayList;

/**
 * Created by sailaksh on 26/02/15.
 */
public class Library {
    ArrayList<Book> bookList = new ArrayList<Book>();

    public boolean isBookPresentInLibrary(String bookTitle) {
        for (Book book : bookList) {
            if (book.getTitle() == bookTitle)
                return true;
        }
        return false;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void checkout(Book book) {
        if (isBookPresentInLibrary(book.getTitle())) {
            bookList.remove(book);
        }
    }


    public static void main(String[] args) {

        System.out.println("Welcome to Biblioteca");
    }
}
