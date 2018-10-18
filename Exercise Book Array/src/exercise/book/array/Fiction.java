package exercise.book.array;

public class Fiction extends Book {

    public Fiction(String bookTitle) {
        super(bookTitle);
        setPrice();
    }

    @Override
    public void setPrice() {
        super.bookPrice = 24.99;
    }

    @Override
    public String toString() {
        return "Fiction{" + "bookTitle=" + super.bookTitle + ", bookPrice=" + super.bookPrice + '}';
    }

}
