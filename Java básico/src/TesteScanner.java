
import java.util.Scanner;

public class TesteScanner {
    public static void main (String[] args) {
         //código das primeiras aulas:
         Scanner leitor = new Scanner(System.in);
         int A, B, PROD;
         A = leitor.nextInt();
         B = leitor.nextInt();
         PROD = A * B;
         
         System.out.println("PROD = " + PROD);
         leitor.close();
        //depois de rodar, colocar int no terminal que ele faz a conta e depois fecha o scanner

    }

   
}
