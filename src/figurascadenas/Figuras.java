package figurascadenas;

import java.util.Scanner;

public class Figuras {
    Scanner leer = new Scanner(System.in);
    public void g2_crearFigurasS5(){
        System.out.print("Ingrese el tamanio de la figura: ");
        int tamanio= leer.nextInt();
        System.out.print("Ingrese el numero de niveles de ls figura: ");
        int nivel= leer.nextInt();
        System.out.println("La figura es: ");

        for (int fila = tamanio; fila >= 1; fila--) {
            for (int i = 0; i < nivel; i++) {
                System.out.print("  ");
            }
            for (int columna = 1; columna <= tamanio - fila; columna++) {
                System.out.print("  ");
            }
            for (int asterisco = 1; asterisco <= (2 * fila) - 1; asterisco++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
        System.out.println(" ");
    }
}
