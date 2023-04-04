package modelo;

public class Mujer extends Formal {
    private int alturaTaco;

    public Mujer(String diaVenta, int numero, Producto producto, String color, int alturaTaco) {
        super(diaVenta, numero, producto, color);
        this.alturaTaco = alturaTaco;
    }

    public Mujer() {

    }

    @Override
    public int valorAPagar() {
        return 0;
    }

    @Override
    public int descuento() {
        return 0;
    }

    public int getAlturaTaco() {
        return alturaTaco;
    }

    public void setAlturaTaco(int alturaTaco) {
        this.alturaTaco = alturaTaco;
    }
}
