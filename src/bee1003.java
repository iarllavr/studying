
import java.util.Locale;
import java.util.Scanner;

public class bee1003 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int soma = A+B;

        System.out.println("SOMA = " + soma);

    }   
}
