package co.edu.uniquindio.poo;

import java.util.Date;


public class Tarea<T> {

    private String descripcion;
    private int prioridad;
    private Date fechaVencimiento;

    public Tarea(String descripcion, int prioridad, Date fechaVencimiento) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }
}

