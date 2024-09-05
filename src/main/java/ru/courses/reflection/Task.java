package ru.courses.reflection;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task {
    public static void main(String[] args) {

        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));

        System.out.println(cat);
        //добавил в класс аннотацию геттер на это поле
        System.out.println(cat.getBreed());

        clearFields(cat);

        System.out.println(cat);
        System.out.println(cat.getBreed());

        Dog dog1 = new Dog("Tuzik", 1, new ArrayList<>(Arrays.asList("Anton")));
        System.out.println(dog1);
        clearFields(dog1);
        System.out.println(dog1);
        //final не очищен!

    }

    @SneakyThrows
    public static void clearFields(Object obj) {

        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field fld : fields) {

            //вот тут засада была самая
            fld.setAccessible(true);
            if (!fld.getType().isPrimitive()) {
                fld.set(obj, null);
            }
        }
    }

}
