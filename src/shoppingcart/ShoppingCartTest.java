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
}