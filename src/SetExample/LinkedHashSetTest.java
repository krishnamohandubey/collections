package SetExample;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        Set<String> lhs = new LinkedHashSet<String>();
        lhs.add("K");
        lhs.add("M");
        lhs.add("B");
        lhs.add("C");

        System.out.println(lhs);
    }
}
