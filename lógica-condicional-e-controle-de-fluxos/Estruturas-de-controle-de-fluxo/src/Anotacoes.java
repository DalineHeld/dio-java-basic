public class Anotacoes {
    public static void main(String[] args) throws Exception {
        System.out.println("Estruturas de controle de fluxo");
    }
}
/*
 * Tipos:
 * Decisão: if, if-else, if-else-if, switch e operadores ternários;
    avalia condição booleana ou variável para direcionar o fluxo de execução.
    (Quando tiver mtos ifs, melhorar o código) (if não suporta expressões aritméticas)
    (Op. ternário = condição ? true : false ; . Pode não ter o false, 
    nesse caso, substituir por null). Evitar uso de operadores ternários.
    (switch: mais usados: int, Enum e String, é recomendável sempre colocar o default.
    Mtos cases tbm, algo pode ser melhorado no código.)

 * Repetição: for, while, do-while;
 * Interrupção: break, continue (continue sem fazer a coisa) e return.
 
 * Boas práticas:
 * Switch é para valores exatos e If para expressões booleanas;
 * Evitar usar o default do switch para "cases genéricos"
 * Evitar o efeito "flecha" dps ifs
 * Evitar muitos ifs aninhados
 * Para diminuir o tamanho dos ifs, criar variáveis intermediárias 
    para a expressão não ficar muito grande.
*/

/* 
 * Conceitos de blocos:
 * Locais:dentro de métodos
 * Estáticos: dentro de classes
 * Instância: dentro de classes
 */