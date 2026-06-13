package shoppingcart;

public class CartItem {

    private String name;
    private double price;
    private int quantity;

    public CartItem(String name, double price, int quantity) {
        if (price < 0) {
            throw new IllegalArgumentException("Preis darf nicht negativ sein.");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Anzahl muss größer als 0 sein.");
        }

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }
}