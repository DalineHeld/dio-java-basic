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
        System.out.println("Aumentando volume para " + volume);
    }
    //assim toda vez que aumentar, vai aparecer a frase entre aspas
    
    public void abaixarVolume() {
        volume--;
    }
    //métodos para aumentar e abaixar volume 1 número por vez

    public void aumentarCanal () {
        canal++;
    }

    public void diminuirCanal () {
        canal--;
    }
    //para aumentar e diminuir canal

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }


}
