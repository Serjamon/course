package ru.courses.organization;

public class Department {

    String deptName;
    Employee boss;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public void setBoss(Employee boss) {
        if (boss.dept == this) this.boss = boss;
        else System.out.println("Нельзя назначить начальником сотрудника другого отдела!");
    }

    public String getBossName() {
        return (boss == null ? "пока не назначен" : boss.name);
    }

}
