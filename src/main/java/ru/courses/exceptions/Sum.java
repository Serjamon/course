package ru.courses.exceptions;

public class Sum {

    public static void main(String[] args) {

        double res = 0.0, num;

        for (int i = 0; i < args.length; i++) {

            try {
                num = Double.parseDouble(args[i]);
            } catch (NumberFormatException e) {
                num = 0.0;
            }
            res += num;
        }

        System.out.println("результат: " + res);

    }


}
