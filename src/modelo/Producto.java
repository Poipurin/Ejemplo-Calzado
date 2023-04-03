package modelo;

public class Producto {
    //Atributos
    /*
    código 		(String) "123ABC"
    stock   	int	    100
    valorBase	int     10000*/
    public String codigo;
    public int stock;
    public int valorBase;

    //codigo constructor por defecto

    public Producto() {
    }

    public Producto(String codigo, int stock, int valorBase) {
        this.codigo = codigo;
        this.stock = stock;
        this.valorBase = valorBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getValorBase() {
        return valorBase;
    }

    public void setValorBase(int valorBase) {
        this.valorBase = valorBase;
    }
}
