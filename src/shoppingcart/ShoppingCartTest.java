package shoppingcart;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    @Test
    void emptyCartHasTotalPriceZero() {
        ShoppingCart cart = new ShoppingCart();

        double total = cart.getTotalPrice();

        assertEquals(0.0, total);
    }
    
    @Test
    void cartWithOneItemReturnsCorrectTotalPrice() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new CartItem("Apfel", 2.50, 4));

        assertEquals(10.0, cart.getTotalPrice());
    }
}