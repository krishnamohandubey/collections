package SetExample;

import java.util.HashSet;
import java.util.Set;

public class SetEmp {
    public Set<Emp> getData(){
        Set<Emp> s =new HashSet<Emp>();
        Emp e=new Emp();
        e.setEid(11);
        e.setName("Krishna");
        s.add(e);
        System.out.println(e.hashCode());

        Emp e1=new Emp();
        e1.setEid(12);
        e1.setName("mohan");
        s.add(e1);
        System.out.println(e1.hashCode());

        Emp e2=new Emp();
        e2.setEid(21);
        e2.setName("dubey");
        s.add(e2);
        System.out.println(e2.hashCode());

        Emp e3=new Emp();
        e3.setEid(11);
        e3.setName("Krishna");
        s.add(e3);
        System.out.println(e3.hashCode());

        return s;

    }

    public static void main(String[] args) {
        SetEmp setEmp =new SetEmp();
        Set<Emp> se =setEmp.getData();
        for(Emp v:se){
            System.out.println(v.getEid()+" "+v.getName());
        }
    }
}
