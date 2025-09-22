// Para fitas infantis
public class TipoPrecoInfantil extends TipoPreco {
    @Override
    public double getValor(int diasAlugados) {
        double valor = 1.5;
        if (diasAlugados > 3) {
            valor += (diasAlugados - 3) * 1.5;
        }
        return valor;
    }

    @Override
    public int getPontos(int diasAlugados) {
        return 1;
    }
}