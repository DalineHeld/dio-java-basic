public class Ops {
    public static void main(String[] args) {
        
        String nomeCompleto = ("Nome completo: " + "primeiroNome" + " " + "sobrenome");
        System.out.println(nomeCompleto);
    

        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        //depois que reconhece o primeiro como caractere, para reconhecer 
        //como in tem que colocar entre parênteses
        
        //operadores unários: +, -, ++, --, !
        /* o ++ e o -- têm ordem pq eles somodificam depois do símbolo, 
        então, se tiver a variável e depois ++, vai ser incrementado depois
        e não antes.
        Se colocar:
        
        int num = 5;
        System.out.println(num ++);
        
        Vai imprimir 5 e não 6, pra isso teria que imprimir de novo.
        
        Mas se colocar:

        int numero = 3;
        System.out.println(++ numero);

        Vai imprimir 4, pq vai incrementar onde o símbolo está e 
        depois imprimir.*/

        int num = 5;
        System.out.println(num ++);
        System.out.println(num);
        
        int numero = 3;
        System.out.println(++ numero);

        //negar "!" é só ler com NÂO

        boolean qualquer = true;
        System.out.println(! qualquer);

        int x = 3;
        if (!(x > 2)) {
            System.out.println("É!");
        } else {
            System.out.println("Não é!");
        }

        //op ternários
        /*<Expressão Condicional>`` ?
        ``<Caso condição seja true>``: 
        ``<Caso condição seja false> */

        int a, b;

        a = 5;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        String resultado = "";
        if(a==b) { 
        resultado = "verdadeiro";
        }
        else {
        resultado = "falso";
        }*/

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);
        //a primeira expressão entre parênteses deve ser boolean, ou seja
        //ter resultado true ou false

        //se fosse int em vez de string, retornaria 1 ou 0 de true ou falso
        //para objetos, em vez de == usar método equals()
        /*ficaria por ex.:
        String nomeUm = "Daline";
        String nomeDois = new String("Daline");
        System.ou.println(nomeUm.equals(nomeDois)); */
        
        // && significa E
        // || significa OU
        //para boolean ou relacionais

    }
}
