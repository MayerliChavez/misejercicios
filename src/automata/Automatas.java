package automata;

import java.util.Scanner;

public class Automatas {
    Scanner leer = new Scanner(System.in);
    final String alfabeto = "+;-;.;,;0;1;5;3;4;5;6;7;8;9; ";
    final int e = -10,
    decimal= 10, //Cifra del usuario
    matriztransicion[][] ={//+     -     .     ,     0     1     2     3     4     5     6     7     8     9     enter
                            {1,    1,    e,   e,     2,    2,    2,    2,    2,    2,    2,    2,    2,    2,    e},      //q0
                            {e,    e,    e,   e,     5,    5,    5,    5,    5,    5,    5,    5,    5,    5,    e},      //q1
                            {e,    e,    3,   3,     e,    e,    e,    e,    e,    e,    e,    e,    e,    e,    e},      //q2
                            {e,    e,    e,   e,     4,    4,    4,    4,    4,    4,    4,    4,    4,    4,    e},      //q3
                            {e,    e,    e,   e,     4,    4,    4,    4,    4,    4,    4,    4,    4,    4,    decimal},//q4
                            {e,    e,    6,   6,     e,    e,    e,    e,    e,    e,    e,    e,    e,    e,    e},      //q5
                            {e,    e,    e,   e,     7,    7,    7,    7,    7,    7,    7,    7,    7,    7,    e},      //q6
                            {e,    e,    e,   e,     7,    7,    7,    7,    7,    7,    7,    7,    7,    7,    decimal},//q7
                          };

        @SuppressWarnings("resource")
            private int getIndexAlfabeto(String digito){
                Scanner scAlfa = new Scanner(alfabeto).useDelimiter(";");
                for( int inderxAlfa = 0; scAlfa.hasNext(); inderxAlfa++){
                    if(digito.equals(scAlfa.next()))
                     return inderxAlfa;
                }
             return -1;
            }
         
        @SuppressWarnings("resource")
        public void  g2_crearAutomataA04(){
        System.out.print("Ingrese una cifra: ");
        String entrada = leer.nextLine();
            int q = 0;
            Scanner w = new Scanner(entrada);
            for(int inderxAlfa = 0; w.hasNext(); ){
                inderxAlfa = getIndexAlfabeto(w.next());
                if(inderxAlfa < 0 || matriztransicion[q][inderxAlfa] == e)
                    break;
                q = matriztransicion[q][inderxAlfa];
            }
            switch (q) {
                case decimal:
                    System.out.print("El numero ingresado el un numero decinal " + entrada);
                    break;
                default:
                System.out.print("El numero ingrasado no es decimal...");
            }
        }
}
