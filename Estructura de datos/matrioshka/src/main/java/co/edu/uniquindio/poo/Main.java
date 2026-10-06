package co.edu.uniquindio.poo;

public class Main {

    public static void main(String[] args) {

        matrushka(1);
    }

    public static void matrushka(int numero) {
        if (numero > 5) {
            return;
        }

        System.out.println("Abrir matrushka " + numero);
        matrushka(numero + 1);
        System.out.println("Cerrar matrushka " + numero);
    }
}