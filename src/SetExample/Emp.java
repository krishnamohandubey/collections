package SetExample;

import java.util.Objects;

public class Emp {
    int eid;
    String name;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return eid == emp.eid && name.equals(emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid, name);
    }
}
