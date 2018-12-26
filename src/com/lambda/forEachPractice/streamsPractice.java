package com.lambda.forEachPractice;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by 718895 on 12/26/2018.
 */
public class streamsPractice {
    public static void main(String[] args){
        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");
        Predicate<String> p1 = s -> s.length() > 3;
        stream
                .filter(p1)
                .forEach(s -> System.out.println("P1: " + s));

        //Since we cannot use same stream again
        Stream<String> stream1 = Stream.of("one", "two", "three", "four", "five");
        Predicate<String> p2 = Predicate.isEqual("two");
        Predicate<String> p3 = Predicate.isEqual("three");
        stream1
                .filter(p2.or(p3))
                .forEach(s -> System.out.println("P2 or p3 "+ s));


        }

    }

