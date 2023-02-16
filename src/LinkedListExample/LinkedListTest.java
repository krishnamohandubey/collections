package LinkedListExample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> ll =new LinkedList<String>();
        ll.add("krishna");
        ll.add("mohan");
        ll.add("ddd");


        System.out.println(ll);

        ll.addFirst("W");
        ll.addLast("Last");
        ll.add(2,"Z");
        System.out.println(ll);

        for(String p:ll){
            System.out.println(p);
        }
    }
}
