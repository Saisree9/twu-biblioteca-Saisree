/**
 * Created by sailaksh on 26/02/15.
 */
public class Book {
    public String title;
    public String author;
    public int yearPublished;


    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

}
