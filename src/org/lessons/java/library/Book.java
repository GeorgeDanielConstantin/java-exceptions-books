package org.lessons.java.library;

public class Book {
    private String title;
    private int numberOfPages;
    private String author;
    private String publisher;
    public Book(String title, int numberOfPages, String author, String publisher) throws InvalidBook {

        if (title != null && !title.isBlank() && author != null && !author.isBlank() && publisher != null && !publisher.isBlank() && numberOfPages > 0) {
            this.title = title;
            this.numberOfPages = numberOfPages;
            this.author = author;
            this.publisher = publisher;
        } else {
            throw new InvalidBook();
        }
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }


    public void setTitle(String title) {
        if (title != null && !title.isBlank()) {
            this.title = title;
        }
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages < 0) {
            throw new IllegalArgumentException();
        }
        this.numberOfPages = numberOfPages;
    }

    public void setAuthor(String author) {
        if (author != null && !author.isBlank()) {
            this.author = author;
        }
    }

    public void setPublisher(String publisher) {
        if (publisher != null && !publisher.isBlank()) {
            this.publisher = publisher;
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Titolo='" + title + '\'' +
                ", Numero Pagine=" + numberOfPages + '\'' +
                ", Autore='" + author + '\'' +
                ", Editore='" + publisher +
                '}';
    }
}
