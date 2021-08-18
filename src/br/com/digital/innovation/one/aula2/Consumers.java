package br.com.digital.innovation.one.aula2;

import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {
        Consumer<String> printSentence = System.out::println;
        Consumer<String> printSentence2 = phrase -> System.out.println(phrase);
        printSentence2.accept("Hello World!");
        printSentence.accept("Hello World2!");
    }
}
