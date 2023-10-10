
package todocode;

import java.util.Scanner;

public class MatricesIFyFor {
        public static void main(String[] args) {
        
        Double Matriz[][] = new Double[4][4];
        Scanner teclado = new Scanner (System.in);
        Double suma = 0.0;
                
        //for para cargar matriz
        for (int f=0; f<4; f++) {
            for (int c=0; c<3; c++) {
                
                System.out.println("Ingrese el Alumno numero: " + f);
                Matriz[f][c] = teclado.nextDouble();
                suma = suma + Matriz[f][c];
            }    
            Matriz[f][3] = suma / 3;
            suma = 0.0;
        }
        
        //for de recorrido de matriz
        for (int f=0; f<4; f++) {
            System.out.println("Las notas del alumno numero " + f + ". Son: ");
            for (int c=0; c<3; c++) {   
            
                System.out.println("Nota Nº " + c + ": " +Matriz[f][c]);
            }
            System.out.println("El promedio de las notas es: " + Matriz[f][3]);
                   }   
    }
}
