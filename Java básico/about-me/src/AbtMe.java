import java.util.Locale; //convenção de medidas do local escolhido dentro da classe
import java.util.Scanner; //para poder usar o scanner

public class AbtMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US); //convenção americana
        
        System.out.println("Digite seu nome:");
        String nome = sc.next();
        
        System.out.println("Digite seu sobrenome:");
        String sobrenome = sc.next();

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        
        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, eu me chamo " + nome + " " + sobrenome + ".");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + "cm.");
        
        sc.close();
    }
}
