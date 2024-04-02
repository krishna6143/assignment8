import java.util.*;

class BookReview {
    int rating;

    public BookReview(int rating) {
        this.rating = rating;
    }
}

public class BookReviews {
    public static void main(String[] args) {
        List<BookReview> reviews = new ArrayList<>();
        reviews.add(new BookReview(4));
        reviews.add(new BookReview(7));
        reviews.add(new BookReview(9));
        reviews.add(new BookReview(2));
        reviews.add(new BookReview(8));
        reviews.add(new BookReview(3));
        reviews.add(new BookReview(6));

        int[][] ranges = {
            {1, 5},
            {6, 10}
        };

        int[] reviewsInRange = new int[ranges.length];
        int[] positiveReviews = new int[ranges.length];
        int[] neutralReviews = new int[ranges.length];
        int[] negativeReviews = new int[ranges.length];

        for (BookReview review : reviews) {
            for (int i = 0; i < ranges.length; i++) {
                int[] range = ranges[i];
                if (review.rating >= range[0] && review.rating <= range[1]) {
                    reviewsInRange[i]++;
         
                    if (review.rating >= 8) {
                        positiveReviews[i]++;
                    } else if (review.rating >= 6 && review.rating <= 7) {
                        neutralReviews[i]++;
                    } else {
                        negativeReviews[i]++;
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < ranges.length; i++) {
            int[] range = ranges[i];
            System.out.println("Books reviewed within range " + range[0] + "-" + range[1] + " stars: " + reviewsInRange[i]);
            System.out.println("Positive reviews: " + positiveReviews[i]);
            System.out.println("Neutral reviews: " + neutralReviews[i]);
            System.out.println("Negative reviews: " + negativeReviews[i]);
            System.out.println();
        }
    }
}
