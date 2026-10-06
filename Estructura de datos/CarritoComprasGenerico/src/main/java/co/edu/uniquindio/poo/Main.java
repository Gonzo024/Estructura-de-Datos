package co.edu.uniquindio.poo;

public class Main {

    public static void main(String[] args) {

        Carrito<Producto> carrito = new Carrito<>();

        Producto laptop = new Producto("Laptop", 3000000);
        Producto mouse = new Producto("Mouse", 100000);
        Producto teclado = new Producto("Teclado", 250000);

        carrito.agregarProducto(laptop);
        carrito.agregarProducto(mouse);
        carrito.agregarProducto(teclado);

        System.out.println("PRODUCTOS DEL CARRITO:");

        for (Producto producto : carrito) {
            System.out.println(producto);
        }

        System.out.println();

        Producto mayor = carrito.obtenerProductoMayorPrecio();

        System.out.println("Producto de mayor precio:");
        System.out.println(mayor);

        System.out.println();

        System.out.println("Precio total:");
        System.out.println("$" + carrito.calcularPrecioTotal());
    }
}