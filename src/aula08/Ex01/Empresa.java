package aula08.Ex01;

import java.util.Vector;

public class Empresa {
    String nome;
    String codigoPostal;
    String email;
    Vector <Viatura> Viaturas;

    public Empresa(String nome, String codigoPostal, String email, Vector<Viatura> Viaturas){
        this.nome = nome;
        this.codigoPostal = codigoPostal;
        this.email = email;
        this.Viaturas = Viaturas;
    }


    public String getNome() {
        return this.nome;
    }

    public String getCodigoPostal() {
        return this.codigoPostal;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Vector<Viatura> getViaturas() {
        return this.Viaturas;
    }

    public void setViaturas(Vector<Viatura> Viaturas) {
        this.Viaturas = Viaturas;
    }

    public void addViatura(Viatura Viatura){
        getViaturas().add(Viatura);
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", codigoPostal='" + getCodigoPostal() + "'" +
            ", email='" + getEmail() + "'" +
            ", Viaturas='" + getViaturas() + "'" +
            "}";
    }


}
