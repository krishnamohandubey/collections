package ArrayListTest;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    public List<Object> getUser(){

        List<Object> l = new ArrayList<Object>();
        User u = new User();
        u.setUid(1);
        u.setName("user 1");
        l.add(u);

        Emp e = new Emp(100, "Emp 1");
        l.add(e);

        User u1 = new User();
        u1.setUid(2);
        u1.setName("user 1");
        l.add(u1);

        Emp e1 = new Emp(200, "Emp 2");
        l.add(e1);

        User u2 = new User();
        u2.setUid(3);
        u2.setName("user 3");
        l.add(u2);

        l.add("krishna");
        l.add(1256);

        return l;

    }
}
