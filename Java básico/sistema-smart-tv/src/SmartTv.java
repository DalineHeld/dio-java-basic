public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;
    //configurações de origem

    public void ligar() {
        ligada = true;
    }
    //método para ligar

    public void desligar() {
        ligada = false;
    }
    //método para desligar

    public void aumentarVolume() {
        volume++;
    }

    public void abaixarVolume() {
        volume--;
    }
    //métodos para aumentar e abaixar volume 1 número por vez

    


}
