import java.util.Random;

public class Ex3_Array_NumerosAleatorios {
    /*
    Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
    Ao final mostre os números e seus sucessores.
    */

    public static void main(String[] args) {
        
        Random random = new Random(); //usada como Scanner, é uma classe que vem no java

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) { //i de índice
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) { //pode ser o mesmo nome numero pq o bloco é fechado e a variável fica
            System.out.print(numero + " ");     //restrita àquele bloco
        }

        System.out.print("\nAntecessor dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }

        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
        System.out.println(" ");
        
        
    }
}