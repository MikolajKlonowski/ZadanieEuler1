package klonowski.mikolaj.euler1;




import java.util.ArrayList;
import java.util.List;

public class WyszukiwanieLiczb {
    public static void main(String[] args) {
        WyszukiwanieLiczb wyszukiwanieLiczb = new WyszukiwanieLiczb();
        List<Integer> a = wyszukiwanieLiczb.wyszukaneWielokrotnosciLiczby3i5(1000);
//        System.out.println(a.toString());
        int suma=0;
        for (Integer liczby : a) {
            suma+=liczby;

        }
        System.out.println(suma);
    }


    public List<Integer> wyszukaneWielokrotnosciLiczby3i5(int a) {
        ArrayList<Integer> liczby = new ArrayList<>();
        for (int i =1 ; i<a; i++){
            if (i%5==0 ){
                liczby.add(i);
            } else if (i%3==0){
                liczby.add(i);
            }
        }
        ;
        return liczby;
    }
}
