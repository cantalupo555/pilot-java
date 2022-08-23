package entities;

public class Product {
    public String name;
    public Double price;
    public int quantity;

    public Double totalValeuStock() {
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

    // Print objeto
    public String toString() {
        return name
                + String.format(", $ %.2f, ", price)
                + quantity + " units, "
                + String.format("Total: $ %.2f", totalValeuStock());
    }
}
