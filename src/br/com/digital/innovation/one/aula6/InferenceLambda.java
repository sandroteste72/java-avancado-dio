package br.com.digital.innovation.one.aula6;

import java.util.function.Function;

public class InferenceLambda {
    public static void main(String[] args) {
//        String name = "Joao";
//        var name = "Joao";

        Function<Integer, Double> divisionBy2 = (var number) -> number / 2.0;
//        Function divisionBy2 = (var number) -> number.getClass();

        System.out.println(divisionBy2.apply(9849387));
    }
}
