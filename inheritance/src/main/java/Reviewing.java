import java.util.ArrayList;

abstract public class Reviewing {

    private int numberOfStars=0, sum=0;

    public int getNumberOfStars() {

        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars/ListOfReview.size();
    }

    public ArrayList<Review> ListOfReview= new ArrayList<Review>();

    public void addReview(Review review){

        if (ListOfReview.contains(review)){
            System.out.println("The review is already exists");
        }else {
            ListOfReview.add(review);
            for (int i = 0; i < ListOfReview.size(); i++) {
                sum+=review.getNumOfStar();
            }
            numberOfStars=sum/ListOfReview.size();
            System.out.println("The number os stars is: "+numberOfStars);

        }
    }

    public void addReview(Review review, String movieName) {
        if (ListOfReview.contains(review)){
            System.out.println("The review is already exists");
        }else {
            review.setMovie_name(movieName);
            ListOfReview.add(review);

            for (int i = 0; i < ListOfReview.size(); i++) {
                sum+=review.getNumOfStar();
            }
            numberOfStars=sum/ListOfReview.size();
            System.out.println("The number os stars is: "+numberOfStars);
        }
    }

    @Override
    public String toString() {
        return "Reviewing{" +
                "numberOfStars=" + numberOfStars +
                ", ListOfReview=" + ListOfReview +
                '}';
    }
}