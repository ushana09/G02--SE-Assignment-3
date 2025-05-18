package Model;

public class Review {
    private String product;
    private String reviewText;
    private int rating;

    public Review(String product, String reviewText, int rating) {
        this.product = product;
        this.reviewText = reviewText;
        this.rating = rating;
    }

    public void displayReview() {
        System.out.println("Product: " + product);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Review: " + reviewText);
    }
}