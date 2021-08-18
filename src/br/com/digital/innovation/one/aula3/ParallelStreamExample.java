package br.com.digital.innovation.one.aula3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        IntStream.range(1,10000).forEach(num -> System.out.println(factorial(num)));
//        IntStream.range(1,100000).forEach(num -> factorial(num)); // Serial stream
//        long fim = System.currentTimeMillis();
//        System.out.println("Runtime Serial :: "+(fim-start));
//
//        start = System.currentTimeMillis();
//        IntStream.range(1,10000).forEach(num -> System.out.println(factorial(num)));
//        IntStream.range(1,100000).forEach(num -> factorial(num)); // Parallel stream
//        end = System.currentTimeMillis();
//        System.out.println("Runtime Parallel :: "+(end-start));

//        List<String> names = Arrays.asList("Joao","Paulo","Oliveira","Santos");
        List<String> names = Arrays.asList("Joao","Oliveira","Paulo","Santos");
        names.parallelStream().forEach(System.out::println);


    }

    public static long factorial(long number){
        long fat = 1;

        for (long i = 2; i <- number ; i++) {
            fat *= i;
        }
        return fat;
    }
}