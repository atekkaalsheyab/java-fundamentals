public class Review {
    private String body;
    private String movie_name;
    private String author;

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    private int numOfStar;

    public Review(String body, String author, int numOfStar) {
        this.body = body;
        this.author = author;
        this.numOfStar = numOfStar;

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

    public int getNumOfStar() {
        return numOfStar;
    }

    public void setNumOfStar(int numOfStar) {
        this.numOfStar = numOfStar;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numOfStar=" + numOfStar +
                '}';
    }
    public String toString(String movieName) {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numOfStar=" + numOfStar +", movie's name: "+movieName+
                '}';
    }

    }
