
package primer.proyecto;

import java.util.Scanner;

public class EjerciciodeWoods1 {
        
    public static void main (String[] args) {
        //Ingresar dos numeros, restarlos entre si, mostrar mensaje de "el resultado es: ", al resultado
        //elegir otro numero para sumar y largar otro mensaje de "el resultado es: "
        System.out.println("Ingrese el primer numero");
        Scanner teclado = new Scanner (System.in);
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero para restarle");
        int num2 = teclado.nextInt();
        int resultado = num1 - num2;
        System.out.println("El Resultado es :" + resultado);
        
                System.out.println("Ahora elija un numero por el cual sumarlo");
                int num3 = teclado.nextInt();
                int resultado2 = resultado + num3;
                System.out.println("Excelente, el resultado es: " +resultado2);
                
                //APROBADO
               
                
        
    }
}
