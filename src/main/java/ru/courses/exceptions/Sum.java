package ru.courses.exceptions;

public class Sum {

    public static void main(String[] args) {

        double res = 0.0, num;

        for (String arg : args) {

            try {
                num = Double.parseDouble(arg);
            } catch (NumberFormatException e) {
                num = 0.0;
            }
            res += num;
        }

        System.out.println("результат: " + res);

    }


}
