package aula04.Ex01;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;


    public Triangulo() {
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return this.lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return this.lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getPerimetro(){
        return this.lado1 + this.lado2 + this.lado3;
    }
    
    public double getArea(){
        return Math.sqrt( (this.getPerimetro()/2) * ((this.getPerimetro()/2) - this.lado1) * ((this.getPerimetro()/2) - this.lado2) * ((this.getPerimetro()/2) - this.lado3));
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Triangulo)) {
            return false;
        }
        Triangulo triangulo = (Triangulo) o;
        return lado1 == triangulo.lado1 && lado2 == triangulo.lado2 && lado3 == triangulo.lado3;
    }

    @Override
    public String toString() {
        return "{" +
            " Lado1 ='" + getLado1() + "'" +
            ", Lado2 ='" + getLado2() + "'" +
            ", Lado3 ='" + getLado3() + "'" +
            ", Perímetro ='" + getPerimetro() + "'" +
            ", Área ='" + getArea() + "'" +
            "}";
    }


}
