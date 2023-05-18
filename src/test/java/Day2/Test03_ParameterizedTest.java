package Day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Test03_ParameterizedTest {

    @Test
    void testLength(){

        Assertions.assertTrue("Mirac".length()>0);
        Assertions.assertTrue("Ebubekir".length()>0);
        Assertions.assertTrue("Bilal".length()>0);
        Assertions.assertTrue("Ahmet".length()>0);
    }

    // !!! yukaridaki method da 4 defa assertTrue yazdik ama bunu daha clean sekilde yapmak icin :

    @ParameterizedTest
    @ValueSource(strings = {"Mirac","Ebubekir","Bilal","Ahmet"})
    void testLength2(String str){

        Assertions.assertTrue(str.length()>0);

    }

    // !!! 2.ornek :

    @Test
    void testUpperCase(){
        String str1 = "Merhaba";
        String str2 = "Java";
        String str3 = "Test";

        Assertions.assertEquals("MERHABA",str1.toUpperCase());
        Assertions.assertEquals("JAVA",str2.toUpperCase());
        Assertions.assertEquals("TEST",str3.toUpperCase());

    }

    // !!! yukaridaki ornegi parametreli olarak yazalim :

    @ParameterizedTest
    @CsvSource(value = {
            "MERHABA, merhaba",
            "JAVA, java",
            "TEST, test"
    })
    void testUpperCase2(String str1, String str2){

        Assertions.assertEquals(str1, str2.toUpperCase());

    }

    // !!! 3.ornek :
    @ParameterizedTest
    @CsvSource(value = {"true,java,a", "true,junit,u", "false,hello,a"})
    void testContains(boolean b1, String str1, String str2){

        Assertions.assertEquals(b1,str1.contains(str2));

    }














}
