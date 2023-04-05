package vista;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        int opcion;
       do{
           opcion = menu();
           switch (opcion){
               case 1:
                   System.out.println("Ingreso calzados");
                   break;
               case 2:
                   System.out.println("Calzados de mujer");
                   break;
               case 3:
                   System.out.println("Valor venta");
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


}
