import java.util.ArrayList;
import java.util.Scanner;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name="", body="", author="", movename="", description="";
        int number=0;
        float price=0;
/*
        System.out.println("Please enter the name of the Restaurant, and price: ");
        name=input.next();
        price=input.nextFloat();
        Restaurant res= new Restaurant(name,price);



//*************************************************************************************************************************

        System.out.println("Please enter the name of the Shop, description, and price: ");
        name=input.next();
        price=input.nextFloat();
        description=input.next();
        Shops shop= new Shops(name,description,price);
        System.out.println();
*/
//*************************************************************************************************************************

        System.out.println("Please enter the name of the Theater: ");
        name=input.next();
        Theater theater= new Theater(name);
        System.out.println();

        for (int i = 0; i <3 ; i++) {
            System.out.println("Enter the movie names: ");
            movename=input.next();
            theater.addMovie(movename);
        }
        System.out.println("The movies on the Theater are: ");

            System.out.println(theater.getMovies());

        System.out.println("Enter the name of the movie that you want to delete it: ");
        movename=input.next();
        theater.removeMovie(movename);


//*************************************************************************************************************************
/*
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter your review:\nYou have to write a body for the review, your name, and the rate: ");
            System.out.println("Your comment: ");
            body = input.next();
            System.out.println("Your name: ");
            author = input.next();
            System.out.println("the rate: [1-5]");
            number = input.nextInt();
            while (number < 1 || number > 5) {
                System.out.println("Please enter the rate again: [1-5]");
                number = input.nextInt();
            }
            res.addReview(new Review(body, author, number));
        }
        System.out.println(res.toString());


        for (int i = 0; i < 2; i++) {
            System.out.println("Enter your review:\nYou have to write a body for the review, your name, and the rate: ");
            System.out.println("Your comment: ");
            body = input.next();
            System.out.println("Your name: ");
            author = input.next();
            System.out.println("the rate: [1-5]");
            number = input.nextInt();
            while (number < 1 || number > 5) {
                System.out.println("Please enter the rate again: [1-5]");
                number = input.nextInt();
            }
            shop.addReview(new Review(body, author, number));
        }
        System.out.println(shop.toString());
*/
    }
}
