import java.util.Scanner;

public class Ex2_Nota {
    
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Nota: ");
        nota = sc.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota inválida. Digite novamente.");
            nota = sc.nextInt(); //se não colocar isso, fica a mensagem se repetindo eternamente 
            //(óbvio, mas não tinha pensado e tinha dado errado)

        }


        sc.close();

        System.out.println("Continua...");

        
        /* tinha feito assim: mas não escreve Nota: da primeira vez.
            while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida."); //esta linha precisa estar aqui
            //pq senão a nota válida termina o loop mas escreve "nota inválida depois"
            
            System.out.println("Nota: "); //esta e a linha de baixo precisam 
            //estar dentro do loop pra pedir de novo o scan
            
            nota = sc.nextInt();//não deu certo pq não coloquei essa linha antes do while... e se colocasse agora,
            //teria q escrever 2 vzs e só a segunda estaria dentro do loop
        */

        }

    }

