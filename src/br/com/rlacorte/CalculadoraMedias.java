package br.com.rlacorte;

/**
 * @author rodrigo.grance
 */

public class CalculadoraMedias {

    public static void main(String[] args) {
        notas();
    }

    private static void notas() {

        int nota1 = 7;
        int nota2 = 9;
        int nota3 = 6;
        int nota4 = 10;
        int mediaNotas = (nota1 + nota2 + nota3 + nota4 ) / 4;

        System.out.println(mediaNotas);
    }
}
