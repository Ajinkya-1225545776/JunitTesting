import org.junit.jupiter.api.Test;
//Author=Ajinkya Abhinay Pise

import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {

    @Test
    void Urinal() {
        Urinal Ur =new Urinal();
        String str="010001";
        assertEquals(1, Ur.Simple(str));

    }

}
