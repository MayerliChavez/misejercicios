package series;

public class Seriecaracteres {
    public void g2_crearSeriecaractereS3(int valor){
        for (int i = 1; i <= valor; i++) {
            if(i != 1 && (i % i)== 0){
                int n=1;
                while (n <= i){
                    System.out.print("+");
                    n++;
                }
                System.out.print(" ");
            }
        }
     System.out.println(" ");
    }
}
