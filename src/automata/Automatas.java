package automata;

import java.util.Scanner;

public class Automatas {
    Scanner leer = new Scanner(System.in);
    final String alfabeto = "+;-;.;,;0;1;2;3;4;5;6;7;8;9; ";
    final int e = -10,
    decimal= 10, //Cifra del usuario
    matriztransicion[][] ={//+     -     .     ,     0     1     2     3     4     5     6     7     8     9     enter     espacio
                            {1,    1,    e,   e,     2,    2,    2,    2,    2,    2,    2,    2,    2,    2,    e,        e},      //q0
                            {e,    e,    e,   e,     5,    5,    5,    5,    5,    5,    5,    5,    5,    5,    e,        e},      //q1
                            {e,    e,    3,   3,     2,    2,    2,    2,    2,    2,    2,    2,    2,    2,    e,        e},      //q2
                            {e,    e,    e,   e,     4,    4,    4,    4,    4,    4,    4,    4,    4,    4,    e,        e},      //q3
                            {e,    e,    e,   e,     4,    4,    4,    4,    4,    4,    4,    4,    4,    4,    decimal,  decimal},//q4
                            {e,    e,    6,   6,     e,    e,    e,    e,    e,    e,    e,    e,    e,    e,    e,        e},      //q5
                            {e,    e,    e,   e,     7,    7,    7,    7,    7,    7,    7,    7,    7,    7,    e,        e},      //q6
                            {e,    e,    e,   e,     7,    7,    7,    7,    7,    7,    7,    7,    7,    7,    decimal,  decimal},//q7
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
        public void g2_crearAutomataA04(String entrada) {
            int q = 0;
            boolean esDecimal = false;
        
            for (int cifra = 0; cifra < entrada.length(); cifra++) {
                String digito = String.valueOf(entrada.charAt(cifra));
                int inderxAlfa = getIndexAlfabeto(digito);
                if (inderxAlfa < 0 || matriztransicion[q][inderxAlfa] == e) {
                    break;
                }
                q = matriztransicion[q][inderxAlfa];
                if (q == decimal) {
                    esDecimal = true;
                }
            }
        
            if (esDecimal || q == 4 || q == 7) {
                System.out.println("El numero ingresado es un numero decimal: " + entrada);
            } else {
                System.out.println("El numero ingresado no es numero decimal...");
            }
        }

        public void g2_crearArraysA05(){
         

        }
}
