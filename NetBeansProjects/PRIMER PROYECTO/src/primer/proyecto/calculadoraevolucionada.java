
package primer.proyecto;
import java.util.Scanner;

public class calculadoraevolucionada {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int primernumero = 1;
        int segundonumero = 2;
        int resultado = 0;
        
        System.out.println("Ingrese Primer Numero");
        primernumero = entrada.nextInt();
        System.out.println("Ingrese Segundo Numero");
        segundonumero = entrada.nextInt ();
        resultado = primernumero * segundonumero;
    
        System.out.println("El Resultado es: " +resultado);
       }
}