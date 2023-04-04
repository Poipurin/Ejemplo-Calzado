package modelo;

public abstract class Formal extends Calzado {
    private String color;

    public Formal(String diaVenta, int numero, Producto producto, String color) {
        super(diaVenta, numero, producto);
        this.color = color;
    }

    public Formal() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int impuestoEspecifico(){
        return (int) Math.round(this.getProducto().getValorBase()*7.4/100);
    }
    /*public int descuento(){
        return 0;
    }*/

    //un método abstracto es aquel que se define en una clase pero se implementa en sus subclases
    //no puede ser invocado desde su clase
    //deberá ser sobreescrito por sus subclases (polimorfismo)
    //pertenece a una clase abstracta
    public abstract int descuento();
    //no tiene cuerpo, se construye en las subclases

}