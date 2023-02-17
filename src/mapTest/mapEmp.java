package mapTest;

import java.util.*;
import java.util.Map.Entry;
import java.util.Set;


public class mapEmp {
    public Map<String, List<Emp>> getData(){
        Map<String, List<Emp>> m =new HashMap<String , List<Emp>>();
        List<Emp> jlist = new ArrayList<Emp>();
        List<Emp> plist = new ArrayList<Emp>();
        List<Emp> dlist = new ArrayList<Emp>();

        Emp je =new Emp();
        je.setEid(11);
        je.setName("Emp JAVA01");
        jlist.add(je);

        Emp je1 =new Emp();
        je1.setEid(6);
        je1.setName("Emp JAVA02");
        jlist.add(je1);

        Emp pe=new Emp();
        pe.setEid(33);
        pe.setName("Emp PHP01");
        plist.add(pe);

        Emp pe1=new Emp();
        pe1.setEid(25);
        pe1.setName("Emp PHP02");
        plist.add(pe1);

        Emp de=new Emp();
        de.setEid(56);
        de.setName("Emp DOTNET01");
        plist.add(de);

        Emp de1=new Emp();
        de1.setEid(96);
        de1.setName("Emp DOTNET02");
        plist.add(de1);

        m.put("javaList", jlist);
        m.put("phpList",plist);
        m.put("dotNetList",dlist);
        return m;

    }

    public static void main(String[] args) {
        mapEmp mapemp=new mapEmp();
        Map<String, List<Emp>> m =mapemp.getData();

        Set< Entry<String, List<Emp> >> s=m.entrySet();
        for(Entry<String, List<Emp>> q:s){
            String  k=q.getKey();
            List<Emp> le=q.getValue();
            for (Emp ed :le){
                System.out.println(k+" [ "+ed.getEid()+" "+ed.getName()+" ] ");
            }
        }
    }
}
