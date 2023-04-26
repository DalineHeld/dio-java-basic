import java.util.Scanner;

public class Ex4_ParEÍmpar {
    /*Faça um programa que peça N números inteiros. 
    Calcule e mostre a quantidade de números pares
    e a quantidade de números impares. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeDeNumeros;
        int numero;
        int quantidadeDePares = 0;
        int quantidadeDeÍmpares = 0;
        int contador = 0;

        System.out.println("Quandtidade de números: ");
        quantidadeDeNumeros = sc.nextInt();

        do {
            System.out.println("Número: ");
            numero = sc.nextInt();
            contador++;
            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par.");
                quantidadeDePares++;
               } else if (numero % 2 != 0) {
                System.out.println("O número " + numero + " é ímpar.");
                quantidadeDeÍmpares++;
               }
        } while (contador < quantidadeDeNumeros);
        
       

       System.out.println("Quantidade de números pares: " + quantidadeDePares + ".");
       System.out.println("Quantidade de números ímpares: " + quantidadeDeÍmpares + ".");

        
        sc.close();
    }

    
}