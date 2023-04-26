import java.util.Scanner;

public class Ex6_Fatorial {
    /* Faça um programa que calcule o fatorial
     de um número inteiro fornecido pelo usuário.
     Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1) */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /* este eu que fiz
        int multiplicador = 1;
        System.out.println("O fatorial de: ");
        
        for (int fatorial = sc.nextInt(); fatorial >= 1; fatorial--) {
            multiplicador *= fatorial;
        }
        System.out.println("é " + multiplicador + ".");
        */

        /* no SoloLearn estava assim:
        int number = sc.nextInt();
        int fact = 1;

        for (int x=1; x<=number; x++) {
            fact *= x;
        }
        System.out.println(fact);
        */

        //resolução da profa DIO
        System.out.println("Fatorial: ");
        int fatorial = sc.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial +"! = "); //aqui é print sem o ln, pra continuar na mesma linha.
        for(int i = fatorial ; i >= 1 ; i --) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao + ".");


        sc.close();
     }

}
