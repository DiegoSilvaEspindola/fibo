package arq1;


import java.util.Scanner;

public class Fibonacci {
    public static void main (String args []){

        int a = 0;
        int b = 1;
        int resultado = 0 ;
        int tamanho;

        Scanner tec = new Scanner (System.in);

        System.out.println("Digite o tamanho da sequência");

        tamanho = tec.nextInt();

        for (int i =0; i < tamanho; i++) {


            resultado = a + b;
            a = b;
            b = resultado;


            System.out.println(resultado);
        }

        /* testando clone/Versionamento

         */



    }
}
