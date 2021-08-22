// Aula "Novidades do Java 10" módulos "Aplicando os novos releases da linguagem na prática I, II e III"
// https://www.youtube.com/watch?v=OweZAewo54A : Instalando o Docker no Windows
// https://www.youtube.com/watch?v=TrnrH2EP3zo : Como INSTALAR Docker no Linux | RAPIDO E FACIL
// https://dzone.com/articles/java-string-format-examples : Especificadores de formato

package br.com.digital.innovation.one.aula5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class InferenceExample {
//    public static void main(String[] args) throws IOException {
        //It can be done that way
//        URL url = new URL("Https://docs.oracle.com/javase/10/language/");
//        URLConnection urlConnection = url.openConnection();
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((urlConnection.getInputStream())));
//
        //Or can be done that way
//        var url = new URL("Https://docs.oracle.com/javase/10/language/");
//        var urlConnection = url.openConnection();
//        var bufferedReader = new BufferedReader(new InputStreamReader((urlConnection.getInputStream())));
//
//        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">",">\n"));
//    }

    public static void main(String[] args) {
        //connectAndPrintURLJavaOracle();
        printFullName("Sandro", "Arpi");
        printSum(15, 18, 37, 8, 7, 21, -6);
    }

        private static void connectAndPrintURLJavaOracle () {
            try {
                var url = new URL("https://docs.oracle.com/javase/10/language/");
                var urlConnection = url.openConnection();

                try (var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
                    System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    public static void printFullName(String name, String lastName) {
        var fullName = String.format("%s %s", name, lastName);
        System.out.println(fullName);
    }

    public static void printSum(int... numbers) {
        int sum;
        if (numbers.length > 0) {
            sum = 0;
            for (var number = 0; number < numbers.length; number++) {
                sum += numbers[number];
            }
            System.out.println("A soma e :: " + sum);
        }
    }

        //Consegue

        // variaveis local inicializadas
        // variavel suporte do enhaced for
        // variavel suporte do for iterativo
        // variavel try with resource

        //Nao consegue

        // var nao pode ser utilizado em nivel de classe
        // var nao pode ser utilizado como parametro
        // var nao pode ser utilizada em variaveis locais nao inicializadas


        // https://docs.oracle.com/javase/10/language/
}

//AULA DOCKER
//
//        $ docker --version
//        $ docker
//        $ sudo docker container run -it -m512m --entrypoint bash openjdk:7-jdk
//        $ java -XX:+PrintFlagsFinal -version
//        $ java -XX:+PrintFlagsFinal -version | grep MaxHeapSize
//        $ sudo docker ps
//        $ sudo docker ps -a
//        $ sudo docker run -it -m512m --entrypoint bash openjdk:10-jdk
//        $ java -XX:+PrintFlagsFinal -version | grep MaxHeapSize
//        $ sudo docker run -it --cpus 2 openjdk:10-jdk
//        $ Runtime.getRuntime().availableProcessors()
//        $ /exit
//        $ sudo docker run -it --cpus 1 openjdk:10-jdk
//        $ Runtime.getRuntime().availableProcessors()
