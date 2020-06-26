package ds;

public class User {

    public String userName;
    public String password;
    public String dob;

    public User(){}
    public User(String userName, String password, String dob) {
        this.userName = userName;
        this.password = password;
        this.dob = dob;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
