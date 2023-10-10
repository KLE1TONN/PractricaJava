
package primer.proyecto;

import java.util.Scanner;

public class EjercicioWoodsVectores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        /*se pide crear un programa en donde se van ingresando numeros, el 
        ingreso de (-1) hace que se termine el ingreso de numeros, mientras 
        estos numeros se ingresan se tienen que ir sumando y al ingresar -1 para 
        terminar la ejecucion debe mostrar la suma de los numeros ingresados*/
        int suma = 0;
        
        System.out.println("Ingrese números para sumar.");
        
        while (true) {
            int numero = teclado.nextInt();
            
            if (numero == -1) {
                System.out.println("lol");
                break; // Salir del bucle si se ingresa -1
            }
            else {
                suma += numero;
            }
        }
        
        System.out.println("La suma de los números ingresados es: " + suma);
        
        teclado.close();  
        }
    }    

