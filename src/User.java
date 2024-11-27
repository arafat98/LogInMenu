public class User {
    private String username;
    private String password;

    //  Contructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    //getters for username
    public String getUsername() {
        return username;
    }
    //getters for password
    public String getPassword() {
        return password;
    }
}
