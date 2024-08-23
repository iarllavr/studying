
import java.util.Locale;
import java.util.Scanner;

public class bee1005 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double media = (A*3.5 + B*7.5) / 11;

        String M = String.format("%.5f", media);

        System.out.println("MEDIA = " + M);

    }
    
}
