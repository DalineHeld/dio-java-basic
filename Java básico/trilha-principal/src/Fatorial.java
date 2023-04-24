import java.util.Scanner;

public class Fatorial {
   
   public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int fat = sc.nextInt(); 
        int mult = 1;
        System.out.println("Fatorial: ");

        for (int i = fat; i >= 1; i--) {
            mult = mult*i;
        }

        sc.close();

        System.out.println(mult);
    }
}
