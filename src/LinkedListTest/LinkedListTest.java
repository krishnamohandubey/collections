package LinkedListTest;
import java.util.LinkedList;
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("K");
        ll.add("F");
        ll.add("M");
        ll.add("A");


        ll.addFirst("First");

        ll.addLast("Last");
        System.out.println(ll);

        for(String q:ll) {
            System.out.println("This is "+q);
        }
    }
}
