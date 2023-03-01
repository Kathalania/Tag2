import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class nameLengthTest {

    @Test
    void shouldReturnTrueWhenGivenAStringLongerThan20() {
        //GIVEN
        int longEnough = 20;

        //WHEN
        boolean actual = nameLength.lengthTest(longEnough);

        //THEN
        assertEquals(true,actual);


    }
}