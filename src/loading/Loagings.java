package loading;

import java.util.Scanner;

public class Loagings {
    Scanner leer = new Scanner(System.in);
    
    public void g2_crearLoadingL03(){
        System.out.print("Introduce el carácter para la barra de carga: ");
        char caracter = leer.next().charAt(0);

        int longitudBarra = 20;
        for (int porcentaje = 0; porcentaje <= 100; porcentaje += 5) {
            StringBuilder barra = new StringBuilder();

            int posicion = (porcentaje * (longitudBarra - 1)) / 100;

            for (int i = 0; i < longitudBarra; i++) {
                if (i == posicion) {
                    barra.append(caracter);
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

    public void g2_crearLoadingL08(){
            System.out.print("Ingrese su nombre y apellido: ");
            String caracter = leer.nextLine().replace(" ", "");
            
            int longitudFija = 20; 
            int longitud = caracter.length();
            for (int barracarga = 1; barracarga <= longitud; barracarga++) {
                int porcentaje = (barracarga * 100) / longitud;
        
                StringBuilder barra = new StringBuilder();
        
                for (int avance = 0; avance < longitudFija; avance++) {
                    if (avance < barracarga && avance < longitud) {
                        barra.append(caracter.charAt(avance));
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