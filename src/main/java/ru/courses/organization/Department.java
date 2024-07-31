package ru.courses.organization;

public class Department {

    String deptName;
    private Employee boss;

    public Department(String deptName) {
        this.deptName = deptName;
        //при создании отдела в нем никто не работает, начальника быть не может
    }

    public void setBoss(Employee boss) {
        if (boss.worksInDept(this)) this.boss = boss;
        else System.out.println("Нельзя назначить начальником сотрудника другого отдела!");
    }

    public String getBossName() {
        return (boss == null ? "пока не назначен" : boss.name);
    }

    public boolean emplIsBoss(Employee empl) {
        return empl == boss;
    }


}
