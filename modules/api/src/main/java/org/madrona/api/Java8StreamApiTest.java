package org.madrona.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Java8StreamApiTest {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Mayooran", "Shanya", "Venuja", "Thaneesan", "Kayooran", "Banujan");

        Stream<String> stream = names.stream();

        Optional<String> stringOptional = stream.findAny();
        System.out.println("List Count : " + stringOptional.get());

    }
}
