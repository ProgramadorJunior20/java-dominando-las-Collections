package co.com.alura;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3 {
    public static void main(String[] args) {
        String curso1 = "Geometria";
        String curso2 = "Fisica";
        String curso3 = "Quimica";
        String curso4 = "Historia";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        //System.out.println(cursos);

        /**
         * Collections.sort(cursos) Ordena nuestra lista de forma asendente (menor a mayor)
         * */
        //Collections.sort(cursos);

        //System.out.println(cursos);

        /**
         * Collections.sort(cursos, Collections.reverseOrder()) Ordena nuestra lista de forma desendente (mayor a manor)
         * */
        //Collections.sort(cursos, Collections.reverseOrder());

        //System.out.println(cursos);

        /**
         * cursos.sort(Comparator.reverseOrder()) Utilizando un metodo para arrayList,
         * para ordenar de morma desendente
         * cursos.sort(Comparator.naturalOrder()); Lo untilizamos para ordenadar la arrayList,
         * de forma ascendente
         * */
        //cursos.sort(Comparator.naturalOrder());

        //System.out.println(cursos);

        /**
         * vamos a utilizar stream().sorted()
         * List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList()); Utilizamos la
         * - clase List<String> con stream para ordenar de manor de mayor
         * */
        List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList());

        System.out.println(cursosList);
    }
}
