import java.util.ArrayList;

public class Shops extends Reviewing{
    private String name;
    private String description ;
    private float shopPrice;

    private ArrayList<Review> ListOfShopReview= new ArrayList<Review>();

    public Shops(String name, String description, float shopPrice) {
        this.name = name;
        this.description = description;
        this.shopPrice = shopPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(float shopPrice) {
        this.shopPrice = shopPrice;
    }

    @Override
    public String toString() {
        return "Shops{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", shopPrice=" + shopPrice +
                '}';
    }



}
