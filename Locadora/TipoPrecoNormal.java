public class TipoPrecoNormal extends TipoPreco {
    @Override
    public double getValor(int diasAlugados) {
        double valor = 2;
        if (diasAlugados > 2) {
            valor += (diasAlugados - 2) * 1.5;
        }
        return valor;
    }

    @Override
    public int getPontos(int diasAlugados) {
        return 1;
    }
}