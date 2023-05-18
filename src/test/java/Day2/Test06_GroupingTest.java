package Day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Test06_GroupingTest {

    // !!! amacimiz : birbirleriyle iliskili testleri gruplamak

    // carpma ve toplama islemleri icin yazilan test methodlarini gruplayacagiz

    @Nested
    class MultiplyTest { // sadece carpma islemi ile ilgili test methodlarimi gruplamis oldum

        @ParameterizedTest
        @CsvSource(value = {"-12,-4,3", "-12,4,-3", "12,-4,-3"})
        void testMultiplyWithNonZero(int result, int x, int y){
            Assertions.assertEquals(result,Math.multiplyExact(x,y));
        }

        @ParameterizedTest
        @CsvSource(value = {"0,3,0", "0,0,4", "0,12,0"})
        void testMultiplyWithZero(int result, int x, int y){
            Assertions.assertEquals(result,Math.multiplyExact(x,y));
        }
    }

    @Nested
    class AddTest {

        @ParameterizedTest
        @CsvSource(value = {"-1,-4,3", "1,4,-3", "-7,-4,-3"})
        void testAddWithNonZero(int result, int x, int y){
            Assertions.assertEquals(result,Math.addExact(x,y));
        }

        @ParameterizedTest
        @CsvSource(value = {"3,0,3", "4,4,0", "12,0,12"})
        void testAddWithZero(int result, int x, int y){
            Assertions.assertEquals(result,Math.addExact(x,y));
        }

    }


}
