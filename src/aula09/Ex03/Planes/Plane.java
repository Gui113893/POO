package aula09.Ex03.Planes;

public abstract class Plane {
    protected String Identificador;
    protected String Fabricante;
    protected String Modelo;
    protected int ano_prod;
    protected int max_passageiros;
    protected int max_vel;

    public Plane(){}

    public Plane(String Identificador, String Fabricante, String Modelo, int ano_prod, int max_passageiros, int max_vel){
        this.Identificador = Identificador;
        this.Fabricante = Fabricante;
        this.Modelo = Modelo;
        this.ano_prod = ano_prod;
        this.max_passageiros = max_passageiros;
        this.max_vel = max_vel;
    }


    public String getIdentificador() {
        return this.Identificador;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    public String getFabricante() {
        return this.Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getModelo() {
        return this.Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAno_prod() {
        return this.ano_prod;
    }

    public void setAno_prod(int ano_prod) {
        this.ano_prod = ano_prod;
    }

    public int getMax_passageiros() {
        return this.max_passageiros;
    }

    public void setMax_passageiros(int max_passageiros) {
        this.max_passageiros = max_passageiros;
    }

    public int getMax_vel() {
        return this.max_vel;
    }

    public void setMax_vel(int max_vel) {
        this.max_vel = max_vel;
    }

    public abstract String getPlaneType();

    @Override
    public String toString() {
        return "{" +
            "Identificador ='" + getIdentificador() + "'" +
            ", Fabricante ='" + getFabricante() + "'" +
            ", Modelo ='" + getModelo() + "'" +
            ", Ano de Produção ='" + getAno_prod() + "'" +
            ", Número máximo de passageiros ='" + getMax_passageiros() + "'" +
            ", Velocidade Máxima ='" + getMax_vel() + "'" +
            "}";
    }


}
