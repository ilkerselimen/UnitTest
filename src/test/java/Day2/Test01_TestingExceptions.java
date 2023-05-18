package Day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test01_TestingExceptions {

    // !!! test ettigimiz method bekledigimiz exceptioni firlatti mi ???

    @Test
    void testException(){

        String str = "Merhaba Dunya"; // 13 character

        Assertions.assertThrows(NullPointerException.class, ()-> {
            System.out.println("testException() running");
            str.length();
        });
    }

    // !!! bolme islemi icin ArithmeticException kontrolu

    @Test
    void testException2(){
        int sayi1 = 1;
        int sayi2 = 0;

        // !!! parent class i yazarsak da test gecer --> RunTimeException
        Assertions.assertThrows(ArithmeticException.class, ()->{
            System.out.println(sayi1/sayi2);
        });
    }

    // !!! yukaridaki senaryoyu method ekleyerek yapalim

    @Test
    void testException3(){

        int sayi1 = 1 ;
        int sayi2 = 0 ;

        Assertions.assertThrows(ArithmeticException.class , ()-> {
            divide(sayi1,sayi2);
        });

    }

    private int divide(int a,int b){
        return a/b;
    }























}
