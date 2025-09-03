package br.com.lemosproject.mailton;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeFIguras {
    
    private List<FiguraGeometrica> figuras;

    public GerenteDeFIguras() {

        figuras = new ArrayList<FiguraGeometrica>();

    }

    public void adicionaFIgura (FiguraGeometrica figuras) {

        System.out.println("Adicionado!");

        this.figuras.add(figuras); //método para adicionar!!!

    }

    public List<FiguraGeometrica> imprimeFiguras () {

        return new ArrayList<>(figuras); //método para imprimir!!

    }

    public void getMaiorAreaDeFigura (List<FiguraGeometrica> figuras) {

            System.out.println("Calculando maior área...");

        double maiorArea = figuras.get(0).calculaArea();
        String nomeFiguraMaiorArea = figuras.get(0).getNomeFigura();

        for (int i = 1; i < figuras.size(); i++) {

            double areaAtual = figuras.get(i).calculaArea();
            
            if (areaAtual > maiorArea) {

                maiorArea = areaAtual;

                nomeFiguraMaiorArea = figuras.get(i).getNomeFigura();

            }

        }
        
            System.out.println("A figura com a maior área é: " + nomeFiguraMaiorArea);
            
            System.out.println("A área é: " + maiorArea);
        
    }

    public void getAreaTotal (List<FiguraGeometrica> figuras) {

        System.out.println("Calculando área total...");

        double areaTotal = figuras.get(0).calculaArea();

            for (FiguraGeometrica figura : figuras) {
                
                    areaTotal += figura.calculaArea(); 

            }
                    
            System.out.println("A área é: " + areaTotal);

    }

    @Override
    public String toString() {
        return "GerenteDeFIguras [figuras=" + figuras + ", imprimeFiguras()=" + imprimeFiguras() + "]";
    }

}
