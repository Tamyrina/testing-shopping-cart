package shoppingcart;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CartItemTest {

    @Test
    void totalPriceIsCalculatedCorrectly() {
        CartItem item = new CartItem("Apfel", 2.50, 4);

        double result = item.getTotalPrice();

        assertEquals(10.00, result);
    }

    @Test
    void negativePriceThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new CartItem("Apfel", -2.50, 4);
        });
    }

    @Test
    void quantityZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new CartItem("Apfel", 2.50, 0);
        });
    }
}