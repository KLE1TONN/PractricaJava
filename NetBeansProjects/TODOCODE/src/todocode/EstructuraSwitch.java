
package todocode;


public class EstructuraSwitch {
         public static void main(String[] args) {
                
         int dia = 10;
         String nombreDia;
         
         switch (dia) {
             
             case 1: nombreDia="Lunes";
             break;
             case 2: nombreDia="martes";
             break;
             case 3: nombreDia="miercoles";
             break;
             case 4: nombreDia="jueves";
             break;
             case 5: nombreDia="viernes";
             break;
             case 6: nombreDia="sabado";
             break;
             case 7: nombreDia="domingo";
             break;
             default: nombreDia="Numero de dia Invalido";
             break;            
         }
             System.out.println("El dia de la semana seleccionado es: " + nombreDia);
         }
         
                
}
