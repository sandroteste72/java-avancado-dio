package br.com.digital.innovation.one.aula6;

import java.util.Arrays;

public class StringRepeat {

//    public static void main(String[] args) { //Before Java 11
//        String name = "Sandro\n";
//        String aux = "";
//
//        for (int i = 0; i < 10; i++) {
//            aux += name;
//        }
//        System.out.println("The concatenation is :: " + aux);
//    }

//    public static void main(String[] args) { //After Java 11
//        System.out.println("The concatenation is :: " + "Sandro\n".repeat(10));
//    }

    public static void main(String[] args) { //after Java 11
        String name = "Sandro\n";
        System.out.println(name.repeat(10));
    }
}
