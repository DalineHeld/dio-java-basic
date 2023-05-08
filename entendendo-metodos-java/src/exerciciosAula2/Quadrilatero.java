package exerciciosAula2;

public class Quadrilatero {
    
    public static void area(double lado) {
        System.out.println("Área do quadrado:" + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Área do retângulo:" + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) { //aqui mudou o tipo de dado para não dar erro
        //pq o sistema se confunde caso tenham métodos com nomes iguais. quantidades de parâmetros iguais e 
        //tipos de dados iguais
        System.out.println("Área do losango:" + (diagonal1 * diagonal2)/2);
    }
}
