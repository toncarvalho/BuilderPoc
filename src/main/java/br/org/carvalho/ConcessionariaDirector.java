package br.org.carvalho;

/**
 * Created by ton on 5/3/14.
 */
public class ConcessionariaDirector {

    protected  CarroBuilder montadora;

    public ConcessionariaDirector(final CarroBuilder montadora) {
        this.montadora = montadora;
    }

    public void construirCarro(){
        montadora.buildPreco();
        montadora.buildAnoDeFabricacao();;
        montadora.buildDscMotor();
        montadora.buildModelo();
        montadora.buildMontadora();


    }


    public CarroProduct getCarro(){
      return  montadora.getCarro();
    }
}
