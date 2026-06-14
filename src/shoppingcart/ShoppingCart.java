package shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<CartItem> items = new ArrayList<>();

    public void addItem(CartItem item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double total = 0.0;

        for (CartItem item : items) {
            total += item.getTotalPrice();
        }

        return total;
    }
}