import java.util.List;

public class MyProg {
    public static void main(String[] args) {

        //Практика ООП. Объекты и классы #1. Точка координат
        System.out.println("***************Задание #1***************");
        Point pnt1 = new Point(1, 3);
        Point pnt2 = new Point(1, 3);
        Point pnt3 = new Point(5, 8);
        System.out.println(pnt1);
        System.out.println(pnt2);
        System.out.println(pnt3);
        //System.out.println(pnt1 == pnt2);
        //System.out.println(pnt2 == pnt3);

        //Практика ООП. Объекты и классы #2. Линия
        System.out.println("***************Задание #2***************");
        Line l1 = new Line(pnt1, pnt3);
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


        //Практика ООП. Объекты и классы #3. Ломаная линия
        System.out.println("***************Задание #3***************");

        //без указания точек
        PolyLine emptyLine = new PolyLine();

        //с точками
        //Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(5, 3);
        Point p4 = new Point(8, 9);
        Point arr[] = {p1, p2, p3, p4};
        PolyLine normLine = new PolyLine(arr);
        System.out.println(normLine);
        //Рассчитать длину Ломаной
        double normLineLenght = normLine.getLength();
        System.out.println("Длина ломанной линии: " + normLineLenght);
        //Получить у Ломаной массив Линий
        Line[] arrayOfLines = normLine.getLines();
        //Рассчитать длину массива Линий
        double normLineLenghtArr = 0;
        for (int i = 0; i < arrayOfLines.length; i++) normLineLenghtArr += arrayOfLines[i].getLength();
        //Сравнить длину Ломаной и массива Линий: они должны совпасть
        System.out.println(normLineLenght == normLineLenghtArr);
        //Изменить координаты Точки {2,8} таким образом,
        // чтобы она стала иметь значение {12,8}.
        // Если изменения отразились в данной точке, в Ломаной
        // и в двух Линиях массива (из пункта 3), то задача решена верно
        p2.x = 12;
        p2.y = 8;
        System.out.println(p2);
        System.out.println(normLine);
        for (int i = 0; i < arrayOfLines.length; i++) System.out.println(arrayOfLines[i]);
        //всё поменялось!


    }
}
