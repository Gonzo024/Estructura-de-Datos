package co.edu.uniquindio.poo;

public class Main {

    public static void main(String[] args) {

        int[] arreglo = {2, 4, 6, 8, 10};

        int resultado = divideYVenceras(arreglo, 0, arreglo.length - 1);

        System.out.println("La suma es: " + resultado);
    }

    private static int divideYVenceras(int[] arreglo, int i, int j) {

        // Caso base
        if (i == j) {
            return arreglo[i];
        }

        int medio = (i + j) / 2;

        int izquierda = divideYVenceras(arreglo, i, medio);

        int derecha = divideYVenceras(arreglo, medio + 1, j);

        return izquierda + derecha;
    }
}