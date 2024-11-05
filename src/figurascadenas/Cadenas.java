package figurascadenas;
import java.nio.charset.CharsetEncoder;
import java.util.Scanner;
import java.util.stream.Stream;
import javax.sound.midi.Soundbank;

public class Cadenas {
    Scanner leer = new Scanner(System.in);

    public void g2_crearCadenaCaracteresC02(String frase){
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

    public void g2_crearCadenaCaracteresC06(String frase){
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
        System.out.println(" ");
    }

    public void g2_crearCadenaCaracteresC07(String frase){
        String fraseModificada = frase.toUpperCase().replace("J", "");
        System.out.print("La nueva frase es: " + fraseModificada);
        System.out.println(" ");
    }

}
