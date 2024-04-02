import java.util.*;

class Movie {
    String rating;
    double ratingValue;

    public Movie(String rating, double ratingValue) {
        this.rating = rating;
        this.ratingValue = ratingValue;
    }
}

public class MovieRatings {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("PG", 4.5));
        movies.add(new Movie("PG", 3.8));
        movies.add(new Movie("PG-13", 4.0));
        movies.add(new Movie("R", 3.2));
        movies.add(new Movie("R", 4.8));
        movies.add(new Movie("PG-13", 3.9));

       
        Map<String, Double> totalRating = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();

        for (Movie movie : movies) {
            if (!totalRating.containsKey(movie.rating)) {
                totalRating.put(movie.rating, 0.0);
                count.put(movie.rating, 0);
            }

            totalRating.put(movie.rating, totalRating.get(movie.rating) + movie.ratingValue);
            count.put(movie.rating, count.get(movie.rating) + 1);
        }

        Map<String, Double> avgRating = new HashMap<>();
        for (String category : totalRating.keySet()) {
            avgRating.put(category, totalRating.get(category) / count.get(category));
        }

        for (String category : avgRating.keySet()) {
            System.out.println("Category: " + category);
            System.out.println("Number of movies rated: " + count.get(category));
            System.out.println("Average rating: " + avgRating.get(category));
            System.out.println();
        }
    }
}
