package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

import java.util.Comparator;

public class ListaDeTareas<T> {

    private List<Tarea<T>> tareas;

    public ListaDeTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea<T> tarea) {
        tareas.add(tarea);
    }

    public List<Tarea<T>> obtenerPorPrioridad(int prioridad) {

        List<Tarea<T>> resultado = new ArrayList<>();

        for (Tarea<T> tarea : tareas) {
            if (tarea.getPrioridad() == prioridad) {
                resultado.add(tarea);
            }
        }

        return resultado;
    }

    public void mostrarOrdenadasPorFecha() {

        tareas.sort(Comparator.comparing(Tarea::getFechaVencimiento));

        for (Tarea<T> tarea : tareas) {
            System.out.println(tarea);
        }
    }
}
