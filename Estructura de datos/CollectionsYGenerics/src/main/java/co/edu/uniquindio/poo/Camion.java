package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {

    @Override
    public void alquilar() {
        System.out.println("Alquilando camión");
    }

    public void cargar() {
        System.out.println("Cargando camión");
    }
}