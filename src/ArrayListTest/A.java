package ArrayListTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {
    public static void main(String[] args) {
        List<String> l =new ArrayList<String>();
        l.add("krishna");
        l.add("Mohan");
        l.add("Dubey");
        l.add("TINKU");
        l.add("PINKU");

//        System.out.println(l.get(0));
//        System.out.println(l);

//        System.out.println("Before "+ l.size());
//        for(int i=0; i < l.size(); i++){
//            System.out.println(l.get(i));
////            l.remove(i);
//        }
//        System.out.println("After "+ l.size());

        System.out.println("Iterator "+ l.size());
         Iterator<String> it =l.iterator();
         while (it.hasNext()){
             String t =it.next();
             System.out.println(t);
             it.remove();
         }


        System.out.println("After "+ l.size());

         for(String q :l){
             System.out.println(q);
         }
    }
}
