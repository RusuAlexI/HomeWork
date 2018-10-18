package exercise.book.array;

public abstract class Book {

    String bookTitle;
    double bookPrice;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;

    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public abstract void setPrice();
}
