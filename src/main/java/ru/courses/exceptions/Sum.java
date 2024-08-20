package ru.courses.exceptions;

public class Sum {

    public static void main(String[] args) {

        double res = 0.0, num = 0.0;

        for (String arg : args) {

            num = (checkString(arg) ? Double.parseDouble(arg) : 0.0);

            res += num;
        }

        System.out.println("результат: " + res);

    }

    public static boolean checkString(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= 48 && str.charAt(i) <= 57))
                return false;
        }
        return true;
    }

}
