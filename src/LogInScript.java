import java.util.Scanner;

public class LogInScript {
    public static void main(String[] args) {
        UserValid users = new UserValid();
        Scanner scanner = new Scanner(System.in);
        int attempts = 3; //it ceates only 3 attempts to log in
        boolean success = false;

        while (attempts > 0 && !success) {

            System.out.println("Enter your username: ");
            String username = scanner.nextLine();
            System.out.println("Enter your password: ");
            String password = scanner.nextLine();

            // check the username and password with the existing credentials
            success = users.isValid(username, password);


            if (success) { // if the credentials matches it displays
                System.out.println("You are logged in!");
            } else {
                System.out.println("You are not logged in!");
                attempts--;
                System.out.println("Attempts: " + attempts);

            }

        }
        if (!success) {
            System.out.println("You are not logged in! - Account blocked");
        }
        scanner.close();
    }

}