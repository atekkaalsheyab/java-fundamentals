import java.util.ArrayList;

public class Restaurant extends Reviewing {
    private String name;
    private int num;
    private float price;
    int sum=0;

    private ArrayList<Review> ListOfReview= new ArrayList<Review>();

    public Restaurant(String name, float price) {
        this.name = name;
        this.num = num;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

   /* public void addReview(Review review) {
        super.addReview(review);
        num=numberOfStars;
    }*/
        @Override
    public String toString() {
            System.out.println(super.toString());
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", price=" + price +
                '}';
    }

}
