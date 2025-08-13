package Clase3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanMain =new Scanner(System.in);
        //FacturacionMercado
        System.out.println("--- Sistema de Facturación del Supermercado ---");
        System.out.print("Ingrese el total de la compra: $");
        double totalCompra = scanMain.nextDouble();
        System.out.print("Ingrese la cantidad de productos comprados: ");
        int cantidadProductos = scanMain.nextInt();
        scanMain.nextLine();//Limpieza de buffer
        System.out.print("¿El cliente tiene membresía? (si/no): ");
        //equalsIgnoreCase para que se pueda ingresar escrito de forma diferente sI, Si
        boolean tieneMembresia = scanMain.next().equalsIgnoreCase("si");
        Taller5.FacturacionMercado(totalCompra, cantidadProductos, tieneMembresia);
        scanMain.nextLine();

        //ClasificacionMascotas
        System.out.println("\n-----------------------------------------");
        System.out.print("\nIngresa el tipo de animal (perro, gato, ave, pez): ");
        String animal = scanMain.nextLine();
        Taller5.ClasificacionMascotas(animal);

        //AccesoParqueadero
        System.out.println("\n-----------------------------------------");
        System.out.print("\nIngresa el tipo de vehiculo (carro, moto, bicicleta): ");
        String tipoVehiculo = scanMain.nextLine();
        System.out.print("Ingresa la hora de entrada (solo la hora en formato de 24 horas): ");
        int hora = scanMain.nextInt();
        scanMain.nextLine();//Limpieza de buffer
        Taller5.AccesoParqueadero(tipoVehiculo, hora);

        //PromocionesRopa
        System.out.println("\n-----------------------------------------");
        System.out.print("\nSeleccione el tipo de prenda (camisa, pantalon, chaqueta): ");
        String tipoPrenda = scanMain.nextLine();
        System.out.print("Ingrese la cantidad de prendas: ");
        int cantidad = scanMain.nextInt();
        scanMain.nextLine();//Limpieza de buffer
        Taller5.PromocionesRopa(tipoPrenda, cantidad);

        scanMain.close();
    }//Cierre metodo main
}//Cierre clase main
