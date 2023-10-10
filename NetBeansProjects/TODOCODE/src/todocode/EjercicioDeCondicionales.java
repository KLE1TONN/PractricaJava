
package todocode;

import java.util.Scanner;

public class EjercicioDeCondicionales {
        public static void main(String[] args) {
            
                double sueldo=0;
                /*3 tipos de laburo 
                1- repositor (35560,20)  2_ cajero (25630.89)º 3_ supervisor
                System.out.println("Ingrese el tipo de Empleado");*/
                Scanner teclado = new Scanner ( System.in);
                int categoria = teclado.nextInt();
            
                 if (categoria == 1) {
                sueldo = 15890 + (15890*0.10);
                }
                else {
                        if (categoria == 2) {
                        sueldo = 25630.89;
                        }
                        else {
                                if (categoria == 3) {
                                sueldo = 35560.20 - (35560.20*0.11);
                                }
                                else {
                                System.out.println("Ingreso un numero de categoria INCORRECTO");
                                }
                        }
                }
                if (categoria == 1 || categoria == 2 || categoria == 3) {
                        System.out.println("La categoria de la persona es: " + categoria);
                        System.out.println("El sueldo de la persona: " + sueldo);
                }
            
}
}
