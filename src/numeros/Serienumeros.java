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
}
