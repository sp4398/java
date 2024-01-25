import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book {
    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}

public class BookSorting {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter", 1925));
        books.add(new Book("New India", 2020));
        books.add(new Book("The Discovery of India", 1946));
        books.add(new Book("Two States", 2009));

        System.out.println("Books before sorting:");
        displayBooks(books);

        Collections.sort(books, Comparator.comparingInt(Book::getPublicationYear));

        System.out.println("\nBooks after sorting by publication year:");
        displayBooks(books);
    }

    private static void displayBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
