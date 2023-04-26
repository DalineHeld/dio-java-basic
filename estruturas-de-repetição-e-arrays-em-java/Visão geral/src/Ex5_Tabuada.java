import java.util.Scanner;

public class Ex5_Tabuada {
    /*
    Desenvolva um gerador de tabuada,
    capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
    O usuário deve informar de qual numero ele deseja ver a tabuada.
    A saída deve ser conforme o exemplo abaixo:

    Tabuada de 5:
    5 X 1 = 5
    5 X 2 = 10
    ...
    5 X 10 = 50
    */  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tabuada: ");    
        int tabuada = sc.nextInt();

        while ((tabuada<0) || (tabuada>100)) {
            System.out.println("Número inválido. Escolha entre 1 e 100: ");
            tabuada = sc.nextInt();
            }
       
        System.out.println("Tabuada do " + tabuada + ":");
        for (int multiplicador = 1; multiplicador >=0 && multiplicador <= 10; multiplicador++) {
        System.out.println(tabuada + " x " + multiplicador + " = " + tabuada*multiplicador);
        }

        sc.close();
        //no Eclipse não se coloca acento no nome do arquivo.
    }
        
        
}

    
