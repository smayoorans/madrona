package org.madrona.effective.java.regex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class JavaStringTest {

    public static void main(String[] args) {


        List<String> persons = Arrays.asList("Mayooran","Kayooran", "Shanya", "Venuja");

        Stream<String> stream = persons.stream();

//        System.out.println(stream.count());

        Consumer<String> consumer = p -> System.out.println("Welcome " + p);

        stream.forEach(consumer);
    }
}
