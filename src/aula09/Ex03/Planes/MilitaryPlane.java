package aula09.Ex03.Planes;

public class MilitaryPlane extends Plane{
    private int nMunicoes;

    public MilitaryPlane(String Identificador, String Fabricante, String Modelo, int ano_prod, int max_passageiros, int max_vel, int nMunicoes){
        super(Identificador, Fabricante, Modelo, ano_prod, max_passageiros, max_vel);
        this.nMunicoes = nMunicoes;
    }

    public int getNMunicoes() {
        return this.nMunicoes;
    }

    public void setNMunicoes(int nMunicoes) {
        this.nMunicoes = nMunicoes;
    }

    public String getPlaneType(){
        return "Militar";
    }

    @Override
    public String toString() {
        return "{" +
        "Military Plane: " +
        "Identificador ='" + getIdentificador() + "'" +
            ", Fabricante ='" + getFabricante() + "'" +
            ", Modelo ='" + getModelo() + "'" +
            ", Ano de Produção ='" + getAno_prod() + "'" +
            ", Número máximo de passageiros ='" + getMax_passageiros() + "'" +
            ", Velocidade Máxima ='" + getMax_vel() + "'" +
            ", Número de Municoes ='" + getNMunicoes() + "'" +
            "}";
    }

}
