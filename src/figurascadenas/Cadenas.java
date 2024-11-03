package figurascadenas;
import java.util.Scanner;
import java.util.stream.Stream;
import javax.sound.midi.Soundbank;

public class Cadenas {
    Scanner leer = new Scanner(System.in);
    String c;

    public void g2_crearCadenaCaracteresC02(){
        System.out.print("Introduce una frase: ");
        String frase= leer.nextLine();

         int contador_letra =0;
         for(char c: frase.toCharArray()){
            if(Character.isLetter(c) && !esVocal(c)){
                contador_letra++;
            }
        }
        System.out.println("La frase ingresada tiene " + contador_letra + " letras.");
        
        System.out.println(" ");
    }
    public  static boolean esVocal(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public void g2_crearCadenaCaracteresC06(){
        System.out.print("Introduce una frase: ");
        String frase= leer.nextLine();

        StringBuilder letraFrase = new StringBuilder();
        String nuevafrase = "";
        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
                    if (esVocal(c)) {
                        letraFrase.append(Character.toLowerCase(c));
                    } else {
                        letraFrase.append(Character.toUpperCase(c));
                    }
            } else{
                letraFrase.append(c);
            }
        }
        nuevafrase = letraFrase.reverse().toString();
        System.out.print("La frase resultante es: " + nuevafrase);
    }

    public void g2_crearCadenaCaracteresC07(){
        System.out.print("Introduce una frase: ");
        String frase= leer.nextLine();

        String letraNuevaCadena ="";
        letraNuevaCadena = frase.toUpperCase().replace("J","");
        System.out.print("La nueva cadena es: " + letraNuevaCadena);
    }

}
