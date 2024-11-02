public class App {
    public static void main(String[] args) throws Exception {
        
       System.out.print("Serie de numeros creada para S2:");
       System.out.println(" ");
       new numeros.Serienumeros().Serie2(10);
       
       System.out.println(" ");
       System.out.print("Serie de numeros creada para S9:");
       System.out.println(" ");
       new numeros.Serienumeros().Serie9(15);

       System.out.println(" ");
       System.out.print("Serie de caracteres creada para S3:");
       System.out.println(" ");
       new caracteres.Seriecaracteres().Serie3(10);
    }
}
