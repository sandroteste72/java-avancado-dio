package br.com.digital.innovation.one.aula2;

import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {
        Supplier<People> suppliers = () -> new People(); //lambda
        Supplier<People> instantiatesPerson = People::new; //reference method
        System.out.println(suppliers.get());
        System.out.println(instantiatesPerson.get());
    }
}

class People {
    private String name;
    private Integer age;

    public People () {
        this.name = "Sandro";
        this.age = 48;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
