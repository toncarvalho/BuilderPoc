package br.org.carvalho;

/**
 * Created by ton on 5/2/14.
 */
public class CarroProduct {

    public double preco;
    public String dscMotor;
    public int anoDeFabricacao;
    public String modelo;
    public String montadora;


/*    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }*/

    public String toString() {
        return "Carro: [" + montadora + " modelo: " + modelo + "motor: " + dscMotor + " Ano: " + anoDeFabricacao + " Preço: " + preco
               + "  ]";
    }
}
