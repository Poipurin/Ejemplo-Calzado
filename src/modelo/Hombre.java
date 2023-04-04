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
        int descuento = 0;
        if(this.getColor().equalsIgnoreCase("Rojo") || this.getColor().equalsIgnoreCase("Verde")){
            descuento = this.valorVenta() * 25 /100;
        }
        return descuento();
    }
}
