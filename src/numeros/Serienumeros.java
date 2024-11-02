package numeros;

public class Serienumeros {
    public void Serie2(int rango){
            for (int i = 1; i <= rango; i++) {
                if((i % 2) != 0){
                    System.out.print(i + " ");

                }
                else{
                System.out.print("0 ");
                }
            }    
    }

    public void Serie4(int rango){
        for(int i = 0 ; i <= rango ; i++){
            for(int j= 1; i <= rango; j++){

            }
        }
    }

   public void Serie9(int rango){
    double n=1d;
        while ( n <= rango){
            double elevador = Math.pow(2,n);
            System.out.print((int)(elevador) + " ");
            n++;
        }
   }
}
