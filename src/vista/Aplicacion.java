package vista;

import controlador.TiendaCalzado;
import modelo.Deportivo;
import modelo.Hombre;
import modelo.Mujer;
import modelo.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        TiendaCalzado tienda = new TiendaCalzado(new ArrayList<>());
        Deportivo deportivo = new Deportivo(new Producto("123ABC",100,10000),44,"Fin de semana","Futbol","Cuero");
        Hombre hombre = new Hombre(new Producto("222AAA",10,200000), "Fin de semana",43,"VERDE");
        Mujer mujer = new Mujer(new Producto("122AAA",10,200000), "Fin de semana",43,"Negro",12);
        tienda.ingresarCalzadoDeportivo(deportivo);
        tienda.ingresarCalzadoHombre(hombre);
        tienda.ingresarCalzadoMujer(mujer);

        int opcion;
       do{
           opcion = menu();
           switch (opcion){
               case 1:
                   System.out.println("Ingreso calzados");
                   break;
               case 2:
                   if(tienda.getTienda().size()==0){
                       System.out.println("No hay calzados en stock");
                   }else{
                       System.out.println(tienda.calzadosMujer());
                   }
                   break;
               case 3:
                   if(tienda.getTienda().size()==0){
                       System.out.println("No hay calzados en stock");
                   }else{
                   String codigoSolicitado;
                   codigoSolicitado = pedirCodigo();
                       System.out.println(tienda.valorVenta(codigoSolicitado));}
                   break;
               case 4:
                   System.out.println("Calzados top");
                   break;
               case 5:
                   System.out.println("Total impuesto específico");
                   break;
               case 6:
                   System.out.println("Total descuento");
                   break;
           }
       }
       while(opcion !=7);

    }

    public static int menu(){
        System.out.println("******** Tienda calzados patitas suaves ********");
        System.out.println("1.- Ingresar");
        System.out.println("2.- Mostrar sólo los calzados de mujer");
        System.out.println("3.- Valor venta");
        System.out.println("4.- Calzados top");
        System.out.println("5.- Total impuesto específico");
        System.out.println("6.- Total descuento");
        System.out.println("7.- Salir");
        System.out.println("Ingrese opción para continuar");
        return Leer.datoInt();
    }
    public static String pedirCodigo(){
        System.out.println("Favor ingrese codigo del calzado (Ej: 123ABC)");
        return Leer.dato();
    }

}
