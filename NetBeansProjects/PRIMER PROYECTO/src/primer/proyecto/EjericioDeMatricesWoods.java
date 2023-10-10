package primer.proyecto;

import java.util.Scanner;

public class EjericioDeMatricesWoods {

    public static void main(String[] args) {
        /*Necesito un programa donde se carga el nombre y la nota de los alumnos, 
        en este caso 3 notas por alumno, la carga finaliza al ingresar -1, 
        al finalizar la carga debe mostrar el nombre de los alumnos, 
        su promedio y si aprobaron la materia, donde los requisitos para aprobar 
        la materia es tener un promedio de igual o mayor a 6.*/
        //primero: carga de matriz;
        
        int numAlumnos = 4;
        Double notas[][] = new Double[4][4];
        String nombres[] = new String[numAlumnos];
        Scanner tcl = new Scanner(System.in);
        Double suma = 0.0;
        
        for (int f = 0; f < numAlumnos; f++) {
            System.out.println("Ingrese el nombre del alumno Nº " + (f + 1) + ": ");
            nombres[f] = tcl.next();
        }    
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese las notas del alumno: "  + nombres[f]);
                notas [f][c] = tcl.nextDouble();
                suma = suma + notas [f][c];
            }    
            notas[f][3] = suma / 3;
            suma = 0.0;
        }
        //Segundo: Recorrido de la matriz;
        for (int f=0;f<4;f++) {
            System.out.println("Las notas del alumno " +nombres[f]+ " son: ");
            for (int c=0;c<3;c++) {
                System.out.println("Nota Nº " +c+ ": " +notas[f][c]);
            }
            System.out.println("El Promedio de las notas: es: " +notas[f][3]);
            if (notas[f][3]<4) {
                System.out.println("El alumno esta desaprobado");
                }
                else { 
                    System.out.println("El alumno esta aprobado");
            
            }
        System.out.println("--------------------------------");
        }
        
    }
}
