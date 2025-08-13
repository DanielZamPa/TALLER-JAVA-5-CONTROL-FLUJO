package Clase3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanMain =new Scanner(System.in);
        //FacturacionMercado

        //ClasificacionMascotas
        System.out.print("Ingresa el tipo de animal (perro, gato, ave, pez): ");
        String animal = scanMain.nextLine();
        Taller5.ClasificacionMascotas(animal);

        //AccesoParqueadero

        System.out.print("Ingresa el tipo de vehiculo (carro, moto, bicicleta): ");
        String tipoVehiculo = scanMain.nextLine();
        System.out.print("Ingresa la hora de entrada (solo la hora en formato de 24 horas): ");
        int hora = scanMain.nextInt();
        scanMain.nextLine();//Limpieza de buffer
        Taller5.AccesoParqueadero(tipoVehiculo, hora);

        //PromocionesRopa
        System.out.print("Seleccione el tipo de prenda (camisa, pantalon, chaqueta): ");
        String tipoPrenda = scanMain.nextLine();
        System.out.print("Ingrese la cantidad de prendas: ");
        int cantidad = scanMain.nextInt();
        scanMain.nextLine();//Limpieza de buffer
        Taller5.PromocionesRopa(tipoPrenda, cantidad);

        scanMain.close();
    }//Cierre metodo main
}//Cierre clase main
