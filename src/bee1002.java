import java.util.Locale;
import java.util.Scanner;

public class bee1002 {
    public static void main(String[] args) {
        
        double π = 3.14159;
        
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
        
        double raio = scanner.nextDouble();


        double area = π * (raio*raio);
        String resultado = String.format("%.4f", area);
        System.out.println("A=" + resultado);

    }
}


