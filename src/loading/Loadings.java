package loading;

import java.util.Scanner;

public class Loadings {
    Scanner leer = new Scanner(System.in);
    
    public void g2_crearLoadingL03(char caracter) {
        int longitudBarra = 20;
        boolean haciaDerecha = true;
        int posicion = 0;
    
        for (int porcentaje = 0; porcentaje <= 100; porcentaje ++) {
            StringBuilder barra = new StringBuilder(" ".repeat(longitudBarra));
    
            barra.setCharAt(posicion, caracter);
    
            System.out.print("\r[" + barra + "] " + porcentaje + "%");
    
            if (haciaDerecha) {
                posicion++;
                if (posicion == longitudBarra - 1) {
                    haciaDerecha = false;
                }
            } else {
                posicion--;
                if (posicion == 0) {
                    haciaDerecha = true;
                }
            }
    
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Retraso completado ");
            }
        }
        System.out.print("\r[" + "                   " + caracter + "] " + "100" + "%");
        System.out.println("\nCarga completada!");
    }

    public void g2_crearLoadingL05(){
        int longitudBarra = 20;
        for (int barraprogreso = 1; barraprogreso <= longitudBarra; barraprogreso++) {
            int porcentaje = (barraprogreso * 100) / longitudBarra;
            StringBuilder barra = new StringBuilder();

            for (int avance = 0; avance < longitudBarra; avance++) {
                if (avance < barraprogreso - 1) {
                    barra.append("=");
                } else if (avance == barraprogreso - 1) {
                    barra.append(barraprogreso % 2 == 0 ? ">" : "-");
                } else {
                    barra.append(" ");
                }
            }

            System.out.print("\r[" + barra + "] " + porcentaje + "%");
            try{
                Thread.sleep(400); 
                }catch(InterruptedException e){
                   System.out.println("Retraso completado ");
                }
        }
        System.out.println("\n¡Carga completa!");
    }

    public void g2_crearLoadingL08(String digito){
            int longitudFija = 20; 
            int longitud = digito.length();
            for (int barracarga = 1; barracarga <= longitud; barracarga++) {
                int porcentaje = (barracarga * 100) / longitud;
        
                StringBuilder barra = new StringBuilder();
        
                for (int avance = 0; avance < longitudFija; avance++) {
                    if (avance < barracarga && avance < longitud) {
                        barra.append(digito.charAt(avance));
                    } else {
                        barra.append(" ");
                    }
                }
                System.out.print("\r[" + barra + "] " + porcentaje + "%");
                
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println("Retraso completado ");
                }
            }
    }
}