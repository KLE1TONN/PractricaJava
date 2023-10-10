
package todocode;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {    
          
        double promedio;
        String condicionFinal;
        
        Scanner teclado = new Scanner(System.in);
        
            System.out.println("Ingrese promeido General Alumno Todo code");
            promedio = teclado.nextDouble();
            
            condicionFinal = promedio >=6 ? "Aprobado" : "Desaprobado";
            
            System.out.println("La condiicon final del alumno es: " + condicionFinal);
                
        
    }
}
