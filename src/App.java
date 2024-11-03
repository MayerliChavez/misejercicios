public class App {
    public static void main(String[] args) throws Exception {
        new presentacion.saludo().presentacion();

       System.out.print("Serie de numeros");
       System.out.println(" ");
       System.out.print("S2:");
       System.out.println(" ");
       new series.Serienumeros().g2_crearSerienumericaS2(10);

       
       System.out.println(" ");
       System.out.print("S4: ");
       System.out.println(" ");
       //

       System.out.println(" ");
       System.out.print("S9: ");
       System.out.println(" ");
       new series.Serienumeros().g2_crearSerienumericaS9(15);


       System.out.println(" ");
       System.out.print("Serie de caracteres");
       System.out.println(" ");
       System.out.print("S3:");
       System.out.println(" ");
       new series.Seriecaracteres().g2_crearSeriecaractereS3(15);
    }
}
