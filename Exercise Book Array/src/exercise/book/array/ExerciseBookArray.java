package exercise.book.array;

import java.util.ArrayList;

public class ExerciseBookArray {

    public static void main(String[] args) {

        Fiction firstBook = new Fiction("First ficton book");
        NonFiction firstNonFictionBook = new NonFiction("First Nonfiction book");

        System.out.println(firstBook);
        System.out.println(firstNonFictionBook);

        System.out.println("---------------ArrayList------------");
        ArrayList books = new ArrayList();
        books.add(new Fiction("First ficton book"));
        books.add(new NonFiction("First Nonfiction book"));
        books.add(new Fiction("Second ficton book"));
        books.add(new NonFiction("Second Nonfiction book"));
        books.add(new Fiction("Third ficton book"));
        books.add(new NonFiction("Third Nonfiction book"));
        books.add(new Fiction("Fourth ficton book"));
        books.add(new NonFiction("Fourth Nonfiction book"));
        books.add(new Fiction("Fifth ficton book"));
        books.add(new NonFiction("Fifth Nonfiction book"));

        for (Object book : books) {
            System.out.println(book);
        }

    }

}
