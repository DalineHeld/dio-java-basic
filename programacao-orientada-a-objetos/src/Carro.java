class Carro {
    String cor, modelo;
    int capacidadeTanque;

    //construtores sempre abaixo dos atributos, depois os gets e sets, e depois os outros

    Carro() {
        //só constrói

    }

    Carro (String cor, String modelo, int capacidadeTanque) { //coloca valores iniciais
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    } //sobrecarga de construtor
    //this é forma de diferenciar o que pertence ao objeto, diferencia atributo e parâmetro dentro do atributo
    

    void setCor(String cor) {
        this.cor = cor;
    }
    
    String getCor() {
        return cor;
    }

    void setModelo (String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    //get e set são mto utilizados, mas pode atrapalhar o encapsulamento e proteção dos dados

    void setCapacidadeTanque (int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque (double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }

}