import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        new presentacion.saludo().presentacion();

       System.out.print("Serie de numeros");
       System.out.println(" ");
       System.out.print("S2:");
       System.out.println(" ");
       new series.Serienumeros().g2_crearSerienumericaS2();

       
       System.out.println(" ");
       System.out.print("S4: ");
       System.out.println(" ");
      new series.Serienumeros().g2_crearSerienumericaS4();

       System.out.println(" ");
       System.out.print("S9: ");
       System.out.println(" ");
      new series.Serienumeros().g2_crearSerienumericaS9();


       System.out.println(" ");
       System.out.print("Serie de caracteres");
       System.out.println(" ");
       System.out.print("S3:");
       System.out.println(" ");
       new series.Seriecaracteres().g2_crearSeriecaractereS3();

       System.out.println(" ");
       System.out.print("S8: ");
       System.out.println(" ");
       new series.Seriecaracteres().g2_crearSeriecaractereS8();

       System.out.println(" ");
       System.out.print("Figuras: ");
       System.out.println(" ");
       System.out.print("F5:");
       System.out.println(" ");
       new figurascadenas.Figuras().g2_crearFigurasF5();

       System.out.println(" ");
       System.out.print("F7: ");
       System.out.println(" ");
       new figurascadenas.Figuras().g2_crearFigurasF7();

       System.out.println(" ");
       System.out.print("F12: ");
       System.out.println(" ");
       new figurascadenas.Figuras().g2_crearFigurasF12();

       System.out.println(" ");
       System.out.print("F13: ");
       System.out.println(" ");
       new figurascadenas.Figuras().g2_crearFigurasF13();

       System.out.println(" ");
       System.out.print("Cadenas de caracteres:");
       System.out.println(" ");
       System.out.print("C02:");
       System.out.println(" ");
       new figurascadenas.Cadenas().g2_crearCadenaCaracteresC02();

       System.out.println(" ");
       System.out.print("C06: ");
       System.out.println(" ");
       new figurascadenas.Cadenas().g2_crearCadenaCaracteresC06();

       System.out.println(" ");
       System.out.print("C07: ");
       System.out.println(" ");
       new figurascadenas.Cadenas().g2_crearCadenaCaracteresC07();

       System.out.println(" ");
       System.out.print("Arrays:");
       System.out.println(" ");
       System.out.print("A03:");
       System.out.println(" ");
       new arrays.Arryas().g2_crearArraysA03();

       leer.close();
    }
}
