import java.util.ArrayList;

public class Movie extends Title {

    public Movie(String name, String planCategory, int debutYear, boolean planIncluded, double review, double reviewNoteSum, int totalReviews,
            int durationInMinutes,  ArrayList<Double> movieNotes) {
        super(name, planCategory, debutYear, planIncluded, review, reviewNoteSum, totalReviews, durationInMinutes, movieNotes);

    }

}
