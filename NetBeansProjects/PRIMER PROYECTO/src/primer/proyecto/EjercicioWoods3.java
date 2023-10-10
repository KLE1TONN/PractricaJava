package primer.proyecto;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioWoods3 {

    public static void main(String[] args) {
        /* Necesito un programa para un supermercado, en este se van a ir ingresando
        los productos. Si los productos ingresados son "leche", "pan" o "azúcar",
        debe aparecer un mensaje que diga, "este producto tiene un 20% descuento".
        Si se ingresa productos como "cereales" o "fruta", debe aparecer el
        mensaje "Este producto tiene un 5% de descuento, che rata coluda". */

 /*Bien, se pide mejorar el programa agregando que ademas del nombre del 
        producto pida el precio, y que se apliquen los descuentos correspondientes, 
        despues que al final muestre el resultado con los descuentos aplicados*/
        String leche = "leche";
        String pan = "pan";
        String azucar = "azucar";
        String cereales = "cereales";
        String fruta = "fruta";
        String fin = "fin";
        Double desc1 = 0.20;
        Double desc2 = 0.05;

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        List<String> Productos = new ArrayList<>();
        List<Double> PrecioProductos = new ArrayList<>();
        List<Double> DescPorProd = new ArrayList();

        while (true) {
            System.out.println("Ingrese el producto que desea agregar (o escriba 'fin' para salir): ");
            String producto = teclado.nextLine();

            if (producto.equals(fin)) {
                System.out.println("Fin de la lista raton de mierda, anda a la caja que te vamos a cojer");
                break; // Terminar la lista

            }
            System.out.println("Indique el precio del producto");
            Double precio = teclado2.nextDouble();

            Double descuento = 0.0;

            if (producto.equals(leche) || producto.equals(pan) || producto.equals(azucar)) {
                descuento = precio * desc1;
                System.out.println("El producto '" + producto + "' tiene 20% de descuento");
                System.out.println("---------------------------------------------------");
            } else if (producto.equals(cereales) || producto.equals(fruta)) {
                descuento = precio * desc2;
                System.out.println("El producto '" + producto + "' tiene 5% de descuento, che rata coluda");
                System.out.println("---------------------------------------------------");

            } else {
                System.out.println("Este producto no tiene DESCUENTO, ¡RATÓN!");
                System.out.println("---------------------------------------------------");
            }
            Productos.add(producto);
            PrecioProductos.add(precio);
            DescPorProd.add(descuento);
        }

        //muestra de la lista total con los descuentos
        System.out.println("\nLista de productos y sus respectivos descuentos");
        for (int i = 0; i < Productos.size(); i++) {
            String Producto = Productos.get(i);
            Double precio = PrecioProductos.get(i);
            Double descuento = DescPorProd.get(i);
            System.out.println("-------------------------------");
            System.out.println("Producto: " + Producto);
            System.out.println("Precio del Producto: $ " + precio);
            System.out.println("Precio con descuento: $ " + (precio - descuento));
            System.out.println("");
        }
    }
}
