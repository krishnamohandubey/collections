package VectorExample;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vs =new Vector<String>();
        vs.add("K");
        vs.add("D");
        vs.add("M");
        vs.add("T");

        for(String q:vs){
            System.out.println(q);
        }

        System.out.println("-------Enumeration--------");
        Enumeration<String> e =vs.elements();
        while(e.hasMoreElements()){
           String s = e.nextElement();
            System.out.println(s);
        }

    }
}
