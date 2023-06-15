import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Entrada
        System.out.println("Digite a velocidade em m/s:");
        float velocidade = teclado.nextFloat();
        System.out.println("Digite o tempo decorrido em dias:");
        short tempo = teclado.nextShort();

        // Processamento
        // velocidade = velocidade * 3.6f;
        velocidade *= 3.6f;
        // tempo = tempo * 24;
        tempo *= 24;
        float distancia = velocidade * tempo;

        // Saída
        System.out.printf("A ave percorreu uma distância de %.0fkm",distancia);
    }
}
