import java.util.Scanner;

public class Ex2_Array_Consoantes {
    /*
    Faça um Programa que leia um vetor de 6 caracteres,
    e diga quantas consoantes foram lidas.
    Imprima as consoantes.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int numeroDeConsoantes = 0;

        int contador = 0;

        do {
            System.out.println("Letra: ");
            String letra = sc.nextLine();

            if (!(letra.equalsIgnoreCase("a") | //ignorecase é pra ignorar se maiusc ou minusc
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))) {
                    consoantes[contador] = letra;
                    numeroDeConsoantes++;
            } 

            contador++;

        } while (contador < consoantes.length);

        System.out.print("Consoantes: ");
        for (String consoante : consoantes) { //Para cada consoante (variável criada agora) do(:) array (tal)
            if (consoante != null) {
                System.out.print(consoante + " ");
            }

            
        }        
        System.out.println("\nNúmero de consoantes: " + numeroDeConsoantes);

        sc.close();
    }   
}
