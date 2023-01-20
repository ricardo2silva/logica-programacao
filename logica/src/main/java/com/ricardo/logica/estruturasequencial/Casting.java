package com.ricardo.logica.estruturasequencial;

public class Casting {
    public static void main(String[] args) {
        //quando fazemos casting estamos fazendo a converso explicita do valores
        double a = 5.0;
        int b = (int) a;
        System.out.println(b);

        int c = 5;
        int d = 2;
        double resultado = c / d;
        System.out.println(resultado);
        // neste caso perdemos a precisao e queremos grantir o valor
        resultado = (double) c / d ;
        System.out.println(resultado);

    }
}
