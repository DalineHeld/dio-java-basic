## Anotações

Programação orientada a objetos veio para superar o paragigma anterior, chamado de paradigma estruturado (estilo C: Linux, Windows).

- PE (paradigma estruturado) tem uma representação mais simplista;
- POO (paradigma orientado a objetos) tem uma representação mais realista (mais mecanismos e mecanismos mais avançados).

- PE foca em operações (funções) e dados (manipulação de dados brutos);
- POO foca na modelagem de entidades e nas suas interações (maior nível de abstração).

- PE foca no "como fazer";
- POO foca no "o que fazer".

### Vantagens de POO

- Melhor coesão (responsabilidades visíveis);
- Melhor acoplamento (flexíveis);
- Diminuição do gap semântico (diminui diferença de representação);
- Coletor de lixo (embutido, limpa coisas inúteis ou inutilizadas, diminui erros e uso de memória);

### Definição:

"A OO é um paradigma de análise, projeto e programção de sistemas de software baseado na composição e interação entre diversas unidades de software chamadas de objetos".

### Fundamentos:

1. Abstração:
"Processo pelo qual se isolam características de um objeto, considerando os que tenham em comum certos grupos de objetos." (reutilização dependendo da necessidade)

2. Reuso:
"Capacidade de criar novas unidades de código a partir de outras já existentes." (mais mecanismos e de maior nível)

3. Encapsulamento:
"Capacidade de esconder complexidades e proteger dados."

### Estruturas básicas:

- Classe: "É uma estrutura que abstrai um conjunto de objetos com características similares. Uma classe define o comportamento de seus objetos através de métodos e os estados possíveis destes objetos através de atributos. Em outros termos, uma classe descreve os serviços providos por seus objetos e quais informações eles podem armazenar." (unidade mínima e básica, serve de molde para objetos similares em características fundamentais)

Dicas: substantivos, nomes significativos, contexto deve ser considerado

Códigos:
Java: class Carro {}
C#: class Carro {}
Python: class Carro: pass

- Atributo: "É o elemento de uma classe responsável por definir sua estrutura de dados. O conjunto destes será responsável por representar suas características e fará parte dos objetos criados a partir da classe." (caracterizar)

Atributo X variável
A: O que é próprio e peculiar a alguém ou a alguma coisa.
V: Sujeita a variações ou mudanças; q podem variar; inconstante, instável.

Dicas: substantivos e adjetivos, nomes significativos, contexto deve ser considerado, abstração, tipo adequados

Códigos:
Java: 
class Carro {
    int portas;
}

C#:
class Carro {
    int portas;
}

Python:
class Carro:
    portas = 0

- Método: "É uma porção de código (sub-rotina) que é disponibilizada pela classe. Este é executado quando é feita uma requisição a ele. Un método serve para identificar quais serviços, ações, que a classe oferece. Eles são responsáveis por definir e realizar um determinado comportamento."

Criação:
Java e C#: Visibilidade, retorno, nome e parâmetros
Python: def, nome e parâmetros

Dicas: verbos, nomes significativos, contexto deve ser considerado

Códigos:
Java:
class Carro {
    void frear() {
    ...
    }
}

C#:
class Carro {
    void frear() {
        ...
    }
}

Python:
class Carro:
    def frear ()

Dois métodos especiais:
    - construtor: além de criar o objeto, tbm dá valores iniciais
    Java: obrigatório ter o mesmo nome da classe, não precisa de retorno pq o resultado do método vai ser a própria classe
    class Carro {
        Carro () {
            ...
        }
    }

    C#:
    class Carro {
        Carro () {
            ...
        }
    }

    Python: dois undelines
    class Carro:
        def __init__(self):
        ...
    

    - destrutor: não destrói, auxilia a destruição, pra liberar recursos não utilizados
    Java:
    class Carro {
        void finalize () {
            ...
        }
    }

    C#:
    class Carro {
        ~Carro () {
            ...
        }
    }

    Python:
    class Carro:
        def __del__(self):
            ...

Sobrecarga: mudar a assinatura de acordo com a necessidade. Usada para manter a abstração-alvo e facilitar o entendimento do software
Assinatura: nome+parâmetros

Java:
m1 ()
m1 (int i)
m1 (float f)
m1 (String s, long l)
m1 (long l, String s)

C#:
M1 ()
M1 (int i)
M1 (float f)
M1 (String s, long l)
M1 (long l, String s)

Python: não existe sobrecarga

- Objeto: "É a representação de um conceito/entidade do mundo real, que pode ser física (bola, carro, árvore etc.) ou conceitual (viagem, estoque, compra etc.) e possui um significado bem definido para um determinado software. Para esse conceito/entidade, deve ser definida inicialmente uma classe a partir da qual posteriormente serão instanciados objetos distintos." (classes são estáticas e servem de molde, objetos funcionam)

Criação:
Java:
Carro carro = new Carro();

C#:
Carro carro = new Carro();

Python:
carro = Carro()

- Mensagem: "É o processo de ativação de um método de um objeto. Isto ocorre quando uma requisição (chamada) a esse método é realizada, assim, disparando a execução de seu comportamento descrito por sua classe. Pode também ser direcionada diretamente à classe, caso a requisição seja a um método estático." (solicitação para fazer executar o método)

Java:
Carro carro = new Carro();
carro.<método>;

Carro. <método>;

C#:
Carro carro = new Carro();
carro.<método>;

Carro.<método>;

Python:
carro = Carro ()
carro.<método>

Carro.<métpdp>



