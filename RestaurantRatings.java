import java.util.*;

class Restaurant {
    double rating;

    public Restaurant(double rating) {
        this.rating = rating;
    }
}

public class RestaurantRatings {
    public static void main(String[] args) {
        List<Restaurant> ratings = new ArrayList<>();
        ratings.add(new Restaurant(4.2));
        ratings.add(new Restaurant(7.5));
        ratings.add(new Restaurant(9.8));
        ratings.add(new Restaurant(3.5));
        ratings.add(new Restaurant(8.1));
        ratings.add(new Restaurant(6.4));
        ratings.add(new Restaurant(2.7));

        double[][] ranges = {
            {1, 5},
            {6, 10}
        };

        // Initialize counters for each range and total rating for each range
        int[] restaurantsInRange = new int[ranges.length];
        double[] totalRating = new double[ranges.length];

        // Analyze ratings
        for (Restaurant restaurant : ratings) {
            for (int i = 0; i < ranges.length; i++) {
                double[] range = ranges[i];
                if (restaurant.rating >= range[0] && restaurant.rating <= range[1]) {
                    restaurantsInRange[i]++;
                    totalRating[i] += restaurant.rating;
                    break;
                }
            }
        }

        double[] avgRating = new double[ranges.length];
        for (int i = 0; i < ranges.length; i++) {
            avgRating[i] = totalRating[i] / restaurantsInRange[i];
        }

   
        for (int i = 0; i < ranges.length; i++) {
            double[] range = ranges[i];
            System.out.println("Restaurants rated within range " + range[0] + "-" + range[1] + ": " + restaurantsInRange[i]);
            System.out.println("Average rating: " + avgRating[i]);
            System.out.println();
        }
    }
}
