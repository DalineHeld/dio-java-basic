import java.util.Scanner;

public class Ex3_MaiorEMédia {
    /*Faça um programa que leia 5 números e informe
     o maior número e a média desses números. */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int maior = 0;
        int soma = 0;
        
        int media = 0;
        int contador = 0;

        do {
            System.out.println("Número: ");
            numero = sc.nextInt(); //até aqui pra pedir o número
            soma+= numero;
            System.out.println("A soma é: " + soma);

            if (numero > maior) {maior = numero;}
            
            contador++;
        } while (contador < 5);

        media = (soma / 5); //poderia nem ter criado essa variável e colocado direto no print soma/5

        System.out.println("O maior número é: " + maior);
        System.out.println("A média entre esses números é: " + media);

        sc.close();
     }
}
