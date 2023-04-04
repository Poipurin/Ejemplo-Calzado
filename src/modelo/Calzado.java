package modelo;

public class Calzado {
    private String diaVenta;
    private int numero;

    private Producto producto;

    public Calzado(String diaVenta, int numero, Producto producto) {
        super();
        this.diaVenta = diaVenta;
        this.numero = numero;
        this.producto = producto;
    }

    public Calzado() {
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
        if(this.getDiaVenta().equalsIgnoreCase("semana")){
            valorVenta = this.getProducto().getValorBase() - Math.round(this.getProducto().getValorBase()*15/100);
        }else if(this.getDiaVenta().equalsIgnoreCase("Fin de semana")){
            valorVenta = (int) (this.getProducto().getValorBase() + Math.round(this.getProducto().getValorBase()*0.24));
        }
        return valorVenta;
    }
    public int impuestoIVA(){
        return Math.round(this.valorVenta()*19/100);
    }

}