
import java.util.Scanner;

public class PasswordHasher {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password:");
        String password = sc.nextLine();

        // SHA-256 hash
        String shaHash = SHA256Hasher.hash(password);
        System.out.println("SHA-256: " + shaHash);

        // BCrypt hash
        String bcryptHash = BCryptHasher.hash(password);
        System.out.println("BCrypt: " + bcryptHash);

        // Verify
        System.out.print("Verify password: ");
        String input = sc.nextLine();
        boolean isMatch = BCryptHasher.verify(input, bcryptHash);
        System.out.println("BCrypt Match: " + isMatch);
    }
}

