package duplicate_uniqueExaxmple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {


    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("D");
        list.add("G");
        list.add("H");
        list.add("H");
        list.add("I");
        list.add("J");
        list.add("X");
        list.add("Y");
        list.add("Y");
        list.add("X");
        list.add("Z");

        List<String> uniquelist =new ArrayList<>();
        List<String> duplicatelist =new ArrayList<>();

        for(String element : list){
            if(Collections.frequency(list,element)>1){
                if(!duplicatelist.contains(element)){
                    duplicatelist.add(element);
                }
            }else{
                if(!uniquelist.contains(element)){
                    uniquelist.add(element);
                }
            }
        }

        System.out.println("Original List: "+list);
        System.out.println("Duplicate List: "+duplicatelist);
        System.out.println("Unique List: "+uniquelist);

    }


}
