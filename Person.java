abstract public class Person {
    private int ID;
    private String password;
    private final String TYPE;
    private final String FIRSTNAME;
    private final String LASTNAME;
    private String address;
    private int cellPhone;
    private String email;
    private boolean isBlocked =false;


    public Person(int ID, String password, String TYPE, String FIRSTNAME, String LASTNAME, String address, int cellPhone, String email) {
        this.ID = ID;
        this.password = password;
        this.TYPE = TYPE;
        this.FIRSTNAME = FIRSTNAME;
        this.LASTNAME = LASTNAME;
        this.address = address;
        this.cellPhone = cellPhone;
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public String getTYPE() {
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
}
