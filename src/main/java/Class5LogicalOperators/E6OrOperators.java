package Class5LogicalOperators;

public class E6OrOperators {
    public static void main(String[] args) {
        String genre = "thriller";
        if (genre.equals("thriller") || genre.equals("HORRORS") || genre.equals("sci fi")) {
            System.out.println("I am going to watch this movie");
        } else {
            System.out.println("I don't like this genre");
        }

    }
}
