package mapTest;

import java.util.*;
import java.util.Map.Entry;

public class DuplicateMapTest {
    public Map<Emp, String> getEmp(){
        Map<Emp, String> hm =new LinkedHashMap<Emp, String>();

        Emp e=new Emp();
        e.setEid(12);
        e.setName("emp1");
        hm.put(e,"A");

        Emp e1=new Emp();
        e1.setEid(12);
        e1.setName("emp2");
        hm.put(e1, "B");

        Emp e2=new Emp();
        e2.setEid(13);
        e2.setName("emp3");
        hm.put(e2,"C");
        return hm;
    }

    public static void main(String[] args) {
        DuplicateMapTest dmt =new DuplicateMapTest();
        Map<Emp, String> m =dmt.getEmp();
        Set< Entry<Emp, String> > s=m.entrySet();
        Iterator<Entry<Emp, String>> it=s.iterator();
        while (it.hasNext()){
            Entry<Emp, String> r=it.next();
            Emp k =r.getKey();
            System.out.println(k.getEid()+" "+k.getName()+" "+r.getValue());
        }
    }
}
