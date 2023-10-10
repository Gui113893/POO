package aula07.Ex01;

public class Circulo extends Forma{
    public double raio;

    public Circulo(String cor, double raio){
        super(cor);
        this.raio = raio;
    }


    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double perimetro(){
        return 2*Math.PI*this.raio;
    }

    public double area(){
        return Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Circulo)) {
            return false;
        }
        Circulo circulo = (Circulo) o;
        return raio == circulo.raio && cor.equals(circulo.cor);
    }
    

    @Override
    public String toString() {
        return "Circulo = {" +
            " raio='" + getRaio() + "'" +
            ", cor='" + cor + "'" +
            "}";
    }

}
