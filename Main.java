package Clase3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanMain =new Scanner(System.in);
        System.out.print("Ingresa el tipo de animal (perro, gato, ave, pez): ");
        String animal = scanMain.nextLine();
        Taller5.ClasificacionMascotas(animal);
        scanMain.close();
    }//Cierre metodo main
}//Cierre clase main
