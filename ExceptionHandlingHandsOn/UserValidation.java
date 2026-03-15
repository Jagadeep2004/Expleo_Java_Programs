package ExceptionHandlingHandsOn;

import java.util.Scanner;



class InvalidUsernameException extends Exception {

    public InvalidUsernameException(String message) {
        super(message);
    }
}


class InvalidPasswordException extends Exception {

    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class UserValidation {

    static String storedUsername = "Jagadeep_01";
    static String storedPassword = "Pass@123";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        try {

            validateUsername(username);
            validatePassword(password);

            if (username.equals(storedUsername) && password.equals(storedPassword)) {
                System.out.println("Welcome " + username);
            } else {
                System.out.println("Invalid username or password");
            }

        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    
    public static void validateUsername(String username) throws InvalidUsernameException {

        if (username.length() < 6 || username.length() > 30) {
            throw new InvalidUsernameException("InvalidUsernameException: Username must be 6-30 characters");
        }

        if (!username.matches("^[A-Za-z][A-Za-z0-9_]*$")) {
            throw new InvalidUsernameException("InvalidUsernameException: Username must start with letter and contain only alphanumeric or _");
        }
    }

    
    public static void validatePassword(String password) throws InvalidPasswordException {

        if (password.length() < 8) {
            throw new InvalidPasswordException("InvalidPasswordException: Password must be at least 8 characters");
        }

        if (!password.matches(".*[a-z].*")) {
            throw new InvalidPasswordException("InvalidPasswordException: Must contain lowercase letter");
        }

        if (!password.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("InvalidPasswordException: Must contain uppercase letter");
        }

        if (!password.matches(".*[0-9].*")) {
            throw new InvalidPasswordException("InvalidPasswordException: Must contain digit");
        }

        if (!password.matches(".*[!@#$%^&*()\\-+].*")) {
            throw new InvalidPasswordException("InvalidPasswordException: Must contain special character");
        }
    }
}