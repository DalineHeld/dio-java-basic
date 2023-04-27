import java.util.Random;

public class Ex_ArrayMultidimensional {
    /*
    Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
    */

    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4]; //criando declarando o tipo e o tamanho

        for(int x = 0; x < M.length; x++) {
            for(int y = 0; y < M[x].length; y++) {
                M[x][y] = random.nextInt(9); //o bound é o limite, neste caso, de 0 a 9
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M  ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

    }
}
