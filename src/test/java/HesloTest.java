import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HesloTest {

    @Test
    void testDelsiNez5ZnakuAObsahujeCislici() {
        Heslo heslo = new Heslo();
        assertFalse(heslo.validuj("abc123"));
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

    @Test
    void testSpecialniZnak() {
        Heslo heslo = new Heslo();
        assertFalse(heslo.validuj("jakub@123456"));
    }
}