import java.util.ArrayList;

public class Resturant {
    int sum=0;

    private String name;
    private int numOfStars;
    private double price;
    public ArrayList<Review> ListOfReviews= new ArrayList<Review>();

    public Resturant(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Resturant() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(int numOfStars) {
        this.numOfStars = numOfStars;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addReview(Review rev){
        this.ListOfReviews.add( rev);
        for (int i = 0; i < ListOfReviews.size(); i++) {
            sum+=ListOfReviews.get(i).getStars();
        }
       numOfStars= sum/ListOfReviews.size();
        System.out.println(numOfStars);


    }

    @Override
    public String toString() {
        return "Resturant{" +
                "name='" + name + '\'' +
                ", numOfStars=" + numOfStars +
                ", price=" + price +
                '}';
    }
}
