
package primer.proyecto;

import java.util.Scanner;

public class EjerciciodeWoods2 {
    
         public static void main(String[] args) {    
    
         // Necesito un programa de loteria en donde las personas van ingresando su nombre y un numero, 
         //si el numero es igual 33 entonces tiene que salir el mensaje, 
         //"Ha ingresado el numero 33 usted! Es el ganador! Felicidades (nombre de persona)"
    
         System.out.println("Ingrese su Nombre");
         Scanner teclado = new Scanner(System.in);
         String nombre = teclado.nextLine();
         
                  System.out.println("Ingrese su numero de Quiniela");
                  double numero = teclado.nextDouble();
         
                           if (numero == 33) {
                           System.out.println("Ha ingresado el numero: " + numero + " Felicitaciones! " + nombre +" usted es el ganador del premio!");
                           }
                           else { 
                                if (numero != 33) {
                                    System.out.println("Ingresaste el numero: " + numero + "! segui participando gordito");
                                } 
         }
         
         
         
        
        
    
    
    
    
    
    
    
}
    
}
