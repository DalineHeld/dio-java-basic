public class MinhaClasse {
//nome da classe deve sempre começar com maiúscula, e se for palavra composta, a segunda palavra tbm começa com maiúscula


    public static void main (String [] args) {

        System.out.println("Olá! Bora testar!");
        //Para "imprimir" na tela
        
       final String BR = "Brasil";
        //significa que não pode mudar o valor da variável declarada

        String FIXA = "Não pode mudar mesmo sem final!";
        //por ser toda maiúscula, pressupõe-se que não pode mudar, mas o sistema deixa
        FIXA = "Mas mudei!";
        System.out.println(FIXA);

        int ano = 2022;
        //declarei uma variável
        ano = 2023;
        //alterei a variável já declarada 

        System.out.println(BR);
        System.out.println(ano);

       // String nome = "Daline";
       // int idade = 34;
       // boolean legal = true;
        double alt = 1.63;
        double peso = 63;
        double imc = peso/(alt*alt);

        System.out.println(imc);

        //para usar no método nomeCompleto
        String primeiroNome = "Daline ";
        String segundoNome = "Held Lombardi";
        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);

        //material de apoio no Readme
    }
    //novo método
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat("").concat(segundoNome);
        

    }


}
