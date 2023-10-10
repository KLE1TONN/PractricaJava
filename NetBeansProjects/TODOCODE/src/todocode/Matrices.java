
package todocode;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        
        //Declaración
        int matriz [][] = new int [3][3];
        
        
        /*Asignación
        matriz[0][0] = 5;
        matriz[0][1] = 13;
        matriz[0][2] = 24;
        matriz[1][0] = 45;
        matriz[1][1] = 30;
        matriz[1][2] = 53;
        matriz[2][0] = 2;
        matriz[2][1] = 94;
        matriz[2][2] = 23;*/
        
        //Asignacion con teclado
        for (int f=0; f<3; f++) {
           for (int c=0; c<3; c++) {
        Scanner teclado = new Scanner (System.in);
               System.out.println("Ingrese el calor de la posicion f: " + f + "c: " + c);
               matriz[f][c]=teclado.nextInt();
           }
        }
        
        
        //Recorrido
        for (int f=0; f<3; f++) {
           for (int c=0; c<3; c++) {
               System.out.println("El valor de la Posicion F: " + f + " c: " + c);
               System.out.println("es de " + matriz[f][c]);
               
           } 
        }
    }
}
