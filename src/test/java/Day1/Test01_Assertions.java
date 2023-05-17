package Day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test01_Assertions {

    @Test
    public void test(){
        //main methodu yokken nasil calisti ??
            // JUnit icinde gomulu olarak gelen Main methodu cagiriliyor...
        //Junit 5 (Jupiter) methodlarin erisim belirleyicisini public yapmak zorunda degiliz
    }

    @Test
    public void testLength(){
        String cumle =  "Merhaba Dunyam"; // 14 character
        int anlikDeger = cumle.length();
        int beklenenDeger = 14;

        Assertions.assertEquals(beklenenDeger,anlikDeger); // aldigi parametrelerin degerlerini karsilastirir, birbirine
                                                           //  esit ise test gecer
    }

    // !!! ( toUpperCase() )
    @Test
    public void testUpperCase(){
        String anlikDeger = "Merhaba".toUpperCase(); // MERHABA
        String beklenenDeger = "MERHABA";

        // testim hata verirse ve mesaj vermek istiyorsam :
        Assertions.assertEquals(beklenenDeger,anlikDeger,"UpperCase methodu duzgun calismadi");
    }

    @Test
    public void testToplama(){
        int sayi1 = 10;
        int sayi2 = 5;
        int anlikDeger = Math.addExact(sayi1,sayi2); // 15
        int beklenenDeger = 15;

        Assertions.assertEquals(beklenenDeger,anlikDeger);
    }

    @Test
    public void testContains(){

        Assertions.assertEquals(false,"Mirac".contains("z"));
    }

}
