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
        int valorAPagar;
        if(this.getProducto().getStock()>0){
            valorAPagar = valorVenta() - descuento() + impuestoEspecifico() + impuestoIVA();
            this.getProducto().setStock(this.getProducto().getStock() -1);
        }else{
            System.out.println("Calzado sin stock :c");
            valorAPagar = -1;
        }
        return valorAPagar;
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
