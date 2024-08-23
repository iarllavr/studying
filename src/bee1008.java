import java.util.Locale;
import java.util.Scanner;

public class bee1008 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroFuncionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        double valorHora = scanner.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        String salario2c = String.format("%.2f", salario);

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println("SALARY = U$ " + salario2c);
        
    }
}