

public class MyProg {
    public static void main(String[] args) {

        Department dAccounting = new Department("Отдел бухгалтерии");
        Department dIT = new Department("ИТ отдел");
        Department dCleaning = new Department("Отдел обслуживания");

        Employee emp1 = new Employee("Иван Васильевич", dAccounting);
        Employee emp2 = new Employee("Вася", dIT);
        Employee emp3 = new Employee("Иван Федорович", dCleaning);
        Employee emp4 = new Employee("Елена Степановна", dCleaning);

        System.out.println(dIT.getBossName());
        System.out.println(emp2);
        dIT.setBoss(emp1);
        dIT.setBoss(emp2);
        System.out.println(dIT.getBossName());
        System.out.println(emp1);
        System.out.println(emp2);
        emp2.setDept(dCleaning);

    }
}
