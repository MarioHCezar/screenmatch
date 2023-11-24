package com.screenmatch.models;

import java.util.ArrayList;
import java.util.Calendar;

public class Title {
    private String name;
    private String planCategory;
    private int debutYear;
    private boolean planIncluded;
    private double review;
    public double reviewNoteSum;
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
        Calendar cal = Calendar.getInstance();
        cal.get(Calendar.YEAR);
        if (debutYear > 1800 && debutYear <= cal.get(Calendar.YEAR)) {

            this.debutYear = debutYear;
        } else {
            System.out.println("Ano incorreto");
        }
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

    public void setMovieNotes(ArrayList<Double> movieNotes) {
        this.movieNotes = movieNotes;
    }

    public ArrayList<Double> getMovieNotes() {
        return movieNotes;
    }

    public void showCredits() {
        System.out.println("Filme: " + getName());
        System.out.println("Ano de lançamento: " + getDebutYear());
    }

    public void planNotification() {
        if (getPlanIncluded() || getPlanCategory().equals("Plus")) {
            System.out.println("Filme disponível em seu plano");
        } else {
            System.out.println("Filme não disponível em seu plano. Faça o upgrade");
        }
    }

    public ArrayList<Double> rateTitle(double note) {
        movieNotes.add(note);
        return movieNotes;

    }
}
