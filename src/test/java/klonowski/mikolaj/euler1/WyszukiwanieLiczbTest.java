package klonowski.mikolaj.euler1;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class WyszukiwanieLiczbTest {
    @Test
    public void shouldReturnListe() {
        //given
        WyszukiwanieLiczb wyszukiwanieLiczb = new WyszukiwanieLiczb();
        int a = 10;
        ArrayList<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(5);
        b.add(6);
        b.add(9);
        List<Integer> liczby;
        //when
        liczby = wyszukiwanieLiczb.wyszukaneWielokrotnosciLiczby3i5(a);
        //then
        Assert.assertThat(liczby, CoreMatchers.is(b));
    }

    @Test
    public void shouldReturn23() {
        //given
        WyszukiwanieLiczb wyszukiwanieLiczb = new WyszukiwanieLiczb();
        int a = 10;
        List<Integer> result;
         result= wyszukiwanieLiczb.wyszukaneWielokrotnosciLiczby3i5(a);
         int suma = 0 ;
        for (Integer in : result) {
            suma+=in;
        }
        assertThat(suma, CoreMatchers.is(23));

    }
}
