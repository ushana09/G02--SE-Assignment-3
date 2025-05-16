public class Review {
    private String reviewId;
    private String customerId;
    private String productId;
    private int rating;
    private String comment;

    public Review(String reviewId, String customerId, String productId, int rating, String comment) {
        this.reviewId = reviewId;
        this.customerId = customerId;
        this.productId = productId;
        this.rating = rating;
        this.comment = comment;
    }

    public void writeReview() {
        System.out.println("Review submitted: " + comment);
    }

    public void editReview(String newComment) {
        this.comment = newComment;
        System.out.println("Review updated.");
    }
}
