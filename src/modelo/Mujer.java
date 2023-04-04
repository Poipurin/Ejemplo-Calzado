package modelo;

public class Mujer extends Formal {
    private int alturaTaco;

    public Mujer(Producto producto, String diaVenta, int numero, String color, int alturaTaco) {
        super(diaVenta, numero, producto, color);
        this.alturaTaco = alturaTaco;
    }

    public Mujer(){
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
        if(this.getAlturaTaco() > 10){
            descuento = this.valorVenta() * 20 /100;
            return descuento;
        }
        return descuento;
    }

    public int getAlturaTaco() {
        return alturaTaco;
    }

    public void setAlturaTaco(int alturaTaco) {
        this.alturaTaco = alturaTaco;
    }
}
