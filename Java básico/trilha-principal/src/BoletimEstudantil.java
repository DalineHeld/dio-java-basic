public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 9;
        if(mediaFinal<6)	
            System.out.println("REPROVADO"); 
        else if(mediaFinal==6)
            System.out.println("PROVA MINERVA"); 
        else
            System.out.println("APROVADO"); 
    }
}
//o comum é se usar de 4 a 6 indentações. Mais que isso, fica difícil a leitura, revisar a lógica.
