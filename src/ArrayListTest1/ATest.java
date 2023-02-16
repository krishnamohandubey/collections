package ArrayListTest1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ATest {
    public static void main(String[] args) {
        List<String > l =new ArrayList<String>();
        l.add("H");
        l.add("B");
        l.add("K");
        l.add("A");
        Collections.sort(l);
        System.out.println(l);
    }
}
