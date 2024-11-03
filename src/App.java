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
       System.out.print("Figuras");
       System.out.println(" ");
       System.out.print("S5:");
       System.out.println(" ");
       new figurascadenas.Figuras().g2_crearFigurasS5();

       System.out.println(" ");
       System.out.print("S7: ");
       System.out.println(" ");
       new figurascadenas.Figuras().g2_crearFigurasS7();

       System.out.println(" ");
       System.out.print("S12: ");
       System.out.println(" ");
       new figurascadenas.Figuras().g2_crearFigurasS12();

       leer.close();
    }
}
