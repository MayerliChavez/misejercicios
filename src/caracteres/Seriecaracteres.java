package caracteres;

public class Seriecaracteres {
    public void Serie3(int valor){
        for (int i = 0; i <= valor; i++) {
            if((i % 2) != 0 || i == 2){
                System.out.print(" + ");
            }
        }
    }
}
