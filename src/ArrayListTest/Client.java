package ArrayListTest;

import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        ListUser listUser =new ListUser();
        List<Object> list=listUser.getUser();

        /*for(Object p:list){
            if(p instanceof User){
                User u = (User)p;
                System.out.println(u.getUid()+" "+u.getName());
            }else if(p instanceof Emp){
                Emp e=(Emp)p;
                System.out.println(e.eid+" "+e.name);
            }else if(p instanceof String){
                String q=(String) p;
                System.out.println(q);
            }else if(p instanceof Integer){
                Integer q1=(Integer) p;
                System.out.println(q1);
            }
        }*/

//        for(int i=1; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }

         Iterator<Object> it =list.iterator();
         while(it.hasNext()){
             Object oit =it.next();
             if(oit instanceof User){
                 User uit=(User) oit;
                 System.out.println("User Object data-> "+uit.getUid()+" "+uit.getName());
             }else if(oit instanceof Emp){
                 Emp e=(Emp) oit;
                 System.out.println("Emp Object data-> "+e.eid+ " "+e.name);
             }else if(oit instanceof String){
                 String s=(String) oit;
                 System.out.println("String value-> "+s);
             }else if(oit instanceof Integer){
                 Integer i=(Integer) oit;
                 System.out.println("Integer value-> "+i);
             }
         }

//        for(Object u:list){
//            System.out.println(u.getUid()+" "+u.getName());
//        }
    }

}
