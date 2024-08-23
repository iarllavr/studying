import java.util.Locale;
import java.util.Scanner;

public class bee1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int diferenca = (A*B - C*D);

        System.out.println("DIFERENCA = " + diferenca);

    }
}
