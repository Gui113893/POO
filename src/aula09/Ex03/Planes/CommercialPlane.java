package aula09.Ex03.Planes;

public class CommercialPlane extends Plane{
    private int nTripulantes;
    
    public CommercialPlane(String Identificador, String Fabricante, String Modelo, int ano_prod, int max_passageiros, int max_vel, int nTripulantes){
        super(Identificador, Fabricante, Modelo, ano_prod, max_passageiros, max_vel);
        this.nTripulantes = nTripulantes;
    }


    public int getNTripulantes() {
        return this.nTripulantes;
    }

    public void setNTripulantes(int nTripulantes) {
        this.nTripulantes = nTripulantes;
    }

    public String getPlaneType(){
        return "Comercial";
    }


    @Override
    public String toString() {
        return "{" +
        "Commercial Plane: " +
        "Identificador ='" + getIdentificador() + "'" +
        ", Fabricante ='" + getFabricante() + "'" +
        ", Modelo ='" + getModelo() + "'" +
        ", Ano de Produção ='" + getAno_prod() + "'" +
        ", Número máximo de passageiros ='" + getMax_passageiros() + "'" +
        ", Velocidade Máxima ='" + getMax_vel() + "'" +
            ", Número de Tripulantes ='" + getNTripulantes() + "'" +
            "}";
    }


}
