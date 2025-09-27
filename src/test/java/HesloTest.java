import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HesloTest {

    @Test
    void testDelsiNez5ZnakuAObsahujeCislici() {
        Heslo heslo = new Heslo();
        assertTrue(heslo.validuj("abc123"));
    }

    @Test
    void testPrilizKratkeSCislem() {
        Heslo heslo = new Heslo();
        assertFalse(heslo.validuj("a1"));
    }

    @Test
    void testDelsiNez5ZnakuAleBezCislice() {
        Heslo heslo = new Heslo();
        assertFalse(heslo.validuj("abcdef"));
    }

    @Test
    void testPrazdneHeslo() {
        Heslo heslo = new Heslo();
        assertFalse(heslo.validuj(""));
    }
}