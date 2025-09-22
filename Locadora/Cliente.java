import java.util.*;

public class Cliente {
    private String nome;
    private List<Aluguel> alugueis = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public String extrato() {
        double valorTotal = 0;
        int pontosDeAlugadorFrequente = 0;
        String resultado = "Registro de Alugueis de " + getNome() + "\n";

        for (Aluguel aluguel : alugueis) {
            double valorCorrente = calcularValorDoAluguel(aluguel); // Chama o método extraído
            pontosDeAlugadorFrequente += calcularPontos(aluguel);  // Chama o método extraído

            // linha do extrato
            resultado += "\t" + aluguel.getFita().getTitulo() + "\t" + valorCorrente + "\n";
            valorTotal += valorCorrente;
        }

        // rodapé
        resultado += "Valor total devido: " + valorTotal + "\n";
        resultado += "Você ganhou " + pontosDeAlugadorFrequente + " pontos de alugador frequente";
        return resultado;
    }

    // Método extraído para calcular o valor de um aluguel
    private double calcularValorDoAluguel(Aluguel aluguel) {
        double valorCorrente = 0;
        switch (aluguel.getFita().getCodigoDePreco()) {
            case Fita.NORMAL:
                valorCorrente += 2;
                if (aluguel.getDiasAlugada() > 2)
                    valorCorrente += (aluguel.getDiasAlugada() - 2) * 1.5;
                break;
            case Fita.LANCAMENTO:
                valorCorrente += aluguel.getDiasAlugada() * 3;
                break;
            case Fita.INFANTIL:
                valorCorrente += 1.5;
                if (aluguel.getDiasAlugada() > 3)
                    valorCorrente += (aluguel.getDiasAlugada() - 3) * 1.5;
                break;
        }
        return valorCorrente;
    }

    // Método extraído para calcular os pontos de aluguel frequente
    private int calcularPontos(Aluguel aluguel) {
        int pontos = 1;
        if ((aluguel.getFita().getCodigoDePreco() == Fita.LANCAMENTO) 
            && aluguel.getDiasAlugada() > 1) {
            pontos++;
        }
        return pontos;
    }
}