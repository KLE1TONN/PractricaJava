
package todocode;

import java.util.Scanner;

public class EjercicioLimiteDePalabra {
    
    public static void main(String[] args) {
        String salir = "salir";
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese palabras");
        String palabra = teclado.nextLine();
        while (!palabra.equals("salir")) {
                System.out.println("La palabra es " + palabra);
                palabra = teclado.nextLine();
                       
        }
    }
        
}

