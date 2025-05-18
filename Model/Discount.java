package Model;

public class Discount {
    private String code;
    private double percentage;

    public Discount(String code, double percentage) {
        this.code = code;
        this.percentage = percentage;
    }

    public void displayDiscount() {
        System.out.println("Discount Code: " + code);
        System.out.println("Percentage: " + percentage + "%");
    }
}
