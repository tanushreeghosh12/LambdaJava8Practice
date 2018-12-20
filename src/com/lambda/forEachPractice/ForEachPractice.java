package com.lambda.forEachPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by 718895 on 12/20/2018.
 */
public class ForEachPractice {
    public static void main(String... args){

        List<String> strings = Arrays.asList("one", "two", "three", "four");
        List<String> results = new ArrayList<String>();

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = s -> results.add(s);

        strings.forEach(c1);
        strings.forEach(c1.andThen(c2));
        System.out.println("Size of results: " + results.size());

    }
}
