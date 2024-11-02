package series;

public class Serienumeros {
    public void g2_crearSerienumericaS2(int rango){
            for (int i = 1; i <= rango; i++) {
                if((i % 2) != 0){
                    System.out.print(i + " ");
                }
                else{
                System.out.print("0 ");
                }
            } 
        System.out.println("");   
    }

    /*public void Serie4(int rango){
        for(int i = 0 ; i <= rango ; i++){
            for(int j= 1; i <= rango; j++){

            }
        }

       System.out.println("");   
    }*/

   public void g2_crearSerienumericaS9(int rango){
        double n=1d;
        while ( n <= rango){
            double elevador = Math.pow(2,n);
            System.out.print((int)(elevador) + " ");
            n++;
        }
        System.out.println("");   
   }
}
