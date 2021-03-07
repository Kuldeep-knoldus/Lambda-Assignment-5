package com.knoldus;

import java.util.Scanner;
import java.util.stream.Stream;


public class DistinctList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();

        Stream<String> stream = Stream.of(words.split("[^\\w]")).distinct();
        stream.forEach(s -> System.out.print(s + " "));
    }
}
