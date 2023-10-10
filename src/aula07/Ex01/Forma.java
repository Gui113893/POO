package aula07.Ex01;

public abstract class Forma {
    public String cor;

    public Forma(String cor){
        this.cor = cor;
    }

    public abstract double perimetro();
    public abstract double area();

}


