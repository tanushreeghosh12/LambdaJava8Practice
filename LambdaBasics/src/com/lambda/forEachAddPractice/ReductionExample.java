package com.lambda.forEachAddPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by 718895 on 12/26/2018.
 */
public class ReductionExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 10, 10);

        Integer total =
                list.stream()
                .reduce(0,Integer::sum);
        System.out.println("Total : " + total);

        List<Integer> list1 = Arrays.asList(10);
        Integer total1 =
                list1.stream()
                        .reduce(0,Integer::sum);
        System.out.println("Total1 : " + total1);

        List<Integer> list2 = Arrays.asList();
        Integer total2 =
                list2.stream()
                        .reduce(0,Integer::sum);
        System.out.println("Total2 : " + total2);

        List<Integer> list3 = Arrays.asList(10, 20, 30);

        Integer total3 =
                list3.stream()
                        .reduce(0,Integer::max);
        System.out.println("Total3 : " + total3);

        List<Integer> list4 = Arrays.asList(-10, -20);

        Integer total4 =
                list4.stream()
                        .reduce(0,Integer::max);
        System.out.println("Total4 : " + total4);

        List<Integer> list5 = Arrays.asList(-10, -20);

        Optional<Integer> total5 =
                list5.stream()
                        .reduce(Integer::max);
        System.out.println("Total5 : " + total5);

        List<Integer> list6 = Arrays.asList();

        Optional<Integer> total6 =
                list6.stream()
                        .reduce(Integer::max);
        System.out.println("Total6 : " + total6);

    }
}
