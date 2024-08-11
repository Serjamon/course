package ru.courses.organization;

public class Employee {

    String name;
    Department dept;

    public Employee(String name, Department dept) {
        this.name = name;
        this.dept = dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        if (dept.boss == this) return name + " начальник отдела " + dept.deptName;
        return name + " работает в отделе " +
                dept.deptName + ", начальник которого " + dept.getBossName();
    }
}
