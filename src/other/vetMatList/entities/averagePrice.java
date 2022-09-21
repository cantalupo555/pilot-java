package other.vetMatList.entities;

public class averagePrice {
    private String name;
    private double price;

    public averagePrice(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
