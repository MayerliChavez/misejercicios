package series;
import java.util.Scanner;

public class Seriecaracteres {
    Scanner leer = new Scanner(System.in);
    public void g2_crearSeriecaractereS3(int valor){
        System.out.println("");
        if( valor > 0){
                System.out.println("La operacion es: ");
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
        }else{
            System.out.print("Ingreso invalido!!!");
            System.out.print("porfavor ingrese un nuevo rango:");
            valor= leer.nextInt();
            g2_crearSeriecaractereS3(valor);
        }
     System.out.println(" ");
    }

    public void g2_crearSeriecaractereS8(int valor){
        System.out.println("");
        if(valor > 0){
                System.out.println("La operacion es: ");
                
                int numeroletra = 97;
                for (int i = 1; i <= valor; i+=2){
                    int indiceserie = 1;
                    while (indiceserie <= i){
                        System.out.print((char)(numeroletra));
                        indiceserie ++;
                    }
                    System.out.print("  ");
                    numeroletra ++;
                }
            }else{
                System.out.print("Ingreso invalido!!!");
                System.out.print("porfavor ingrese un nuevo rango:");
                valor= leer.nextInt();
                g2_crearSeriecaractereS8(valor);
            }
        System.out.println(" ");
    }
}
