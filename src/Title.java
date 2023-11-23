public class Title {
    private String name;
    private String planCategory;
    private int debutYear;
    private boolean planIncluded;
    private double review;
    private int totalReviews;
    private int durationInMinutes;

    public Title(
            String name,
            String planCategory,
            int debutYear,
            boolean planIncluded,
            double review,
            int totalReviews,
            int durationInMinutes) {
        this.name = name;
        this.planCategory = planCategory;
        this.debutYear = debutYear;
        this.planIncluded = planIncluded;
        this.review = review;
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
}
