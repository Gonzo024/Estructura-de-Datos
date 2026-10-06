package co.edu.uniquindio.poo;

public class Pair<K, V> {

    private K clave;
    private V valor;

    public Pair(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K getClave() {
        return clave;
    }

    public V getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "(" + clave + ", " + valor + ")";
    }
}