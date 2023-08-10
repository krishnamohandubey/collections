package mapTest.java8HashMap;

import java.util.HashMap;
import java.util.Map;

public class IterateMapUsingForEach {
    public static void main(String[] args) {
       Map<Integer, String> rankCountry=new HashMap<>();
        rankCountry.put(1,"India");
        rankCountry.put(2,"pakistan");
        rankCountry.put(3,"bagladesh");
        rankCountry.put(4,"Srilanka");
        rankCountry.put(5,"china");


        rankCountry.forEach((rank,country)->{
            System.out.println("Rank is "+rank+", Country is "+country);
        });
    }
}
