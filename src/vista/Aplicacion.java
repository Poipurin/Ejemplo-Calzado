package vista;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        System.out.println(menu());
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
