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
        String tipo = scanMain.nextLine();
        System.out.print("Ingresa la hora de entrada (solo la hora en formato de 24 horas): ");
        int hora = scanMain.nextInt();
        scanMain.nextLine();//Limpieza de buffer
        Taller5.AccesoParqueadero(tipo, hora);

        //PromocionesRopa
        scanMain.close();
    }//Cierre metodo main
}//Cierre clase main
