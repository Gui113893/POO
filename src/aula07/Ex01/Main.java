package aula07.Ex01;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Forma[] figuras = new Forma[10];
        int opcao = 0;
        int nfiguras = 0;
        String cor = "";

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
                    System.out.println("Digite a cor da forma: ");
                    cor = input.next();
                    figuras[nfiguras] = new Triangulo(cor,lado1, lado2, lado3);
                    nfiguras += 1;
                    System.out.println("Triângulo criado com sucesso!");
                    break;
    
                case 2:
                    System.out.println("Digite o comprimento e a altura do retângulo:");
                    double comp = input.nextDouble();
                    double altura = input.nextDouble();
                    System.out.println("Digite a cor da forma: ");
                    cor = input.next();
                    figuras[nfiguras] = new Retangulo(cor, comp, altura);
                    nfiguras += 1;
                    System.out.println("Retângulo criado com sucesso!");
                    break;
    
                case 3:
                    System.out.println("Digite o raio do círculo:");
                    double raio = input.nextDouble();
                    System.out.println("Digite a cor da forma: ");
                    cor = input.next();
                    figuras[nfiguras] = new Circulo(cor, raio);
                    nfiguras += 1;
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
        for (int i = 0; i < nfiguras; i++) {
            System.out.println(figuras[i].toString());
        }
    
        System.out.println("\nA comparar pares de figuras do mesmo tipo:");
        for (int i = 0; i < nfiguras - 1; i++) {
            for (int j = i + 1; j < nfiguras; j++) {
                Object figura1 = figuras[i];
                Object figura2 = figuras[j];
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




