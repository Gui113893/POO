package aula07.Ex01;

public class Retangulo extends Forma{
    public double comp;
    private double altura;

    public Retangulo(String cor, double comp, double altura){
        super(cor);
        this.comp = comp;
        this.altura = altura;
    }


    public double getComp() {
        return this.comp;
    }

    public void setComp(double comp) {
        this.comp = comp;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double perimetro(){
        return 2*this.comp + 2*this.altura;
    }

    public double area(){
        return this.comp * this.altura;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Retangulo)) {
            return false;
        }
        Retangulo retangulo = (Retangulo) o;
        return comp == retangulo.comp && altura == retangulo.altura && cor.equals(retangulo.cor);
    }


    @Override
    public String toString() {
        return "Retângulo = {" +
            " comp='" + getComp() + "'" +
            ", altura='" + getAltura() + "'" +
            ", cor='" + cor + "'" +
            "}";
    }

}
