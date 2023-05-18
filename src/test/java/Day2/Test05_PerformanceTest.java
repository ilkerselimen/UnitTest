package Day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test05_PerformanceTest {

    // !!! Bunu nerede kullanabiliriz ? Task olarak verilen sorunun cozumu icin yazilan code un
    //                                   maksimum 2 saniye icinde ekrana sonucun verilmesini istiyorsam :

    @Test
    void testPrintPerformance(){

        assertTimeout(Duration.ofSeconds(2),
                ()-> IntStream.rangeClosed(1,10000).forEach(System.out::println));
    }

    @Test
    void testPerformance(){

        assertTimeout(Duration.ofSeconds(1),
                ()-> IntStream.rangeClosed(1,50000).reduce((x,y)->Math.addExact(x,y)));

    }


}
