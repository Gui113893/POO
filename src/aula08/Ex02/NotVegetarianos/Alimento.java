package aula08.Ex02.NotVegetarianos;

public abstract class Alimento {
    double proteinas;
    double calorias;
    double peso;

    public Alimento(double proteinas, double calorias, double peso){
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }


    public double getProteinas() {
        return this.proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getCalorias() {
        return this.calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
