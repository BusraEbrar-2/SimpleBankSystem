public class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
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


    public boolean login(String password) {
        return this.password.equals(password);// paramtere gelen 
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }
// this password sınıf içinde tanımlanmış olan  


}
