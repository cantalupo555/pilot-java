package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    // Construtor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValeuStock() {
        return price * quantity;
    }

    // Modificar a quantidade atual
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    // Modificar a quantidade atual
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // Print toString
    public String toString() {
        return name
                + String.format(", $ %.2f, ", price)
                + quantity + " units, "
                + String.format("Total: $ %.2f", totalValeuStock());
    }
}
