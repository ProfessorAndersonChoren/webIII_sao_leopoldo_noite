import java.math.BigDecimal;
import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite o valor do capital investidos:");
        float capital = teclado.nextFloat();
        System.out.println("Digite a taxa de juros anual:");
        float taxa = teclado.nextFloat();
        System.out.println("Digite o período de aplicação em anos:");
        short periodo = teclado.nextShort();

        // Processamento
        taxa = taxa / 100;
        BigDecimal montante = BigDecimal.valueOf(
                capital * Math.pow(1+taxa,periodo)
        );

        // Saída
        System.out.printf("O montante é R$ %.2f",montante);
    }
}
