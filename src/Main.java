import java.util.*;

public class Main {
    public static void main(String[] args) {

        String nomeDoFilme = "Top Gun Maverick";
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        ArrayList<Double> notasDoFilme = new ArrayList<Double>();
        double mediaNotas = 0;
        double soma = 0;
        notasDoFilme.add(8.1);
        notasDoFilme.add(6.3);
        notasDoFilme.add(9.3);

        notasDoFilme.forEach(nota ->{
            System.out.println(nota);
        });

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: " + nomeDoFilme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        if (incluidoNoPlano) {
            System.out.println("Filme disponível em seu plano");
        } else {
            System.out.println("Filme não disponível em seu plano. Faça o upgrade");
        }

        for (double nota : notasDoFilme) {
            if (nota > 0) {
                soma += nota;
                System.out.println(nota);
                mediaNotas = soma / notasDoFilme.size();
            }
        }

        System.out.printf("Nota do filme: %.1f %n", mediaNotas);
    }
}
