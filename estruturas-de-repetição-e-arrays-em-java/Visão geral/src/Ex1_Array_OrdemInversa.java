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

        while (contador < (vetor.length)) {
            System.out.println(vetor[contador]);
            contador++;
        }
        

        int cont = 5;
        while (cont >= (vetor.length-6)) {
            System.out.println(vetor[cont]);
            cont--;
        }
        

        int[] vetorMeu = {1, 2, 3, 4, 5, 6}; //elementos 6, se fosse criar, seria new int[6]

        int contadorPosição = 5; //posição vai de 0 a 5

        while (contadorPosição >= (vetorMeu.length - 6)) {
            System.out.println(vetorMeu[contadorPosição]);
            contadorPosição--;
        }



       
    }
}
