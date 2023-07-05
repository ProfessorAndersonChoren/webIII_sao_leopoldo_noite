package br.com.andersonchoren.media_aluno;

public class Aluno {
    private String nome;
    private float n1, n2, n3, n4, media;

    public Aluno(String nome, float n1, float n2, float n3, float n4) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        calcularMedia();
    }

    private void calcularMedia() {
        media = (n1 + n2 + n3 + n4) / 4;
    }

    public String verificarStatusDaAprovacao() {
        if (media >= 7)
            return String.format("Aluno %s foi aprovado!!!", nome);
        else if (media < 5)
            return String.format("Aluno %s foi reprovado!!!", nome);
        else
            return String.format("Aluno %s está em substituíção", nome);
    }

    public String verificarStatusDoExame(float notaExame) {
        media = (media + notaExame) / 2;
        if(media >= 5)
            return String.format("Aluno %s foi aprovado!!!",nome);
        else
            return String.format("Aluno %s foi reprovado!!!",nome);
    }

    public boolean deveFazerExame(){
        return media >= 5 && media < 7;
    }

    public float getMedia() {
        return media;
    }
}
