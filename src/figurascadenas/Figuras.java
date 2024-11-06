package figurascadenas;

import java.util.Scanner;

public class Figuras {
    Scanner leer = new Scanner(System.in);

    public void g2_crearFigurasF5(int tamanio){
        System.out.println("");
        if(tamanio > 0){
                System.out.println("La figura es: ");
                for(int fila = tamanio; fila > 0 ; fila --){
                    for(int espacios = 0; espacios < tamanio - fila; espacios ++){
                        System.out.print("  ");
                    }
                    for( int asteriscos = 0; asteriscos < (2*fila)-1; asteriscos ++){
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
            }else{
                System.out.print("Ingreso invalido!!!");
                System.out.print("porfavor ingrese un nuevo tamanio:");
                tamanio= leer.nextInt();
                g2_crearFigurasF5(tamanio);
            }    
    }

    public void g2_crearFigurasF7(int tamanio){
        System.out.println("");
        if(tamanio > 0){
                System.out.println("La figura es: ");
                for(int fila = 0 ; fila <= tamanio; fila ++){
                    for( int columna =0; columna <= fila *2; columna ++){
                        while( columna == 0 && fila == 0){
                            System.out.print("__");
                            System.out.println("");
                            columna ++;
                        }
                        System.out.print("  ");
                    }
                    System.out.print("|__");
                    System.out.println("");
                }
        }else{
            System.out.print("Ingreso invalido!!!");
            System.out.print("porfavor ingrese un nuevo tamanio:");
            tamanio= leer.nextInt();
            g2_crearFigurasF7(tamanio);
        }
    }

    public void g2_crearFigurasF12(int tamanio){
        System.out.println("");
        if(tamanio > 0){
            System.out.println("La figura es: ");
            for (int fila = 1; fila  <= tamanio; fila++) {
                for (int columna = 1; columna <= tamanio - fila ; columna++) {
                    System.out.print(columna + " ");
                }
                System.out.println("");
            }
        }else{
            System.out.print("Ingreso invalido!!!");
            System.out.print("porfavor ingrese un nuevo tamanio:");
            tamanio= leer.nextInt();
            g2_crearFigurasF12(tamanio);
        }

    }

    public void g2_crearFigurasF13(int tamanio){
        System.out.println("");
        if(tamanio > 0){
            System.out.println("La figura es: ");
            for (int fila = tamanio ; fila >= 0; fila--) {
                for (int columna = 1; columna < tamanio - fila; columna++) {
                    System.out.print(columna + " ");
                }
                System.out.println("");
            } 
        }else{
            System.out.print("Ingreso invalido!!!");
            System.out.print("porfavor ingrese un nuevo tamanio:");
            tamanio= leer.nextInt();
            g2_crearFigurasF13(tamanio);
        }   
    }
}
