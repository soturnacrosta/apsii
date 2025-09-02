package br.com.lemosproject.mailton;

public class Main {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo (30f, 50f);
        System.out.println(triangulo.calculaArea());   
        System.out.println(triangulo.getNomeFigura());  
        
        Losango losango = new Losango (50f, 50f);

        System.out.println(losango.calculaArea());
        System.out.println(losango.getNomeFigura());
        System.out.println(losango.toString());

    }
}