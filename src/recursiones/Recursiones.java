package recursiones;

public class Recursiones {
    public static int g2_crearRecursionR01(int dato){
        int factorial;
        if(dato == 0 || dato == 1){
            factorial =1;
        }else{
            factorial = dato * g2_crearRecursionR01(dato - 1);
        }
        return factorial;
    }

    public static int g2_crearRecursionR04(int base, int potencia){
        int resultado;
        if( base == 0){
         resultado = 0;
        }else{
            if(potencia == 0){
                resultado = 1;
            }else{
                    if(potencia !=1){
                        resultado= base * g2_crearRecursionR04(base, (potencia - 1));
                    }else{
                        resultado= base;
                    }
                }
        }
        return resultado;
    }
}
