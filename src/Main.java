public class Main {
    public static void main(String[] args) {

        Movie firstMovie = new Movie(null, null, 0, false, 0, 0, 0, 0, null);

        firstMovie.setName("Top Gun Maverick");
        firstMovie.setPlanCategory("Básico");
        ;
        firstMovie.setDebutYear(2022);
        ;
        firstMovie.setPlanIncluded(false);
        
        double averageNote = 0;
        double sum = 0;

        firstMovie.rateTitle(10);
        firstMovie.rateTitle(5);
        firstMovie.rateTitle(6);
     

        
        // movieNotes.forEach(note -> {
            // System.out.println(note);
            // });
            
            System.out.println("Esse é o Screen Match");
            
            firstMovie.showCredits();
            
            firstMovie.planNotification();
            
            for (double nota : firstMovie.movieNotes) {
                if (nota > 0) {
                    sum += nota;
                    averageNote = sum / firstMovie.movieNotes.size();
                } else {
                    System.out.println("Erro");
                }
            }
            
            System.out.printf("Nota do filme: %.1f %n", averageNote);
            System.out.printf("Array de notas: %s%n", (firstMovie.movieNotes).toString());
        }
}
