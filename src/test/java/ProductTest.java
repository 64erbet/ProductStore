import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    void allConstructorParametersMatch() {
        // given
        Character productName = 'A';
        Double piecePrice = 3.50;
        Integer promotionalQuantity = 3;
        Double promotionalPrice = 9.00;

        // when
        Product actualProduct = new Product(
                productName,
                piecePrice,
                promotionalQuantity,
                promotionalPrice
        );

        // then
        Product expectedProduct = new Product('A', 3.50, 3, 9.00);
        assertEquals(expectedProduct.getName(), actualProduct.getName());
        assertEquals(expectedProduct.getPiecePrice(), actualProduct.getPiecePrice());
        assertEquals(expectedProduct.getPromotionalQuantity(), actualProduct.getPromotionalQuantity());
        assertEquals(expectedProduct.getPromotionalPrice(), actualProduct.getPromotionalPrice());
    }

    @Test
    void toStringAssertion() {
        // given
        Character productName = 'A';
        Double piecePrice = 3.50;
        Integer promotionalQuantity = 3;
        Double promotionalPrice = 9.00;

        // when
        Product newProduct = new Product(
                productName,
                piecePrice,
                promotionalQuantity,
                promotionalPrice
        );
        String actualProductToString = newProduct.toString();

        // then
        String expectedProductToString = "Product{" +
                "name = " + productName +
                ", piecePrice = " + piecePrice +
                ", promotionalQuantity = " + promotionalQuantity +
                ", promotionalPrice = " + promotionalPrice +
                '}';
        assertEquals(expectedProductToString, actualProductToString, "Failed !!!!");
    }
}