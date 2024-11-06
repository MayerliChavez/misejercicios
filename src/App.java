import automata.Automatas;
import java.util.Scanner;
import loading.Loadings;
import recursiones.Recursiones;
import series.Seriecaracteres;
import series.Serienumeros;
import figurascadenas.Cadenas;
import figurascadenas.Figuras;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int rango;
        int valor;
        int tamanio;
        int datos;
        int base;
        int potencia;
        char caracter;
        String frase;
        String nombre;
        String digito;
        String entrada;

      Serienumeros op = new Serienumeros();
       System.out.println(">---------- Serie de numeros ----------<");
       System.out.println("" + "S2:");
       System.out.print("Ingrese el rango de la operacion a realizar: ");
       rango= leer.nextInt();
       op.g2_crearSerienumericaS2(rango);
       System.out.println(" ");
       System.out.println("" + "S4: ");
       System.out.print("Ingrese el rango de la operacion a realizar: ");
       rango= leer.nextInt();
       op.g2_crearSerienumericaS4(rango);
       System.out.println(" ");
       System.out.println("" + "S9: ");
       System.out.print("Ingrese el rango de la operacion a realizar: ");
       rango= leer.nextInt();
       op.g2_crearSerienumericaS9(rango);


       Seriecaracteres op1 = new Seriecaracteres();
       System.out.println(" ");
       System.out.println(">---------- Serie de caracteres ----------<");
       System.out.println("" + "S3:");
       System.out.print("Ingrese el rango de la operacion a realizar: ");
       valor= leer.nextInt();
       op1.g2_crearSeriecaractereS3(valor);
       System.out.println(" ");
       System.out.println( "" + "S8: ");
       System.out.print("Ingrese el rango de la operacion a realizar: ");
       valor= leer.nextInt();
       op1.g2_crearSeriecaractereS8(valor);


       Figuras op2 = new Figuras();
       System.out.println(" ");
       System.out.print(">---------- Figuras ----------<");
       System.out.println( "" + "F5:");
       System.out.print("Ingrese el tamanio de la figura: ");
       tamanio= leer.nextInt();
       op2.g2_crearFigurasF5(tamanio);
       System.out.println(" ");
       System.out.println( "" + "F7: ");
       System.out.print("Ingrese el tamanio de la figura: ");
       tamanio= leer.nextInt();
       op2.g2_crearFigurasF7(tamanio);
       System.out.println(" ");
       System.out.println("" + "F12: ");
       System.out.print("Ingrese el tamanio de la figura: ");
       tamanio= leer.nextInt();
       op2.g2_crearFigurasF12(tamanio);
       System.out.println(" ");
       System.out.println("F13: ");
       System.out.print("Ingrese el tamanio de la figura: ");
       tamanio= leer.nextInt();
       op2.g2_crearFigurasF13(tamanio);
        leer.nextLine();


       Cadenas op3 = new Cadenas();
       System.out.println(" ");
       System.out.print(">---------- Cadenas de caracteres ----------<");
       System.out.println(" " +"C02:");
       System.out.print("Introduce una frase: ");
       frase= leer.nextLine();
       op3.g2_crearCadenaCaracteresC02(frase);
       System.out.println(" ");
       System.out.println("" + "C06: ");
       System.out.print("Introduce una frase: ");
       frase= leer.nextLine();
       op3.g2_crearCadenaCaracteresC06(frase);
       System.out.println(" ");
       System.out.println("" + "C07: ");
       System.out.print("Introduce una frase: ");
       frase= leer.nextLine();
       op3.g2_crearCadenaCaracteresC07(frase);


       
       System.out.println(" ");
       System.out.println(">------------ Arrays ----------<");
       System.out.println("" + "A03:");
       System.out.print("Introduca su nombre: ");
       nombre= leer.nextLine();
       new ejercicioareglos.ArreglosCasos().g2_crearArraysA03(nombre);
       
       
        Loadings op5 = new Loadings();
        System.out.println(" ");
        System.out.print(">---------- Loading ----------<");
        System.out.println(" " + "L03:");
        System.out.println(" ");
        System.out.print("Introduce el carácter para la barra de carga: ");
        caracter = leer.next().charAt(0);
        op5.g2_crearLoadingL03(caracter);
        System.out.println(" ");
        System.out.println("" + "L05: ");
        op5.g2_crearLoadingL05();
        leer.nextLine();
        System.out.println(" ");
        System.out.println(" " + "L08: ");
        System.out.print("Ingrese su nombre y apellido: ");
        digito = leer.nextLine().replace(" ", "");
        op5.g2_crearLoadingL08(digito);
               
               
        Recursiones op6 = new Recursiones();
        System.out.println(" ");
        System.out.println(">----------- Recursion ----------<");
        System.out.println(" " + "R01:");
        System.out.print("Ingrese el numero que desea conocer su factorial: ");
        datos = leer.nextInt();
        int factorial = op6.g2_crearRecursionR01(datos);
        System.out.print("El factorial del numero es: " + factorial);
        System.out.println(" ");
        System.out.println(" " + "R04: ");
        System.out.print("Ingrese la base de la potencia: ");
        base = leer.nextInt();
        System.out.print("Ingrese el exponenete de la potencia: ");
        potencia = leer.nextInt();
        int resultado = op6.g2_crearRecursionR04(base, potencia);
        System.out.print("La potencia del numero ingresado es: " + resultado);
        System.out.println(" ");
        leer.nextLine();

       
        Automatas op7 = new Automatas();
        System.out.println(" ");
        System.out.print(">---------- Automatas ----------<");
        System.out.println(" " + "A04:");
        System.out.print("Ingrese una cifra: ");
        entrada = leer.nextLine().trim();
        op7.g2_crearAutomataA04(entrada);
       
        leer.close();
               }
    }       
