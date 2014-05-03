package br.org.carvalho;

/**
 * Created by ton on 5/3/14.
 */
public class FiatBuilder extends CarroBuilder {

    @Override
    public void buildPreco() {
        carro.preco = 25.000;
    }

    @Override
    public void buildDscMotor() {
        carro.dscMotor = "Fire Flex 1.0";
    }

    @Override
    public void buildAnoDeFabricacao() {
        carro.anoDeFabricacao = 2011;
    }

    @Override
    public void buildModelo() {
        carro.modelo = "Palio";
    }

    @Override
    public void buildMontadora() {
        carro.montadora = "Fiat";
    }
}
