package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Main {

    static ArrayList<String> estudiantes = new ArrayList<>(100);

    public static void main(String[] args) {

        estudiantes.add("Andrés");
        estudiantes.add("Santiago");
        estudiantes.add("Sofia");
        estudiantes.add("Pedro");
        estudiantes.add("Andrea");
        estudiantes.add("Ana");
        estudiantes.add("Juan");

        eliminarEstudiantesConA();

        System.out.println(estudiantes);
    }

    public static void eliminarEstudiantesConA() {

        for (int i = estudiantes.size() - 1; i >= 0; i--) {

            if (estudiantes.get(i).toLowerCase().startsWith("a")) {
                estudiantes.remove(i);
            }
        }
    }
}