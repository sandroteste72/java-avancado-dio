package br.com.digital.innovation.one.aula6;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionExample {

    public static void main(String[] args) {
        Collection<String> names = Arrays.asList("Joao", "Paulo", "Oliveira", "Santos");
        Collection<String> names2 = List.of("Joao", "Paulo", "Oliveira", "Santos");
        Collection<String> names3 = Set.of("Joao", "Paulo", "Oliveira", "Santos");
        System.out.println("Example 1 :: " + names + "\n");
        System.out.println("Example 2 :: " + names2 + "\n");
        System.out.println("Example 3 :: " + names3 + "\n");
    }
}
