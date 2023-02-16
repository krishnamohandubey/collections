package SetExample;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> hs=new HashSet<String>();
        hs.add("A");

        hs.add("H");
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add(null);
        System.out.println(hs);
    }
}
