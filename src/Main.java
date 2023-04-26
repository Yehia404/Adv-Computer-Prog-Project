import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        ArrayList<Person> persons  = new ArrayList<Person>();


        ArrayList<Book> books= new ArrayList<Book>();
        books.add(new Book("book1","yehia"));
        books.add(new Book("book2","marwan"));
        books.add(new Book("book3","ayman"));
        books.add(new Book("book4","kassab"));
        books.add(new Book("book5","omar"));



        Librarian l0= new Librarian("ab", "gay", "a", "a", "1", 1, "email1" );
        Librarian l1= new Librarian("aa", "gay", "b", "b", "2", 2, "email2" );
        Librarian l2= new Librarian("ac", "gay", "c", "c", "3", 4, "email3" );
        Librarian l3= new Librarian("ac", "gay", "D", "d", "4", 5, "email4" );
        Librarian l4= new Librarian("ac", "gay", "E", "e", "5", 6, "email5" );
        persons.add(l0);
        persons.add(l1);
        persons.add(l2);
        persons.add(l3);
        persons.add(l4);


        l0.addUserToQueue(2, "book3", persons, books);
        l0.addUserToQueue(1, "book3", persons, books);
        l1.addUserToQueue(4, "book3", persons, books);
        l2.addUserToQueue(3, "book3", persons, books);


        l3.removeUser(4, books.get(2).queue);

        System.out.println(books.get(2).queue.get(1));









    }
}
