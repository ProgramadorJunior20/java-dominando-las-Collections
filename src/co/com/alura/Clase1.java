package co.com.alura;

import java.util.ArrayList;

public class Clase1 {
    public static void main(String[] args) {
        String variable1 = "Clase 1";
        String variable2 = "Clase 2";
        String variable3 = "Clase 3";
        String variable4 = "Clase 4";

        ArrayList<String> lista = new ArrayList<>();
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);

        System.out.println(lista);

        lista.set(2, "Ejemplo alterado");

        System.out.println(lista.size());
    }
}
