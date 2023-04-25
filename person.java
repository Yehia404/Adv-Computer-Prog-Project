abstract public class person {
    int ID;
    String Password;
    final String Type;
    final String FirstName;
    final String LastName;
    String Address;
    int CellPhone;
    String Email;
    boolean isBlocked =false;

    public person(int ID, String password, String type, String firstName, String lastName, String address, int cellPhone, String email) {
        this.ID = ID;
        Password = password;
        Type = type;
        FirstName = firstName;
        LastName = lastName;
        Address = address;
        CellPhone = cellPhone;
        Email = email;

    }
}
