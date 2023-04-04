package modelo;

public class Hombre extends Formal {
    public Hombre(String diaVenta, int numero, Producto producto, String color) {
        super(diaVenta, numero, producto, color);
    }

    public Hombre() {
        super();
    }

    @Override
    public int valorAPagar() {
        return 0;
    }

    @Override
    public int descuento() {
        return 0;
    }
}
