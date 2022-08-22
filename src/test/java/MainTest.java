import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.OngoingStubbing;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

//@ExtendWith(MockitoExtension.class)
class MainTest {
/*
    @Mock
    private WareHouse wareHouseMok;

    private WareHouse wareHouse;

    @Test
    void argumentsAreNOTEmpty() {
//        System.out.println("when(wareHouse.calculateTotalCost(\"bAcBDgCadA\"))" +
//                ".thenCallRealMethod() = "
//                + when(wareHouse.calculateTotalCost("bAcBDgCadA"))
//                .thenCallRealMethod(System.out.println("Fuck")));
//        when(wareHouse.calculateTotalCost("bAcBDgCadA"))
//                .thenCallRealMethod(System.out.println("Fuck"));
    }
    @Test
    void veryfyFourTimes() {
//        ver
    }

 */
//**************************************************************************************

    private static ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeAll
    public static void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void testString() {
        Main.main("AaaCc");
        assertEquals("totalityCost = 5.0", output.toString().trim());
    }

    @AfterAll
    public static void cleanUpStreams() {
        System.setOut(null);
    }



}