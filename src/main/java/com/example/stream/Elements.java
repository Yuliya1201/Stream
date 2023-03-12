package com.example.stream;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Elements<T> {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(5);
        list.add(15);
        list.add(25);

        findMaxMin(list.stream(), (v1, v2) -> v2 - v1, (v1, v2) -> System.out.println(v1 + v2));
    }

    public static <T> void findMaxMin(Stream<? extends T> elements, Comparator<? super T> order,
                                      BiConsumer<? super T, ? super T>
                                              maxMinConsumer) {
        List<? extends T> list = elements.sorted(order).toList();

        maxMinConsumer.accept(list.get(0), list.get(list.size() - 1));

    }

    //  Задание 2

    public static void addAll() {
         List<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1, 5, 6, 11, 3, 15, 7, 8);
        list.stream().filter(i -> i%2==0).forEach(System.out::println);

        }

    }

