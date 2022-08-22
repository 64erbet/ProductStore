import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith({MockitoExtension.class})
class WareHouseTest {

//    @BeforeAll
    @Mock
    WareHouse wareHouseMock;

    WareHouse wareHouse = new WareHouse();

    @Test
    void checkAddingProducts() {
        // given // when
        wareHouse.calculateTotalCost("ABCD");

        // then
        assertEquals(wareHouse.productList.get(0).getName(), 'A');
        assertEquals(wareHouse.productList.get(1).getName(), 'B');
        assertEquals(wareHouse.productList.get(2).getName(), 'C');
        assertEquals(wareHouse.productList.get(3).getName(), 'D');
    }

    @Test
    void ifNotAProduct() {
        // given
        String notAProduct = "x";

        // when
        Boolean rezult = wareHouse.itsAProduct(notAProduct.charAt(0));

        // then
        assertFalse(rezult);
    }

    @Test
    void ifAProduct() {
        // given
        String aProduct = "b";

        // when
        Double totalCost = wareHouse.calculateTotalCost(aProduct);
        Boolean rezult = wareHouse.itsAProduct(aProduct.charAt(0));

        // then
        System.out.println("aProduct.charAt(0) = " + aProduct.charAt(0));
        assertTrue(rezult);
    }

    @Test
    void mockitoOperationCheck() {
        // given // when
        when(wareHouseMock.calculateTotalCost("Abc")).thenReturn(10.00);

        // then
        assertEquals(wareHouseMock.calculateTotalCost("Abc"), 10.00);
    }
}