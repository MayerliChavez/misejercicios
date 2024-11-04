package loading;

import java.util.Scanner;

public class Loagings {
    Scanner leer = new Scanner(System.in);


    public void g2_crearLoagingL03(){
        System.out.print("Ingrese el rango de la operacion: ");
        char caracter = leer.next().charAt(0);
        System.out.println("La operacion es: ");
         
         // Longitud de la barra
         int longitudBarra = 20;
 
         // Desplazamiento del carácter de izquierda a derecha
         for (int i = 0; i < longitudBarra; i++) {
             // Limpia la consola
             System.out.print("\r"); // Mueve el cursor a la posición de inicio
 
             // Crea la barra con el carácter en la posición i
             for (int j = 0; j < longitudBarra; j++) {
                 if (j == i) {
                     System.out.print(caracter); // Imprime el carácter en la posición actual
                 } else {
                     System.out.print(" "); // Rellena con espacios
                 }
             }
 
             // Espera un poco antes de continuar con el siguiente movimiento
             try{
             Thread.sleep(200); // Espera 200 ms
             }catch(InterruptedException e){
                System.out.println("Retraso completado ");
             }
            }
    }
}
