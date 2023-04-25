abstract public class person {
    private int ID;
    private String Password;
    private final String Type;
    private final String FirstName;
    private final String LastName;
    private String Address;
    private int CellPhone;
    private String Email;
    private boolean isBlocked =false;

    public person(int ID, String Password, String Type, String FirstName, String LastName, String Address, int CellPhone, String Email) {
        this.ID = ID;
        this.Password = Password;
        this.Type = Type;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.CellPhone = CellPhone;
        this.Email = Email;
    }

    public int getID() {
        return ID;
    }

    public String getPassword() {
        return Password;
    }

    public String getType() {
        return Type;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getAddress() {
        return Address;
    }

    public int getCellPhone() {
        return CellPhone;
    }

    public String getEmail() {
        return Email;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setCellPhone(int cellPhone) {
        CellPhone = cellPhone;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
