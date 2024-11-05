package ejercicioareglos;

import java.util.Scanner;

public class ArreglosCasos {
    Scanner leer = new Scanner(System.in);

    public void g2_crearArraysA03(String nombre){
        int longitud = nombre.length();
        int altura= 2 * (longitud);

        for (int ejey = altura; ejey >= 0; ejey--) {
            System.out.printf("%2d |", ejey);

            boolean letraImpreso = false;
            for (int ejex = 0; ejex < longitud; ejex++) {
                if (2 * ejex == ejey - 1) {
                    System.out.print("  "+nombre.charAt(ejex) + "  ");
                    letraImpreso = true;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.print("   | ");
        for (int x = 0; x < longitud; x++) {
            System.out.print("__");
        }
        System.out.println();
        System.out.println();
    }
}
