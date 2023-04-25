import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        ArrayList<Person> person  = new ArrayList<Person>();


        ArrayList<Book> books= new ArrayList<Book>();
        books.add(new Book("book1","yehia"));
        books.add(new Book("book2","marwan"));
        books.add(new Book("book3","ayman"));
        books.add(new Book("book4","kassab"));
        books.add(new Book("book5","omar"));
        books.remove(2);
        System.out.println(books.get(2).getName());

        Librarian l0= new Librarian("ab", "gay", "a", "a", "1234", 123, "email1" );
        Librarian l1= new Librarian("aa", "gay", "a", "a", "1234", 123, "email1" );
        Librarian l2= new Librarian("ac", "gay", "a", "a", "1234", 123, "email1" );

        System.out.println(l2.getID());


    }
}
