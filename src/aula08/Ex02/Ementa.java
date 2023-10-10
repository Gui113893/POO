package aula08.Ex02;

import java.util.Vector;

import aula08.Ex02.Pratos.Prato;

public class Ementa {
    String nome;
    String local;
    Vector <Prato> pratos = new Vector<Prato>();

    public Ementa(String nome, String local){
        this.nome = nome;
        this.local = local;
    }

    public Ementa(String nome, String local, Vector <Prato> pratos){
        this.nome = nome;
        this.local = local;
        this.pratos = pratos;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Vector<Prato> getPratos() {
        return this.pratos;
    }

    public void setPratos(Vector<Prato> pratos) {
        this.pratos = pratos;
    }

    public void addPrato(Prato prato){
        getPratos().add(prato);
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", local='" + getLocal() + "'" +
            ", pratos='" + getPratos() + "'" +
            "}";
    }


}
