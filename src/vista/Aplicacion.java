package vista;
import modelo.Calzado;
import modelo.Deportivo;
import modelo.Producto;
import modelo.Hombre;
import modelo.Mujer;

public class Aplicacion {

    public static void main(String[] args) {

        Deportivo deportivo = new Deportivo (new Producto("123ABC",100,10000),44,"semana","Futbol","Cuero");

        Deportivo deportivo2 = new Deportivo();

        Hombre hombre = new Hombre();

        Mujer mujer = new Mujer();

        System.out.println("el valor venta del calzado deportivo durante la "+ deportivo.getDiaVenta() +
                " es: $ "+ deportivo.valorVenta());

    }
}