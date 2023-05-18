package Day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04_RepeatTestMultipleTimes {

    // !!! Testi tekrarlatmak istersek ?

    @RepeatedTest(5)
    void testSubstring(){

        assertEquals("Java","Java is an OOP language".substring(0,4));
        System.out.println("test calisti");

    }

    @RepeatedTest(3)
    @Disabled // herhangi bir testi pasif hale getirmek icin bu annotation kullanilir
    void testRepeated(){

        assertEquals(2,Math.addExact(1,1));
        System.out.println("test2 calisti");
    }

    // !!! 3.ornek :

    Random random = new Random();

    @RepeatedTest(3)
    void testMathExact(){

        int a = random.nextInt(10);
        int b = random.nextInt(10);

        assertEquals(a+b,Math.addExact(a,b));
        System.out.println("sayi1: "+ a + ", sayi2: " + b);

    }

}
