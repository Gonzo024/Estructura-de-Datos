package co.edu.uniquindio.poo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Punto 2
        PairList<String, Integer> lista = new PairList<>();

        lista.agregar("Sofia", 20);
        lista.agregar("Laura", 25);
        lista.agregar("Cesar", 30);

        System.out.println("Punto 2:");
        System.out.println(lista.obtener(0));


        // Punto 3
        Set<String> set = new LinkedHashSet<>();

        set.add("Chicago");
        set.add("Boston");
        set.add("Alabama");
        set.add("Chicago");

        System.out.println("\nPunto 3:");
        System.out.println(set);


        // Punto 4
        Repositorio<String> repositorio = new Repositorio<>();

        repositorio.agregar("A");
        repositorio.agregar("B");
        repositorio.agregar("C");

        System.out.println("\nPunto 4:");

        for (String elemento : repositorio) {
            System.out.println(elemento);
        }

        System.out.println("Desde atrás:");

        repositorio.recorrerDesdeAtras();


        // Punto 7
        ComparadorNumeros comparador = new ComparadorNumeros();

        System.out.println("\nPunto 7:");

        System.out.println(
                comparador.comparar(10, 5)
        );


        // Punto 10
        List<Auto> autos = new ArrayList<>();

        autos.add(new Auto());
        autos.add(new Auto());

        System.out.println("\nPunto 10:");

        alquilarVehiculos(autos);
    }


    public static void alquilarVehiculos(
            List<? extends Vehiculo> vehiculos) {

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.alquilar();
        }
    }
}