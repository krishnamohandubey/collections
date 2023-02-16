package SetExample;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<String>();
       ts.add("K");
       ts.add("M");
       ts.add("M");
       ts.add("D");
       ts.add("A");
       ts.add("C");

       Iterator<String> it=ts.iterator();
       System.out.println("-------Iterator [While loop]-------");
       while(it.hasNext()){
           System.out.println(it.next());
       }

       System.out.println("-------foreach-------");
       for(String r:ts){
           System.out.println(r);
       }
       System.out.println("-------DESC Order-------");
        TreeSet<String> y =(TreeSet<String>) ts.descendingSet();
        System.out.println(y);
        for(String w:y){
            System.out.println(w);
        }
    }
}
