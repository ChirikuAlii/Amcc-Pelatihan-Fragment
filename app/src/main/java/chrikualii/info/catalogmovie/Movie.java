package chrikualii.info.catalogmovie;

/**
 * Created by chirikualii on 20/12/18
 * github.com/chirikualii
 */
public class Movie {

    String title;
    String overview;
    String date;

    public Movie(String title, String overview, String date) {
        this.title = title;
        this.overview = overview;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
