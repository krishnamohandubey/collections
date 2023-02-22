package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class hashMapTest {
    public static void main(String[] args) {
        // key-String and value- Integer
        Map<String ,Integer>  m= new HashMap<String,Integer>();

        m.put("emp1", 100000);   //o1
        m.put("emp2",200000);  //o2
        m.put("emp10",300000);  //o3
        m.put("emp16",40000);     //o4
        m.put("emp9",2300);     //o5

        m.put("emp5",40000);     //o6
        m.put("emp7", 500000);   //o7
        m.put(null,null);       //o8

        // old key replace with new one - override
        m.put("emp2",500000);

        // get key set in loop
        Set<String> s=m.keySet();
        for(String p:s){
            System.out.println(p);
        }

        Set< Entry<String,Integer>> t=m.entrySet();

        //no for loop - on map object

        Iterator <Entry<String,Integer>> y=t.iterator();
        while (y.hasNext()){
            Entry<String, Integer> q=y.next();
            String k=q.getKey();
            Integer v=q.getValue();
            System.out.println(k + " "+v);
        }
        System.out.println("-------foreach loop------");

        for(Entry<String, Integer> p:t){
            System.out.println(p.getKey()+" "+p.getValue());
        }

//        System.out.println(m.get("arun"));

    }
}
