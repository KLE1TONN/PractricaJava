
package todocode;

import java.util.Scanner;

public class zEJERCICIOFINAL {
    
    public static void main(String[] args) {
        
        
    //asignacion de vectores
    int vector[] = new int [15]; 
        Scanner teclado = new Scanner (System.in);
        for (int i=0; i<15; i++) {
        System.out.println("Ingrese los valores correspondientes a cada vector");
            vector[i] = teclado.nextInt();
        }
        
    //Recorrer y contar cuantos numeros 3 hay
    int cont = 0;
        for (int i=0; i<15; i++) {
            if (vector[i] == 3) {
                cont = cont +1;
            }
        }
        System.out.println("La cantidad de Numeros 3 que se observan, son: " +cont);
    }
}