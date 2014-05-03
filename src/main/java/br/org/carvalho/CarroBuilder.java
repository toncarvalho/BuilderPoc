package br.org.carvalho;

/**
 * Created by ton on 5/3/14.
 */
public abstract class CarroBuilder {

    protected CarroProduct carro;

    public CarroBuilder() {

        carro = new CarroProduct();
    }

    public abstract void buildPreco();

    public abstract void buildDscMotor();

    public abstract void buildAnoDeFabricacao();

    public abstract void buildModelo();

    public abstract void buildMontadora();

    public CarroProduct getCarro() {
        return carro;
    }


}
