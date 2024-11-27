public class UserValid {
    private User[] users;

    public UserValid() {
        users = new User[]{
                new User("John", "John1234"),
                new User("Jane", "Jane1234"),
                new User("Jack", "Jack1234")
        };

    }
    public boolean isValid(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
                return true;

            }
        }
        return false;
    }
}


