public class Ex1_Array_OrdemInversa {
    /*
    Crie um vetor de 6 números inteiros
    e mostre-os na ordem inversa.
    */

    public static void main(String[] args) {
        
        
        int[] vetor = {12, 9, -57, 3, 109, -8}; 
        //os [] são para indicar que é um vetor
        //assim que se declara um array unidimencional
        //neste, há 5 posições (pq tem a posição 0)
       
        System.out.println("Número de elementos: " + vetor.length);
        //e 6 elementos
        // os elementos sempre ficam na posição em que são criados
       
        int contador = 0;

        System.out.print("Vetor: ");
        while (contador < (vetor.length)) {
            System.out.print(vetor[contador] + " ");
            contador++;
        }
        
        System.out.print("\nVetor inverso: ");
        for (int count = (vetor.length-1); count >= 0; count--) {
            System.out.print(vetor[count] + " ");
       }
        

        int[] vetorMeu = {1, 2, 3, 4, 5, 6}; //elementos 6, se fosse criar, seria new int[6]

        int contadorPosição = 5; //posição vai de 0 a 5
        System.out.print("\nVetor meu: ");
        while (contadorPosição >= (vetorMeu.length - 6)) {
            System.out.print(vetorMeu[contadorPosição] + " ");
            contadorPosição--;
        }
        System.out.println(" ");


       
    }
}
