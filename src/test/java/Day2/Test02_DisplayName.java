package Day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test02_DisplayName {

    @Test
    @DisplayName("Test parseInt() to check if it is throwing for non digit value")
    void testException(){ // test_parseInt_if_it_is_throwing_for_non_digit_value

        String str = "Merhaba";
        Assertions.assertThrows(NumberFormatException.class, ()->{
           Integer.parseInt(str);
        });
    }

}
