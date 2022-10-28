import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {

    @Test
    void Urinal() {
        Urinal Ur =new Urinal();
        String str="10001";
        assertEquals(1, Ur.Simple(str));

    }

}