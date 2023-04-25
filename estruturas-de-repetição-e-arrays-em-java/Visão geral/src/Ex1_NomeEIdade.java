import java.util.Scanner;

public class Ex1_NomeEIdade {
/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //para colocar automaticamente o import lá em cima, 
        //passar o mouse em cima, "correção rápida" e "import".

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next(); //se colocar nextLine, não pára pra colocar o nome
            //só imprime nome: Idade: e espera pra colocar a idade.
            if (nome.equals("0")) { //não pode colocar string =, tem q usar método string.equals
                break;
            }

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        scan.close();
        System.out.println("Continuaria aqui...");
    }
    
}
