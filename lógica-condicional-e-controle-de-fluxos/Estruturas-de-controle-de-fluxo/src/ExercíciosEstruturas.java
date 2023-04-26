import java.util.Scanner;

public class ExercíciosEstruturas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira número do mês");
        int mes = sc.nextInt();

        if(mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês inválido");
        }

        if (mes == 7 || mes == 12 || mes == 1) {
            System.out.println("Férias");
        }
        // Neste caso, como só tem uma variável, deveria ter usado o switch.

        switch (mes) {
            case 1:
            case 7:
            case 12:
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês indefinido");
                break;
        }

        sc.close();
        

       
       
        //exemplo de criação de variáveis intermediários (salarioBaixo e muitosDependentes, e recebeAuxilio)
        double salarioMensal = 11500.50d;
        double mediaSalarial = 10000d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        if((salarioMensal < mediaSalarial) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionário deve receber auxílio.");
        } //deve ser evitada

        boolean salarioBaixo = salarioMensal < mediaSalarial;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionário deve receber auxílio.");
        } //pode ser usada em casos mais simples

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        if (recebeAuxilio) {
            System.out.println("Funcionário deve receber auxílio.");
        } else {
            System.out.println("Funcionário não deve receber auxílio.");
        }//melhor solução para casos complexos


        /* 
        System.out.println("Insira dia da semana por extenso: ex. 'Segunda'");
        String dia = sc.nextLine();
        switch (dia) {
            case "Domingo" :
                System.out.println(1);
                break;

            case "Segunda" :
                System.out.println(2);
                break;
            
            case "Terça" :
                System.out.println(3);
                break;
            
            case "Quarta" :
                System.out.println(4);
                break;
            
            case "Quinta" :
                System.out.println(5);
                break;

            case "Sexta" :
                System.out.println(6);
                break;

            case "Sábado" :
                System.out.println(7);
                break;

            default :
                System.out.println("Inválido");
                break;
        }
        sc.close();



        int numero = 5; //fiquei com preguiça de colocar scanner aqui, preferi dar um número qqr
        switch(numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;

            case 4:
                System.out.println("Errado");
                break;

            case 5:
                System.out.println("Talvez");
                break;

            default:
                System.out.println("Valor indefinido");
                break;
        }
*/
        
    }

}

