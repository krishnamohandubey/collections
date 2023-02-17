package concurrentHashMapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentMapTest {
    public static Map<String, String> getM(){
        Map<String, String> m=new ConcurrentHashMap<String, String>();
        m.put("account_no","256XXXXXXX365");
        m.put("name","emp1");
        m.put("sifsc_code","SBINXXX2365");
        m.put("amount","5000");

        return m;
    }

    public static void main(String[] args) {
        Map<String, String> mm =concurrentMapTest.getM();
        Set<Entry <String, String>> s=mm.entrySet();
        for(Entry <String, String> q:s){
           String k=q.getKey();
           if(k.equalsIgnoreCase("sifsc_code") && q.getValue().equals("SBINXXX2365")){
               mm.put("transaction_id", "TDSBIXXXX45");
           }

        }
        System.out.println(mm);
    }
}
