import java.util.ArrayList;

abstract public class Person {
    private int ID;

    static int personCounter = 0;
    private String password;
    private final char TYPE;
    private final String FIRSTNAME;
    private final String LASTNAME;
    private String address;
    private int cellPhone;
    private String email;
    private boolean isBlocked =false;


    public Person(String password, String type, String FIRSTNAME, String LASTNAME, String address, int cellPhone, String email) {
        this.password = password;
        this.TYPE = type.charAt(0);
        this.FIRSTNAME = FIRSTNAME;
        this.LASTNAME = LASTNAME;
        this.address = address;
        this.cellPhone = cellPhone;
        this.email = email;

        this.ID = personCounter;
        personCounter++;

    }

    public int getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public char getTYPE() {
        return TYPE;
    }

    public String getFIRSTNAME() {
        return FIRSTNAME;
    }

    public String getLASTNAME() {
        return LASTNAME;
    }

    public String getAddress() {
        return address;
    }

    public int getCellPhone() {
        return cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public int searchBook(String name, ArrayList<Book> books){
        for (int i = 0; i< books.size(); i++){
            if (books.get(i).getName().equals(name)){
                System.out.println("The book "+ books.get(i).getName()+ "index is: "+i );
                return i;

            }
        }

        return -1;

    }
    public int searchMember(int id, ArrayList<Person> persons){
        for (int i = 0; i< persons.size(); i++){
            if (persons.get(i).getID() == id){
                System.out.println("First name:  "+persons.get(i).getFIRSTNAME()+ "\nLast name: "+persons.get(i).getLASTNAME()+ "\nEmail: "+persons.get(i).getEmail());
                return i;

            }
        }

        return -1;


    }
}
