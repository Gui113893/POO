package aula08.Ex01.Pesados;

public class PesadoMercadorias extends Pesados{
    int cargaMax;

    public PesadoMercadorias(String matricula, String marca, String modelo, int potencia, int nquadro, double peso, int cargaMax){
        super(matricula, marca, modelo, potencia, nquadro, peso);
        this.cargaMax = cargaMax;
    }


    public int getCargaMax() {
        return this.cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }


    @Override
    public String toString() {
        return "{"+
        " matricula='" + getMatricula() + "'" +
        ", marca='" + getMarca() + "'" +
        ", modelo='" + getModelo() + "'" +
        ", potencia='" + getPotencia() + "'" +
        ", trajetos='" + getTrajetos() + "'" +
            " nquadro='" + getNquadro() + "'" +
            ", peso='" + getPeso() + "'" +
            " cargaMax='" + getCargaMax() + "'" +
            "}";
    }


}
