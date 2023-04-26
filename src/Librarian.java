import java.util.ArrayList;

public class Librarian extends Person {

    Librarian(String password, String TYPE, String FIRSTNAME, String LASTNAME, String address, int cellPhone, String email){
        super(password, TYPE, FIRSTNAME, LASTNAME, address, cellPhone, email);
    }

    public void addBook(Book book,  ArrayList<Book> books){
        books.add(book);

    }
    public void removeBook(String name,  ArrayList<Book> books){
        int index = searchBook(name, books);
        if (index >= 0){


            books.remove(index);
        }else {
            System.out.println("The book '"+ name+ "' was not found");
        }

    }
    public void addUser(Person person, ArrayList<Person> persons){
        persons.add(person);
    }

    public void removeUser(int id, ArrayList<Person> persons){            //can remove user from library or queue
        int index = searchMember(id, persons);
        if (index >=0){
            persons.remove(index);
            System.out.println("user with id: "+ id+ " is removed");
        }else {
            System.out.println("The person with id "+id+ " was not found");
        }


    } public void addUserToQueue(int id, String name, ArrayList<Person> persons, ArrayList<Book> books){
        int userIndex = searchMember(id, persons);

        if (userIndex >= 0){

            persons.get(userIndex).rentBook(name, books);
        }else {
            System.out.println("User was not found");
        }




    }


}
