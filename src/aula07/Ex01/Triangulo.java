package aula07.Ex01;

public class Triangulo extends Forma{
    public double lado1;
    public double lado2;
    public double lado3;

    public Triangulo(String cor ,double lado1, double lado2, double lado3){
        super(cor);
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

    public double perimetro(){
        return this.lado1 + this.lado2 + this.lado3;
    }

    public double area(){
        return Math.sqrt( (this.perimetro()/2) * ((this.perimetro()/2) - this.lado1) * ((this.perimetro()/2) - this.lado2) * ((this.perimetro()/2) - this.lado3));
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Triangulo)) {
            return false;
        }
        Triangulo triangulo = (Triangulo) o;
        return lado1 == triangulo.lado1 && lado2 == triangulo.lado2 && lado3 == triangulo.lado3 && cor.equals(triangulo.cor);
    }


    @Override
    public String toString() {
        return "Triângulo = {" +
            " lado1='" + getLado1() + "'" +
            ", lado2='" + getLado2() + "'" +
            ", lado3='" + getLado3() + "'" +
            ", cor='" + cor + "'" +
            "}";
    }


}
