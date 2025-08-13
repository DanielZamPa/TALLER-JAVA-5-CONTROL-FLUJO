package Clase3;
import java.util.Scanner;
import java.util.Random;
public class Taller5 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random generadorAleatorio = new Random();

    public static void FacturacionMercado(){}//Cierre metodo FacturacionMercado

    public static void ClasificacionMascotas(String animal){
        int indiceEspecialista;
        int edad;
        switch (animal.toLowerCase()) {
            case "perro":
                String[] especialistaCaninos = {"Ana", "Luis", "Carlos", "Sofia", "Elena"};
                indiceEspecialista = generadorAleatorio.nextInt(especialistaCaninos.length);
                System.out.println("\nEl especialista asignado es: " + especialistaCaninos[indiceEspecialista]);
                System.out.print("Ingresa la edad: ");
                edad = scanner.nextInt();
                scanner.nextLine();//Limpieza de buffer
                if (edad >= 5) {System.out.println("Se recomienda vacunación adicional.");}
                break;
            case "gato":
                String[] especialistaFelinos = {"Maria", "Juan", "Pedro"};
                indiceEspecialista = generadorAleatorio.nextInt(especialistaFelinos.length);
                System.out.println("\nEl especialista asignado es: " + especialistaFelinos[indiceEspecialista]);
                System.out.print("Ingresa la edad: ");
                edad = scanner.nextInt();
                scanner.nextLine();//Limpieza de buffer
                if (edad >= 5) {System.out.println("Se recomienda vacunación adicional.");}
                break;
            case "ave":
                String[] especialistaAves = {"Luis", "Carlos", "Maria"};
                indiceEspecialista = generadorAleatorio.nextInt(especialistaAves.length);
                System.out.println("\nEl especialista asignado es: " + especialistaAves[indiceEspecialista]);
                break;
            case "pez":
                String[] especialistaPeces = {"Luis", "Pedro", "Elena"};
                indiceEspecialista = generadorAleatorio.nextInt(especialistaPeces.length);
                System.out.println("\nEl especialista asignado es: " + especialistaPeces[indiceEspecialista]);
                break;
            default:
                System.out.println("Animal no reconocido en el sistema.");
        }//Cierre switch
    }//Cierre metodo ClasificacionMascotas


    public static void AccesoParqueadero(){}//Cierre metodo AccesoParqueadero

    public static void PromocionesRopa(){}//Cierre metodo PromocionesRopa
}
