package app;

public class Main {

    public static void main(String[] args) {

        int passwordLength = 10;
        String password = PasswordGenerator.generatePassword(passwordLength);

        System.out.println("\nЗгенерований пароль: " + password);
    }
}
