package ru.courses.exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        Pattern pattern = Pattern.compile("\\d+\\.\\d+");
        Matcher matcher = pattern.matcher(str);

        return matcher.find();
    }

}
