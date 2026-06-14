package shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<CartItem> items = new ArrayList<>();
    private DiscountService discountService;

    public ShoppingCart() {
    }

    public ShoppingCart(DiscountService discountService) {
        this.discountService = discountService;
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public double getTotalPrice() {
        return calculateTotalPrice();
    }

    public double getDiscountedTotalPrice() {
        return getTotalPrice() - discountService.getDiscount();
    }

    private double calculateTotalPrice() {
        double total = 0.0;

        for (CartItem item : items) {
            total += item.getTotalPrice();
        }

        return total;
    }
}