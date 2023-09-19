import java.util.ArrayList;

public class Theater extends Reviewing {
    private String name;
    private ArrayList<String> movies= new ArrayList<String>();

    public Theater(String name, ArrayList<String> movies) {
        this.name = name;
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }

    public void addMovie(String movieName){
        for (int i = 0; i < movies.size(); i++) {
            if (movies.contains(movieName)){
                System.out.println("The movie is already exists ");
                continue;
            }else {
                System.out.println("The movie added successfully ");
                movies.add(movieName);
            }
        }
    }

    public void removeMovie(String movieName){
        for (int i = 0; i < movies.size(); i++) {
            if (!(movies.contains(movieName))){
                System.out.println("The movie is not exists ");
                continue;
            }else {
                System.out.println("The movie removed successfully ");
                movies.remove(movieName);
            }
        }
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                '}';
    }


}
