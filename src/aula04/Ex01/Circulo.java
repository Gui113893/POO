package aula04.Ex01;

public class Circulo{
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double getPerimetro(){
        return 2*Math.PI*this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Circulo)) {
            return false;
        }
        Circulo circulo = (Circulo) o;
        return raio == circulo.raio;
    }


    @Override
    public String toString() {
        return "{" +
            " Raio ='" + getRaio() + "'" +
            ", Área ='" + getArea() + "'" +
            ", Perímetro ='" + getPerimetro() + "'" +
            "}";
    }

}
