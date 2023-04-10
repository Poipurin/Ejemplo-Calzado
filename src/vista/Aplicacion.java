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
        String codigo;
        /*
        Deportivo deportivo = new Deportivo(new Producto("123ABC",100,10000),44,"Fin de semana","Futbol","Cuero");
        Hombre hombre = new Hombre(new Producto("222AAA",10,200000), "Fin de semana",43,"VERDE");
        Mujer mujer = new Mujer(new Producto("122AAA",10,200000), "Fin de semana",43,"Negro",12);
        tienda.ingresarCalzadoDeportivo(deportivo);
        tienda.ingresarCalzadoHombre(hombre);
        tienda.ingresarCalzadoMujer(mujer);*/

        int opcion;
       do{
           opcion = menu();
           switch (opcion){
               case 1:
                   codigo = pedirCodigo();

                   if(tienda.buscarCalzado(codigo) == -1){
                       System.out.println("Ingrese el stock del calzado");
                       int stock = Leer.datoInt();

                       System.out.println("Ingrese el valor base del calzado");
                       int valorBase = Leer.datoInt();

                       String diaVenta;
                       do{
                           System.out.println("Ingrese dia venta (Semana o fin de semana) ");
                           diaVenta=Leer.dato();
                       }while(diaVenta.compareToIgnoreCase("Semana") != 0 &&
                               diaVenta.compareToIgnoreCase("Fin de semana") != 0);

                       System.out.println("Ingrese el numero del calzado");
                       int numero = Leer.datoInt();

                       int respuesta;
                       do{
                           System.out.println("El calzado es:   1) Deportivo     2)Hombre      3)Mujer");
                           System.out.println("Ingrese opción para continuar");
                           respuesta = Leer.datoInt();
                       }while(respuesta < 1 || respuesta > 3 );


                       if(respuesta==1){
                           //calzado deportivo
                           System.out.println("Ingrese el tipo de deporte"); String tipoDeporte = Leer.dato();

                           String material;
                           do{ // itera siempre que la condición de true
                               System.out.println("Ingrese material (Cuero o Lona)"); //
                               material=Leer.dato();
                           }while(material.compareToIgnoreCase("Cuero") != 0 &&
                                   material.compareToIgnoreCase("Lona") != 0);

                           Producto prod = new Producto(codigo,stock,valorBase);
                           Deportivo deportivo = new Deportivo(prod,numero,diaVenta,tipoDeporte,material);

                           tienda.ingresarCalzadoDeportivo(deportivo);

                           System.out.println("Se agrega calzado deportivo con éxito");

                       }else{
                           System.out.println("Ingrese color del calzado"); String color = Leer.dato();
                           if(respuesta==2){
                               tienda.ingresarCalzadoHombre(
                                       new Hombre(new Producto(codigo,stock,valorBase),diaVenta,numero,color));
                               System.out.println("Se agrega calzado de hombre con éxito");

                           }else{
                               System.out.println("Ingrese altura de taco"); int alturaTaco = Leer.datoInt();


                               tienda.ingresarCalzadoMujer(
                                       new Mujer(
                                               new Producto(codigo,stock,valorBase),
                                               diaVenta,numero,color,alturaTaco));

                               System.out.println("Se agrega calzado de mujer con éxito");

                           }
                       }

                   }else{
                       System.out.println("El calzado código "+ codigo + " ya esta registrado");
                   }

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
                   if(tienda.getTienda().size()==0){
                       System.out.println("No hay calzados en stock");
                   }else{
                   System.out.println(tienda.calzadosTOP());}
                   break;
               case 5:
                   if(tienda.getTienda().size()==0){
                       System.out.println("No hay calzados en stock");
                   }else{
                       System.out.println("Tienes un total de: $"+ tienda.totalImpuestoEspecifico()+ " en impuestos específicos si se vendieran todos los calzados");
                   }
                   break;
               case 6:
                   if(tienda.getTienda().size()==0){
                       System.out.println("No hay calzados en stock");
                   }else{
                       System.out.println("Tienes un total de: $"+ tienda.totalDescuentos()+ " en descuentos si se vendieran todos los calzados");
                   }
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
