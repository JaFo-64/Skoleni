import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KalkulackaTest {

    @Test
    public void testSecti() {
        Kalkulacka kalkulacka = new Kalkulacka();
        assertEquals(5, kalkulacka.secti(2, 3));
        assertEquals(0, kalkulacka.secti(-1, 1));
        assertEquals(-5, kalkulacka.secti(-2, -3));
    }

    @Test
    public void testVydel() {
        Kalkulacka kalkulacka = new Kalkulacka();
        assertEquals(2, kalkulacka.vydel(6, 3));
        assertEquals(-2, kalkulacka.vydel(-6, 3));
        assertEquals(2, kalkulacka.vydel(-6, -3));
        assertThrows(ArithmeticException.class, () -> kalkulacka.vydel(1, 0));
    }


}