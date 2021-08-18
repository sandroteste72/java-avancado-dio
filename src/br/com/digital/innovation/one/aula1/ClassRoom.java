package br.com.digital.innovation.one.aula1;

public class ClassRoom {
    public static void main(String[] args) {
        Function function = valor -> {
            return valor;
        };
        System.out.println(function.generate("Joao"));
    }
}



interface Function {
    String generate(String valor);
}
