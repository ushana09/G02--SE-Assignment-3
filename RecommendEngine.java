import java.util.*;

public class RecommendationEngine {
    private String customerId;

    public RecommendationEngine(String customerId) {
        this.customerId = customerId;
    }

    public List<Product> getRecommendations() {
        // Dummy data for recommendation
        List<Product> recommendations = new ArrayList<>();
        recommendations.add(new Product("P001", "T-Shirt", 19.99));
        recommendations.add(new Product("P002", "Sneakers", 49.99));
        return recommendations;
    }
}
