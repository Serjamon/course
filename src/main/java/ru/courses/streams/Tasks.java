package ru.courses.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks {

    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("str1", "str2", "str3", "str4", "str5");

        System.out.println(getStringFromStream(stringStream));

    }


    public static String getStringFromStream(Stream<String> stringStream) {
        return stringStream.collect(Collectors.joining(" "));
    }

}
