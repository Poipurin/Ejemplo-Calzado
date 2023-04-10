package controlador;

import modelo.Calzado;
import modelo.Deportivo;
import modelo.Hombre;
import modelo.Mujer;

import java.util.ArrayList;

public class TiendaCalzado {
    private ArrayList<Calzado> tienda;

    public TiendaCalzado(ArrayList<Calzado> tienda) {
        this.tienda = tienda;
    }

    public TiendaCalzado() {
    }

    public ArrayList<Calzado> getTienda() {
        return tienda;
    }

    public void setTienda(ArrayList<Calzado> tienda) {
        this.tienda = tienda;
    }

    public int buscarCalzado(String codigoCalzado){
        for(int i=0; i <  tienda.size(); i++){
            if(tienda.get(i).getProducto().getCodigo().compareToIgnoreCase(codigoCalzado)==0){
                return i;
            }
        }
        return -1;
    }
    public void ingresarCalzadoMujer(Mujer mujer){
        if(buscarCalzado(mujer.getProducto().getCodigo())==-1){
            tienda.add(mujer);
        }

    }
    public void ingresarCalzadoHombre(Hombre hombre){
        if(buscarCalzado(hombre.getProducto().getCodigo())==-1){
            tienda.add(hombre);
        }
    }
    public void ingresarCalzadoDeportivo(Deportivo deportivo) {
        if(buscarCalzado(deportivo.getProducto().getCodigo())==-1){
            tienda.add(deportivo);
        }
    }
    public String calzadosMujer(){
        String mensaje = "";
        Mujer mujer = null;
        int contador = 0;
        for(int i=0; i < tienda.size();i++){
            if(tienda.get(i) instanceof Mujer){
                mujer = (Mujer) tienda.get(i);
                mensaje = mensaje + " dia de venta: "+mujer.getDiaVenta() + ", altura de taco: "+ mujer.getAlturaTaco() +" y descuento: $"+mujer.descuento();
                contador++;
            }
        }
        if(contador == 0){
            System.out.println("No hay calzados de mujer");
        }
        return mensaje;

    }
    public String valorVenta(String codigo){
        String mensaje = "";
        for(int i=0; i < tienda.size();i++){
            if (tienda.get(i).getProducto().getCodigo().compareToIgnoreCase(codigo)==0) {
                //lo encontré
                return "El valor venta del calzado es: $"+ tienda.get(i).valorVenta() + " y el número del calzado es talla: " +tienda.get(i).getNumero();
            }
        }
        return "El código "+ codigo + " no está asociado a ningún calzado";
    }

    public String calzadosTOP(){
        String mensaje = "";
        int suma = 0;
        for(int i = 0; i< tienda.size(); i++){
            if(tienda.get(i).valorVenta() > 80000){
                suma = suma + tienda.get(i).getProducto().getStock();
            }
        }
        mensaje = "Tienes "+ suma + "calzados TOP";
        return mensaje;
    }
}


