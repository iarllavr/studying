
import java.util.Locale;
import java.util.Scanner;

public class bee1004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int PROD = A * B;

        System.out.println("PROD = " + PROD);

    }
    
}
