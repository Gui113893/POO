package aula08.Ex01.Pesados;

public class PesadoPassageiros extends Pesados{
    int passageirosMax;

    public PesadoPassageiros(String matricula, String marca, String modelo, int potencia, int nquadro, double peso, int passageirosMax){
        super(matricula, marca, modelo, potencia, nquadro, peso);
        this.passageirosMax = passageirosMax;
    }


    public int getPassageirosMax() {
        return this.passageirosMax;
    }

    public void setPassageirosMax(int passageirosMax) {
        this.passageirosMax = passageirosMax;
    }


    @Override
    public String toString() {
        return "{" +
        " matricula='" + getMatricula() + "'" +
        ", marca='" + getMarca() + "'" +
        ", modelo='" + getModelo() + "'" +
        ", potencia='" + getPotencia() + "'" +
        ", trajetos='" + getTrajetos() + "'" +
            " nquadro='" + getNquadro() + "'" +
            ", peso='" + getPeso() + "'"+
            " passageirosMax='" + getPassageirosMax() + "'" +
            "}";
    }

}
