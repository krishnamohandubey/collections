package ArrayListTest1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public List<Object> getData(){
        List<Object> l=new ArrayList<Object>();
        Emp e =new Emp();
        e.setEid(1236);
        e.setName("krishna");
        l.add(e);

        User u=new User(1256,"Rohini sec-29");
        l.add(u);

        Emp e1 =new Emp();
        e1.setEid(3654);
        e1.setName("mohan");
        l.add(e1);

        l.add("Krishna is a best Programmer");
        l.add(897);
        List<Object> list = Collections.synchronizedList(l);
        return list;
    }

    public static void main(String[] args) {
        ListTest listtest =new ListTest();
        List<Object> gdata= listtest.getData();
        Iterator<Object> it =gdata.iterator();
        while(it.hasNext()){
            Object p=it.next();
            if(p instanceof User){
                User u =(User)p;
                System.out.println(u.uid+" "+u.address);
            }else if(p instanceof Emp){
                Emp e=(Emp) p;
                System.out.println(e.getEid()+" "+e.getName());
            }else if(p instanceof String){
                String s=(String) p;
                System.out.println(s);
            }else if(p instanceof Integer){
                Integer i=(Integer) p;
                System.out.println(i);
            }
        }

        System.out.println("------Foreach Loop------");

        for (Object p:gdata){

            if(p instanceof User){
                User u =(User)p;
                System.out.println(u.uid+" "+u.address);
            }else if(p instanceof Emp){
                Emp e=(Emp) p;
                System.out.println(e.getEid()+" "+e.getName());
            }else if(p instanceof String){
                String s=(String)p;
                System.out.println(s);
            }else if(p instanceof Integer){
                Integer i=(Integer)p;
                System.out.println(i);
            }
        }
    }
}
