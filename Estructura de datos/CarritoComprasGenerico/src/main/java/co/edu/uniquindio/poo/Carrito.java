package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Carrito<T extends Producto> implements Iterable<T> {

  private List<T> productos;

  public Carrito() {
    productos = new ArrayList<>();
  }

  public void agregarProducto(T producto) {
    productos.add(producto);
  }

  public T obtenerProductoMayorPrecio() {

    if (productos.isEmpty()) {
      return null;
    }

    T productoMayor = productos.get(0);

    for (T producto : productos) {

      if (producto.getPrecio() > productoMayor.getPrecio()) {
        productoMayor = producto;
      }
    }

    return productoMayor;
  }

  public double calcularPrecioTotal() {

    double total = 0;

    for (T producto : productos) {
      total += producto.getPrecio();
    }

    return total;
  }

  @Override
  public Iterator<T> iterator() {
    return new IteradorCarrito();
  }

  private class IteradorCarrito implements Iterator<T> {

    private int posicion = 0;

    @Override
    public boolean hasNext() {
      return posicion < productos.size();
    }

    @Override
    public T next() {
      return productos.get(posicion++);
    }
  }
}