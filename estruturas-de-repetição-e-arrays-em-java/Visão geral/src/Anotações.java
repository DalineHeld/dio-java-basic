public class Anotações {
    public static void main(String[] args) throws Exception {
        System.out.println("Visão geral");

        /*
         * Loop = laço, 1 = true, 0 = false
         * Condições lógicas, booleans, true ou false
         * Tipos:
         * - Repetição com teste no início: while
         * - Repetição com teste no final: do-while
         * - Repetição contada (for)
         * 
         * -- break: usado para terminar uma repetição 
         * (pode ser utilizado em estrut de condição switch)
         * 
         * -- continue: pula o caso específico e continua 
         * (só pode ser utilizado em estrut de repetição, pouco utilizado)
         * 
         * -- operadores de incremento e decremento
         *      pré-fixados: ++numero;   é igual a   numero = numero + 1; (retorne numero);
         *      pós-fixados: numero--;   é igual a  (retorne numero); numero = numero - 1; 
         * 
         * -- Array: objeto utilizado para armazenar sequencialmente dados do mesmo tipo.
         *      (muito utilizado em coleções, principalmente do tipo list)
         *      (é um vetor)
         *      - permanecem do mesmo tamanho depois de criados
         *      - unidimencional: nome do array[posição começa do 0]
         *      - multidimencional: nome do array[numero da linha do 0] [numero da coluna do 0]
         */


         int num = 5, count = 1;
         while(count <= 3) {
             ++count;
             num += count;
         }
         System.out.println(num);

    }
}
