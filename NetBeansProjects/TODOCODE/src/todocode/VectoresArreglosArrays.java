
package todocode;

import java.util.Scanner;

public class VectoresArreglosArrays {
    
    public static void main(String[] args) {
        
        //declaracion
        int vector [] = new int [4];
        
        /*Asignacion Manual
        vector[0]=2;
        vector[1]=35;
        vector[2]=48;
        vector[3]=157;*/
        
        //Asignacion por Teclado
            Scanner teclado = new Scanner (System.in);
                for (int i=0; i<vector.length; i++) {
                System.out.println("Ingrese el valor para el indice " +i);
                vector[i]=teclado.nextInt();
             
             
         }
                
                
        
        //Recorrido    
            for (int i=0; i<vector.length; i++) {
                System.out.println("Estoy en el Indice: " + i);
                System.out.println("Tengo guardado un: " + vector[i]);
                System.out.println("------------------");    
        }
    }
}
