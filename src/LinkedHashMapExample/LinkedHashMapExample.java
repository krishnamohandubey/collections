package LinkedHashMapExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
    public static Map<String, String> getM(){
        Map<String, String> m=new LinkedHashMap<String, String>();
        m.put("account_no","256XXXXXXX365");
        m.put("name","emp1");

        m.put("amount","5000");
        m.put("ifsc","SBINXXX2365");

        return m;
    }

    public static void main(String[] args) {
        Map<String, String> mm = LinkedHashMapExample.getM();
        Set<Map.Entry<String, String>> s=mm.entrySet();
        for(Map.Entry<String, String> q:s){
            String k=q.getKey();
            if(k.equalsIgnoreCase("ifsc") && q.getValue().equals("SBINXXX2365")){
                mm.put("transaction_id", "TDSBIXXXX45");
            }

        }
        System.out.println(mm);
    }
}
