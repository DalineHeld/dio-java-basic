public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();
       //este é o modo de criação de objetos

       System.out.println("TV ligada: " + smartTv.ligada);
       System.out.println("Canal: " + smartTv.canal);
       System.out.println("Volume: " + smartTv.volume);
       //imprime condições originais

       smartTv.ligar();
       System.out.println("Novo status - TV ligada: " + smartTv.ligada);
       //executa o método ligar e imprime

       smartTv.desligar();
       System.out.println("Novo status - TV ligada: " + smartTv.ligada);
       //executa o método desligar e imprime

       smartTv.aumentarVolume();
       smartTv.aumentarVolume();
       smartTv.abaixarVolume();
       System.out.println("Novo volume: " + smartTv.volume);

        smartTv.mudarCanal(5);
        smartTv.mudarCanal(27);
        System.out.println("Novo canal: " + smartTv.canal);

    }
}
