import java.util.Scanner;
import recursiones.Recursiones;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        new presentacion.saludo().presentacion();

       System.out.println("Serie de numeros");
       System.out.println("S2:");
       new series.Serienumeros().g2_crearSerienumericaS2();

       
       System.out.println(" ");
       System.out.println("S4: ");
      new series.Serienumeros().g2_crearSerienumericaS4();

       System.out.println(" ");
       System.out.println("S9: ");
      new series.Serienumeros().g2_crearSerienumericaS9();


       System.out.println(" ");
       System.out.println("Serie de caracteres");
       System.out.println("S3:");
       new series.Seriecaracteres().g2_crearSeriecaractereS3();

       System.out.println(" ");
       System.out.println("S8: ");
       new series.Seriecaracteres().g2_crearSeriecaractereS8();

       System.out.println(" ");
       System.out.print("Figuras: ");
       System.out.println("F5:");
       new figurascadenas.Figuras().g2_crearFigurasF5();

       System.out.println(" ");
       System.out.println("F7: ");
       new figurascadenas.Figuras().g2_crearFigurasF7();

       System.out.println(" ");
       System.out.println("F12: ");
       new figurascadenas.Figuras().g2_crearFigurasF12();

       System.out.println(" ");
       System.out.println("F13: ");
       new figurascadenas.Figuras().g2_crearFigurasF13();

       System.out.println(" ");
       System.out.print("Cadenas de caracteres:");
       System.out.println("C02:");
       new figurascadenas.Cadenas().g2_crearCadenaCaracteresC02();

       System.out.println(" ");
       System.out.println("C06: ");
       new figurascadenas.Cadenas().g2_crearCadenaCaracteresC06();

       System.out.println(" ");
       System.out.println("C07: ");
       new figurascadenas.Cadenas().g2_crearCadenaCaracteresC07();

       System.out.println(" ");
       System.out.println("Arrays:");
       System.out.println("A03:");
       new arrays.Arryas().g2_crearArraysA03();

       System.out.println(" ");
       System.out.print("Loading: ");
       System.out.println("L03:");
       //new loading.Loagings().g2_crearLoagingL03();

       System.out.println(" ");
       System.out.println("Recursion: ");
       System.out.println("R01:");
       Recursiones op= new Recursiones();
       System.out.print("Ingrese el numero que desea conocer su factorial: ");
       int datos = leer.nextInt();
       int factorial = op.g2_crearRecursionR01(datos);
       System.out.print("El factorial del numero es: " + factorial);
       System.out.println(" ");

       Recursiones op2= new Recursiones();
       System.out.println(" ");
       System.out.println("R04: ");
       System.out.println("Ingrese la base de la potencia: ");
       int base = leer.nextInt();
       System.out.println("Ingrese el exponenete de la potencia: ");
       int potencia = leer.nextInt();
       int resultado = op2.g2_crearRecursionR04(base, potencia);
       System.out.print("La potencia del numero ingresado es: " + resultado);
       System.out.println(" ");

       System.out.println(" ");
       System.out.print("Automatas: ");
       System.out.println("A04:");
       new automata.Automatas().g2_crearAutomataA04();

       
       leer.close();
    }
}
