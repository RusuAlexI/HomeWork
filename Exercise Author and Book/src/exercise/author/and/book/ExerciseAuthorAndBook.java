
package exercise.author.and.book;


public class ExerciseAuthorAndBook {

    public static void main(String[] args) {
        Author author=new Author("Frst Author Name", "First Author Email", 'M');
        System.out.println(author.toString());
        Author author2=new Author("Second Author Name", "Second Author Email", 'F');
        System.out.println(author2.toString());
        Book book1=new Book("Example Book1 Name", author, 45);
        Book book2=new Book("Example Book2 Name", author2, 70, 1);
        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
    
}
