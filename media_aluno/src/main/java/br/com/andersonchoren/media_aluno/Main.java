package br.com.andersonchoren.media_aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        System.out.println("Digite a primeira nota:");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota:");
        float n2 = teclado.nextFloat();
        System.out.println("Digite a terceira nota:");
        float n3 = teclado.nextFloat();
        System.out.println("Digite a quarta nota:");
        float n4 = teclado.nextFloat();

        Aluno aluno = new Aluno(nome,n1,n2,n3,n4);
        System.out.printf("Média: %.1f\n",aluno.getMedia());
        System.out.println(aluno.verificarStatusDaAprovacao());

        if(aluno.deveFazerExame()){
            System.out.println("Digite a nota do exame:");
            float notaExame = teclado.nextFloat();
            System.out.println(aluno.verificarStatusDoExame(notaExame));
            System.out.printf("Média final: %.1f",aluno.getMedia());
        }
    }
}
