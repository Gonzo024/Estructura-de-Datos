package co.edu.uniquindio.poo;

public class ComparadorNumeros implements Comparador<Integer> {

    @Override
    public int comparar(Integer numero1, Integer numero2) {
        return Integer.compare(numero1, numero2);
    }
}