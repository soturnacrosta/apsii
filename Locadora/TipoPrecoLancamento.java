public class TipoPrecoLancamento extends TipoPreco {
    @Override
    public double getValor(int diasAlugados) {
        return diasAlugados * 3;
    }

    @Override
    public int getPontos(int diasAlugados) {
        if (diasAlugados > 1) {
            return 2;
        }
        return 1;
    }
}