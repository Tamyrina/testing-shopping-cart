package shoppingcart;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShoppingCartMockTest {

    @Test
    void discountedPriceIsCalculatedCorrectly() {

        DiscountService discountService = new DiscountService() {
            @Override
            public double getDiscount() {
                return 2.0;
            }
        };

        ShoppingCart cart = new ShoppingCart(discountService);

        cart.addItem(new CartItem("Apfel", 2.50, 4));

        assertEquals(8.0, cart.getDiscountedTotalPrice());
    }
}