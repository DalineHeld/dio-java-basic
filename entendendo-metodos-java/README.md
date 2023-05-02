## Anotações: Entendendo Métodos Java

### Padrão de definição:

<?visibilidade?> <?tipo?> <?modificador?> retorno
nome (<?parâmetros?>) <?exceções?> corpo

Entre interrogações é opcional.

Visibilidade: public, protected ou private (orientação a objeto); **
Tipo: concreto ou abstrato (orientação a objeto);
Modificador: static ou final (orirentação a objeto);
Retorno: tipo de dado ou void(sem retornar nada); **
Nome: nome do método (padrão para def de variáveis em Java); **
Parâmetros: que pode receber (dentro dos parênteses, que podem ser vazios, mas são obrigatórios); **
Exceções: que pode lançar (erros);
Corpo: código que possui ou vazio (orientação a objeto no vazio). **

** Itens mais utilizados

Neste curso, mais utilizado: 
public static Retorno Nome(Parâmetro) {...}

### Utilização: 
Para chamar um método, passa-se uma mensagem através de uma classe ou objeto.

nome_da_classe.nome_do_método(); ou nome_do_objeto.nome_do_método()

Exemplo:
Math.random(); Math.sqrt(4); usuario.getEmail(); ou usuario.alterarEndereco(endereco)

(Classes têm a primeira letra maiúscula)
(Objetos têm a primeira letra minúscula)

### Particularidades:

#### Assinatura:

É a forma de identificar unicamente o método (Ass = nome + parâmetros).

Método:
public double calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3) {...}

Assinatura:
calcularTotalVenda (double precoItem1, double precoItem2, double precoItem3)

Construtor e destrutor: são métodos especiais usados na Orientação a Objetos.

Mensagem: é o ato de solicitar ao método que execute. Pode ser direcionada a um objeto ou a uma classe.

Passagem de parâmetros:
Por valor (cópia)

int i = 10;
public void fazerAlgo(int i) {
    i = i + 10;
    System.out.println("Valor de i denntro: " + i);
}
System.out.println("Valor de i fora: " + i);

Dentro do método é criada uma cópia da variável, assim, o valor de dentro vai ser 20 e o valor de fora vai ser 10. 

Por referência (endereço)
Oposto da cópia, Orientação a Objeto.

Boas práticas:
Nomes devem ser descritivos, mas curtos;
Notação camelCase;
Deve possuir entre 80 e 120 linhas (criar métodos auxiliares dentro do mátodo);
Evite lista de parâmetros longa (quanto menos, melhor. Mais voltado a Orientação a Objetos, gera acoplamento muito forte);
Visibilidades adequadas.

### Sobrecargas:

É a capacidade de definir métodos para diferentes contextos, mas preservando seu nome.

#### Criação:

Alterar a assinatura do método (ass.: nome + parâmetros).

Adicionar, retirar, mudar a ordem, mudar o tipo de parâmtro gera sobrecarga.

Exemplo de uso:
println() só termina a linha
ou com parâmetros

valueOf (boolean b os tipos primitivos) retorna a representação em string do argumento

Sobrecarga x sobrescrita:
Sobrecarga mantém o nome e muda a lista de parâmetros, já sobrescrita tem a ver com orientação a objeto e herança.



