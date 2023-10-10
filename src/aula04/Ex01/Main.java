package aula04.Ex01;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Object> figuras = new ArrayList<Object>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar triângulo");
            System.out.println("2. Criar retângulo");
            System.out.println("3. Criar círculo");
            System.out.println("4. Sair");
    
            opcao = input.nextInt();
    
            switch (opcao) {
                case 1:
                    System.out.println("Digite os lados do triângulo:");
                    double lado1 = input.nextDouble();
                    double lado2 = input.nextDouble();
                    double lado3 = input.nextDouble();
                    Triangulo t = new Triangulo(lado1, lado2, lado3);
                    figuras.add(t);
                    System.out.println("Triângulo criado com sucesso!");
                    break;
    
                case 2:
                    System.out.println("Digite o comprimento e a altura do retângulo:");
                    double comp = input.nextDouble();
                    double altura = input.nextDouble();
                    Retangulo r = new Retangulo(comp, altura);
                    figuras.add(r);
                    System.out.println("Retângulo criado com sucesso!");
                    break;
    
                case 3:
                    System.out.println("Digite o raio do círculo:");
                    double raio = input.nextDouble();
                    Circulo c = new Circulo(raio);
                    figuras.add(c);
                    System.out.println("Círculo criado com sucesso!");
                    break;
    
                case 4:
                    break;
    
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    
        System.out.println("\nFiguras criadas:");
        for (Object figura : figuras) {
            System.out.println(figura.toString());
        }
    
        System.out.println("\nA comparar pares de figuras do mesmo tipo:");
        for (int i = 0; i < figuras.size() - 1; i++) {
            for (int j = i + 1; j < figuras.size(); j++) {
                Object figura1 = figuras.get(i);
                Object figura2 = figuras.get(j);
                if (figura1.getClass() == figura2.getClass()) {
                    if (figura1.equals(figura2)) {
                        System.out.println(figura1.toString() + " é igual a " + figura2.toString());
                    } else {
                        System.out.println(figura1.toString() + " é diferente de " + figura2.toString());
                    }
                }
            }
        }
    
        input.close();
    }
    
        

}




