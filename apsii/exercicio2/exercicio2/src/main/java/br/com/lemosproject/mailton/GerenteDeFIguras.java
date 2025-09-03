package br.com.lemosproject.mailton;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeFIguras {
    
    private List<FiguraGeometrica> figuras;

    public GerenteDeFIguras() {

        figuras = new ArrayList<FiguraGeometrica>();

    }

    public void adicionaFIgura (FiguraGeometrica figuras) {

        this.figuras.add(figuras); //método para adicionar!!!


    }

    public List<FiguraGeometrica> imprimeFiguras () {

        System.out.println("Adicionado!");
        return new ArrayList<>(figuras); //método para imprimir!!

    }

    @Override
    public String toString() {
        return "GerenteDeFIguras [figuras=" + figuras + ", imprimeFiguras()=" + imprimeFiguras() + "]";
    }

}
