
package todocode;

import java.util.Scanner;

public class NumerosLimite {
    public static void main(String[] args){
        //un limite hasta el que el programa tiene que contar
        //Ingresar limite
        System.out.println("ingrese el limite hasta el que quiere contar");
        Scanner teclado = new Scanner (System.in);
        int limite = teclado.nextInt();
        int cont = 0;
        
        while (cont <= limite) {
            System.out.println(cont);
            cont++;
            
        }
    }
    
}
