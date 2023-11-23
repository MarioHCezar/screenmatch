import java.util.*;

public class Main {
    public static void main(String[] args) {

        Movie firstMovie = new Movie(null, null, 0, false, 0, 0, 0);

        firstMovie.setName("Top Gun Maverick");
        firstMovie.setPlanCategory("Básico");;
        firstMovie.setDebutYear(2022); ;
        firstMovie.setPlanIncluded(false);
        ArrayList<Double> movieNotes = new ArrayList<Double>();
        double averageNote = 0;
        double sum = 0;
        movieNotes.add(8.1);
        movieNotes.add(6.3);
        movieNotes.add(9.3);
        movieNotes.add(8.5);

        movieNotes.forEach(nota -> {
            System.out.println(nota);
        });

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: " + firstMovie.getName());
        System.out.println("Ano de lançamento: " + firstMovie.getDebutYear());

        if (firstMovie.getPlanIncluded() || firstMovie.getPlanCategory().equals("Plus")) {
            System.out.println("Filme disponível em seu plano");
        } else {
            System.out.println("Filme não disponível em seu plano. Faça o upgrade");
        }

        for (double nota : movieNotes) {
            if (nota > 0) {
                sum += nota;
                System.out.println(nota);
                averageNote = sum / movieNotes.size();
            } else {
                System.out.println("Erro");
            }
        }

        System.out.printf("Nota do filme: %.1f %n", averageNote);
    }
}
