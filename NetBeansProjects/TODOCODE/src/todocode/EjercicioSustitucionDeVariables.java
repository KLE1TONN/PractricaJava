
package todocode;

public class EjercicioSustitucionDeVariables {

    
    public static void main(String[] args) {     
        
        int num1= 35;
        int num2= 20;
        int aux;
                
        System.out.println("----------ANTES---------");
        System.out.println("num1: "+num1);
        System.out.println("num2: " +num2);
        
        aux = num2;
        num2= num1;
        num1= aux;
        
        System.out.println("----------DESPUES---------");
        System.out.println("num1: " +num1);
        System.out.println("num2: " +num2);
    }  
    
}
