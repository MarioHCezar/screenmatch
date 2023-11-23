import java.util.ArrayList;

public class Title {
    private String name;
    private String planCategory;
    private int debutYear;
    private boolean planIncluded;
    private double review;
    private double reviewNoteSum;
    private int totalReviews;
    private int durationInMinutes;
    private ArrayList<Double> movieNotes = new ArrayList<Double>();

    public Title(
            String name,
            String planCategory,
            int debutYear,
            boolean planIncluded,
            double review,
            double reviewNoteSum,
            int totalReviews,
            int durationInMinutes,
            ArrayList<Double> movieNotes) {
        this.name = name;
        this.planCategory = planCategory;
        this.debutYear = debutYear;
        this.planIncluded = planIncluded;
        this.review = review;
        this.reviewNoteSum = reviewNoteSum;
        this.totalReviews = totalReviews;
        this.durationInMinutes = durationInMinutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPlanCategory(String planCategory) {
        this.planCategory = planCategory;
    }

    public String getPlanCategory() {
        return planCategory;
    }

    public void setDebutYear(int debutYear) {
        this.debutYear = debutYear;
    }

    public int getDebutYear() {
        return debutYear;
    }

    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }

    public boolean getPlanIncluded() {
        return planIncluded;
    }

    public void setReview(double review) {
        this.review = review;
    }

    public double getReview() {
        return review;
    }

    public void setTotalReviews(int totalReviews) {
        this.totalReviews = totalReviews;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    void showCredits() {
        System.out.println("Filme: " + getName());
        System.out.println("Ano de lançamento: " + getDebutYear());
    }

    void planNotification() {
        if (getPlanIncluded() || getPlanCategory().equals("Plus")) {
            System.out.println("Filme disponível em seu plano");
        } else {
            System.out.println("Filme não disponível em seu plano. Faça o upgrade");
        }
    }

    void rateTitle(double note) {
        movieNotes.add(note);
        reviewNoteSum += note;
        totalReviews++;
    }
}
