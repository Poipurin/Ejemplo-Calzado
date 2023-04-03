package modelo;

public class Calzado {
    private String diaVenta;
    private int numero;

    private Producto producto;

    public Calzado() {
    }

    public Calzado(String diaVenta, int numero, Producto producto) {
        this.diaVenta = diaVenta;
        this.numero = numero;
        this.producto = producto;
    }

    public String getDiaVenta() {
        return diaVenta;
    }

    public void setDiaVenta(String diaVenta) {
        this.diaVenta = diaVenta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int valorVenta(){
        int valorVenta = 0;
        if(this .diaVenta.equalsIgnoreCase("Semana")){
             //-15% valor base
            valorVenta = this.getProducto().getValorBase() - Math.round(this.getProducto().getValorBase()*15/100);
        }else if(this.diaVenta.equalsIgnoreCase("Fin de Semana"))
            //+24% valor base
            valorVenta = (int) (this.getProducto().getValorBase() + Math.round(this.getProducto().getValorBase()*0.24));
        return 0;
    }
    public int impuestoIVA(){
        return 0;
    }

}
