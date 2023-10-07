import java.util.Scanner;

public class PasswordEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        System.out.print("Enter the encryption key (integer value): ");
        int encryptionKey = scanner.nextInt();

        String encryptedPassword = encryptPassword(password, encryptionKey);
        System.out.println("Encrypted password: " + encryptedPassword);
    }

    private static String encryptPassword(String password, int encryptionKey) {
        StringBuilder encryptedPassword = new StringBuilder();

        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);

            if (Character.isLetter(currentChar)) {
                char encryptedChar = (char) (((currentChar - 'a' + encryptionKey) % 26) + 'a');
                encryptedPassword.append(encryptedChar);
            } else {
                encryptedPassword.append(currentChar);
            }
        }

        return encryptedPassword.toString();
    }
}
