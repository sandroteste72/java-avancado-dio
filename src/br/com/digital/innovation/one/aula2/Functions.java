package br.com.digital.innovation.one.aula2;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Function<String, String> reverseName = text -> new StringBuilder(text).reverse().toString();
        Function<String, Integer> convertToIntegerAndMultiplyByTwo = string -> Integer.valueOf(string) * 2; //lambda
        Function<String, Integer> convertToInteger = Integer::valueOf; //reference method
        System.out.println(reverseName.apply("Sandro"));
        try {
            System.out.println(convertToInteger.apply("50"));
            System.out.println(convertToIntegerAndMultiplyByTwo.apply("10"));
        } catch (NumberFormatException e) {
            System.out.println("Value cannot be converted to integer: " + e.getMessage());
        }
    }
}
