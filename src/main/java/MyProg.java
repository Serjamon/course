public class MyProg {
    public static void main(String[] args) {

        //Практика ООП. Объекты и классы #1. Точка координат
        System.out.println("***************Задание #1***************");
        Point tochka1 = new Point(1, 3);
        Point tochka2 = new Point(1, 3);
        Point tochka3 = new Point(5, 8);
        System.out.println(tochka1);
        System.out.println(tochka2);
        System.out.println(tochka3);
        //System.out.println(tochka1 == tochka2);
        //System.out.println(tochka2 == tochka3);

        //Практика ООП. Объекты и классы #2. Линия
        System.out.println("***************Задание #2***************");
        Line l1 = new Line(tochka1, tochka3);
        Line l2 = new Line(10, 11, 15, 19);
        Line l3 = new Line(l1.endCoord, l2.startCoord);
        //Выведите текстовое представление Линии 3 на экран
        System.out.println(l3);
        //Измените координаты точек начала и конца Линии 3 таким образом,
        //чтобы изменились все три объекта Линии
        l3.startCoord.x = 6;
        l3.startCoord.y = 9;
        l3.endCoord.x++;
        l3.endCoord.y++;//изменения по ссылкам - значения так же поменялись в объектах l1,l2
        //Выведите текстовое представление Линии 3 на экран после изменения её состояния
        System.out.println("Изменены координаты линий:");
        System.out.println(l3);
        //Рассчитайте суммарную длину всех трех линий и выведите её на экран
        System.out.println("Суммарная длина 3х линий:");
        System.out.println(l1.getLength() + l2.getLength() + l3.getLength());


        //
        System.out.println("***************Задание #3***************");




    }
}
