package br.org.carvalho;

/**
 * Created by ton on 5/3/14.
 */
public class ExemploBuilder {

    public static  void main(String[] args){

        ConcessionariaDirector consessionaria = new ConcessionariaDirector(new FiatBuilder());

        consessionaria.construirCarro();

        CarroProduct carro = consessionaria.getCarro();

        System.out.println("Carro: " + carro) ;




    }
}
