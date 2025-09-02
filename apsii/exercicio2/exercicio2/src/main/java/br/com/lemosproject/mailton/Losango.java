package br.com.lemosproject.mailton;

public class Losango implements FiguraGeometrica {
    
    private double diagonal1;
    private double diagonal2;

    

    public Losango(double diagonal1, double diagonal2) {
        
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;

    }

    public double calculaArea() {

        return (this.diagonal1*this.diagonal2)/2;

    }

    public String getNomeFigura() {
      
        return "Losango";

    }

    @Override
    public String toString() {
        return "Losango [diagonal1=" + diagonal1 + ", diagonal2=" + diagonal2 + ", getNomeFigura()=" + getNomeFigura()
                + "]";
    }

}
