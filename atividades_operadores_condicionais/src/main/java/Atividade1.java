import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da hipotenusa:");
        byte hipotenusa = teclado.nextByte();
        System.out.println("Digite o valor do cateto 1:");
        byte cateto_um = teclado.nextByte();
        System.out.println("Digite o valor do cateto 2:");
        byte cateto_dois = teclado.nextByte();

        if(hipotenusa >= cateto_um + cateto_dois)
            System.out.println("NÃO FORMA UM TRIÂNGULO!!!");
        else{
            // Se for um triângulo
            double quadradoDaHipotenusa = hipotenusa * hipotenusa;
            double quadradoDoCatetoUm = cateto_um * cateto_um;
            double quadradoDoCatetoDois = cateto_dois * cateto_dois;

            if(quadradoDaHipotenusa > quadradoDoCatetoUm + quadradoDoCatetoDois)
                System.out.println("TRIÂNGULO OBTUSÂNGULO");
            else if(quadradoDaHipotenusa < quadradoDoCatetoUm + quadradoDoCatetoDois)
                System.out.println("TRIÂNGULO ACUTÂNGULO");

            if(hipotenusa == cateto_um && cateto_um == cateto_dois)
                System.out.println("TRIÂNGULO EQUILÁTERO");
            else if(hipotenusa == cateto_um || hipotenusa == cateto_dois || cateto_um == cateto_dois)
                System.out.println("TRIÂNGULO ISÓCELES");
            else
                System.out.println("TRIÂNGULO RETÂNGULO");
        }
    }
}
