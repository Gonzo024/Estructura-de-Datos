package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class PairList<K, V> {

    private List<Pair<K, V>> pares;

    public PairList() {
        pares = new ArrayList<>();
    }

    public void agregar(K clave, V valor) {
        pares.add(new Pair<>(clave, valor));
    }

    public void eliminar(int indice) {
        pares.remove(indice);
    }

    public Pair<K, V> obtener(int indice) {
        return pares.get(indice);
    }

    public void mostrar() {
        for (Pair<K, V> par : pares) {
            System.out.println(par);
        }
    }
}