package vista;
import modelo.Calzado;
import modelo.Producto;

public class Aplicacion {
    public static void main(String[] args) {
        //Instanciar un objeto de tipo producto
        //Constructor
        Producto producto = new Producto();
        producto.stock = 100;
        producto.codigo = "123ABC";
        producto.valorBase = 10000;

        Calzado calzado = new Calzado();

        calzado.producto = producto;

        System.out.println("Codigo producto: "+ calzado.producto.codigo);
        System.out.println("Stock producto: "+ calzado.producto.stock);

    }
}