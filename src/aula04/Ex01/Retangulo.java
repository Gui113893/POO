package aula04.Ex01;

public class Retangulo{
    private double comp;
    private double altura;


    public Retangulo() {
    }

    public Retangulo(double comp, double altura) {
        
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

    public void setaltura(double altura) {
        this.altura = altura;
    }

    public double getArea(){
        return this.comp * this.altura;
    }

    public double getPerimetro(){
        return 2*this.comp + 2*this.altura;
    }

 
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Retangulo)) {
            return false;
        }
        Retangulo retangulo = (Retangulo) o;
        return comp == retangulo.comp && altura == retangulo.altura;
    }


    @Override
    public String toString() {
        return "{" +
            " Comprimento ='" + getComp() + "'" +
            ", alturaura ='" + getAltura() + "'" +
            ", Perímetro ='" + getPerimetro() + "'" +
            ", Área ='" + getArea() + "'" +
            "}";
    }

}

