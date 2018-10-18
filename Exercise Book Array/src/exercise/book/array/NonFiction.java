package exercise.book.array;

public class NonFiction extends Book {

    public NonFiction(String bookTitle) {
        super(bookTitle);
        setPrice();
    }

    @Override
    public void setPrice() {
        super.bookPrice = 37.99;
    }

    @Override
    public String toString() {
        return "NonFiction{" + "bookTitle=" + bookTitle + ", bookPrice=" + bookPrice + '}';
    }

}
