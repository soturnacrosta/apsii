package br.com.lemosproject.mailton;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<FiguraGeometrica> losangoList;

        losangoList = new ArrayList<FiguraGeometrica>();

        Triangulo triangulo = new Triangulo (30f, 50f);
        System.out.println(triangulo.calculaArea());   
        System.out.println(triangulo.getNomeFigura());  
        
        Losango losango = new Losango (50f, 10f);
        Losango losango2 = new Losango (20f, 50f);
        Losango losango3 = new Losango (40f, 30f);


        /*System.out.println(losango.calculaArea());
        System.out.println(losango.getNomeFigura());
        System.out.println(losango.toString());
        */
        System.out.println("##################");
        
        GerenteDeFIguras gerente = new GerenteDeFIguras();

        gerente.adicionaFIgura(losango3);
        gerente.adicionaFIgura(losango2); //letra a
        gerente.adicionaFIgura(losango);

        losangoList.add(losango);
        losangoList.add(losango2); 
        losangoList.add(losango3);

        System.out.println(gerente.imprimeFiguras()); //letra b

        gerente.getMaiorAreaDeFigura(losangoList);

        gerente.getAreaTotal(losangoList);

    }
}