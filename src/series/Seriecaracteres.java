package series;

public class Seriecaracteres {
    public void g2_crearSeriecaractereS3(int valor){
        for (int i = 2; i <= valor; i++) {
            int contador = 2;
            boolean primo= true;
            while(primo && contador < i){
                if((i % contador) == 0){
                    primo = false;
                }
                else{
                    contador ++;
                }
            }
            if (primo){
                int indicedelmas = 1;
                while (indicedelmas <= i){
                     System.out.print("+");
                     indicedelmas ++;
                }
                System.out.print("  ");
            }
        }
     System.out.println(" ");
    }

    
}
