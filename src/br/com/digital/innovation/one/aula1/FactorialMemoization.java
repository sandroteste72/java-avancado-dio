package br.com.digital.innovation.one.aula1;

import java.util.HashMap;
import java.util.Map;

public class FactorialMemoization {
    static Map<Integer, Integer> FACTORIAL_MAP = new HashMap<>();

    public static void main(String[] args) {
        long I = System.nanoTime();
        System.out.println(factorialWithMemoization(15));
        long F = System.nanoTime();
        System.out.println("FACTORIAL 1 " + (F - I));

        I = System.nanoTime();
        System.out.println(factorialWithMemoization(15));
        F = System.nanoTime();
        System.out.println("FACTORIAL 2 " + (F - I));
    }

    private static Integer factorialWithMemoization(Integer value) {
        if (value == 1) {
            return value;
        } else {
            if (FACTORIAL_MAP.containsKey(value)) {
                return FACTORIAL_MAP.get(value);
            } else {
                Integer result = value * factorialWithMemoization(value - 1);
                FACTORIAL_MAP.put(value, result);
                return result;
            }
        }
    }
}



