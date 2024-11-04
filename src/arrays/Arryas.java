package arrays;

import java.util.Scanner;

public class Arryas {
    Scanner leer = new Scanner(System.in);

    public void g2_crearArraysA03(){
        System.out.print("Introduce una frase: ");
        String nombre= leer.nextLine();

        int longitud = nombre.length();
        int alturaMaxima = 2 * (longitud - 1); // Altura máxima en el eje Y

        // Dibujar el gráfico
        for (int y = alturaMaxima; y >= 0; y--) {
            System.out.print(y + " | "); // Etiqueta del eje Y

            boolean letraImpreso = false;
            for (int x = 0; x < longitud; x++) {
                if (2 * x == y) {
                    System.out.print(nombre.charAt(x) + " ");
                    letraImpreso = true;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Dibujar el eje X
        System.out.print(" 0 ");
        for (int x = 0; x < longitud; x++) {
            System.out.print("__");
        }
        System.out.println();
    }
}
