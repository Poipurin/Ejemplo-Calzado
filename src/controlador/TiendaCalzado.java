package controlador;

import modelo.Calzado;

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
}
