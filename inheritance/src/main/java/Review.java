import java.util.Scanner;

public class Review extends Resturant{
    private String body;
    private int stars ;
    private String author;

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Review(String body, int numOfStars, String author) {

        this.body = body;
        this.stars = numOfStars;
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", numOfStars=" + stars +
                ", author='" + author + '\'' +
                '}';
    }
}
