import java.util.Locale;
import java.util.Scanner;

public class bee1006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double MEDIA = (A*2 + B*3 + C*5)/10;

        String media3c = String.format("%.1f", MEDIA);

        System.out.println("MEDIA = " + media3c);

    }
}
