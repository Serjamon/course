package ru.courses.organization;

public class Employee {

    String name; //имя может меняться
    private Department dept;

    public Employee(String name, Department dept) {
        this.name = name;
        this.dept = dept;//вновь созданный сотр не может быть начальником
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public boolean worksInDept(Department inDep){
        return inDep == dept;
    }

    @Override
    public String toString() {
        if (dept.emplIsBoss(this)) return name + " начальник отдела " + dept.deptName;
        return name + " работает в отделе " +
                dept.deptName + ", начальник которого " + dept.getBossName();
    }
}
