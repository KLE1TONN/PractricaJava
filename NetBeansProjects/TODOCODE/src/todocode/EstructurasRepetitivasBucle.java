package todocode;

public class EstructurasRepetitivasBucle {
    public static void main(String[] args) {
        // contador
        int cont = 0;
        
        while (cont <=10){
            System.out.println("Estoy en la Vuelta " + cont);
            cont = cont +1;
        }
        //centinela
        boolean centinela = true;
        
        while (centinela == true){
            System.out.println("Estoy en la Vuelta " + centinela);
            
            if (centinela = true) {
                System.out.println("este mensaje esta bien");
                break;
                } else {
                        System.out.println("este mensaje esta mal");
                        break;
                        }
        }
    }         
}

