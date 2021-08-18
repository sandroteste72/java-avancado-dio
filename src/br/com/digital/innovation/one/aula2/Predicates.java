package br.com.digital.innovation.one.aula2;

import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        Predicate<String> isEmpty = value -> value.isEmpty();
        Predicate<String> isEmpty2 = String::isEmpty;
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty2.test("Sandro"));
    }
}
