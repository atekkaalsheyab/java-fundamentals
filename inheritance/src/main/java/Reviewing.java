import java.util.ArrayList;

abstract public class Reviewing {

    public int numberOfStars=0, sum=0;
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
        }
    }

    public void addReview(Review review, String movieName) {

    }

    }