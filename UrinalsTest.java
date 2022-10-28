import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {

    @Test
    void Urinal() {
        Urinal Ur =new Urinal();
        String str="00000";
        assertEquals(0, Ur.Simple(str));

    }

}