package com.lambda.forEachAddPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by 718895 on 12/26/2018.
 */
public class MapAndFlatMap {
    public static void main(String[] args){

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> list2 = Arrays.asList(2,4,6);
        List<Integer> list3 = Arrays.asList(3,5,7);

        List<List<Integer>> listResult = Arrays.asList(list1, list2, list3);
        System.out.println(listResult);

        Function<List<?>, Integer> size = List::size;
        Function<List<Integer>, Stream<Integer>> flatMapper = l -> l.stream();

        listResult.stream()
                .map(size)
                .forEach(System.out::println);

        listResult.stream()
                .map(flatMapper)
                .forEach(System.out::println);

        listResult.stream()
                .flatMap(flatMapper)
                .forEach(System.out::println);

    }
}
