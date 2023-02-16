package sortExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sortExample{
    public static void main(String[] args) {
       ArrayList<Student> students = new ArrayList<>();

       students.add(new Student(12, "krishna", "8527036753", "heights"));
       students.add(new Student(16, "mohan", "9608178162", "Rithala"));
       students.add(new Student(2, "dubey", "8527036753", "Baliyari"));
       students.add(new Student(100, "Tinku", "8527036753", "C"));
       
//       System.out.println(students);

//       Collections.sort(students);

        ArrayList<Student> stud1 = new ArrayList<>(students);
        
        Collections.sort(stud1, (o1,o2) -> o1.address.compareTo(o2.address));
        System.out.println(stud1);
    }


}

//class idComperator implements Comparator<Student> {
//
//
//    public int compare(sortExample.Student o1, Student.Student o2) {
//        return o1.studId-o2.studId;
//    }
//}
