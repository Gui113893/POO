package aula07.Avaliação;
import java.util.Scanner;

public class Main {
    public static void fight(Fighter f1, int first, Fighter f2, int second){
        while (f1.isAlive() && f2.isAlive()){
            switch ((int)(Math.random() * 2)) {
                case 0: f1.attack(f2); break;
                case 1: f2.attack(f1); break;
            }
        }

        if (f1.isAlive()){
            f1.vitorias += 1;
            f2.derrotas += 1;
        } else if (f2.isAlive()){
            f2.vitorias += 1;
            f1.derrotas += 1;
        }

        f1.setVida(100);
        f2.setVida(100);
        
        System.out.println("==========================");
        System.out.println("Informações Pós-Combate:");
        System.out.println("==========================");
        System.out.printf("%d - %s\n", first, f1.toString());
        System.out.printf("%d - %s\n", second, f2.toString());
        System.out.println("==========================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fighter[] fighters = new Fighter[10];

        String[] nomes = {"Afonso", "Alexandre", "André", "António", "Artur", "Bernardo", "Carlos", "David", "Diogo",
                            "Duarte", "Eduardo", "Francisco", "Gabriel", "Gonçalo", "Guilherme", "Hugo", "Ivo", "João",
                            "José", "Luís", "Manuel", "Miguel", "Nuno", "Paulo"};
        
        int choice = 0;
        do {
            System.out.println("===========================================");
            System.out.println("Game menu:");
            System.out.println("1. Generate fighters");
            System.out.println("2. Show all fighters");
            System.out.println("3. Start fight between selected fighters");
            System.out.println("4. Start fight between random fighters");
            System.out.println("5. Exit");
            System.out.println("===========================================");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < fighters.length; i++){
                        switch ((int)(Math.random() * 2)){
                            case 0: fighters[i] = new Boxer(nomes[(int)(Math.random()*24)]);break;
                            case 1: fighters[i] = new Wrestler(nomes[(int)(Math.random()*24)]);break;
                        }
                    }
                    break;
                case 2:
                    if (fighters[0] == null){
                        System.out.println("Not Possible. Need to generate fighters first!");
                    } else {
                        System.out.println("======================Fighters List======================");
                        for (int i = 0; i < fighters.length; i++){
                            System.out.printf("%d - %s\n", i, fighters[i].toString());
                        }
                        System.out.println("===========================================================");
                    }
                    break;
                case 3:
                    if (fighters[0] == null){
                        System.out.println("Not Possible. Need to generate fighters first!");
                    } else {
                        System.out.println("Choose the first fighter: ");
                        int first = scanner.nextInt();
                        Fighter f1 = fighters[first];
                        System.out.println("Choose the second fighter: ");
                        int second = scanner.nextInt();
                        Fighter f2 = fighters[second];

                        fight(f1, first, f2, second);
                    }
                    break;
                case 4:
                    if (fighters[0] == null){
                        System.out.println("Not Possible. Need to generate fighters first!");
                    } else {
                        int first_random = (int)(Math.random()*10);
                        Fighter f1_random = fighters[first_random];

                        int second_random = (int)(Math.random()*10);
                        Fighter f2_random = fighters[second_random];

                        while (first_random == second_random){
                            second_random = (int)(Math.random()*10);
                            f2_random = fighters[second_random];
                        }

                        fight(f1_random, first_random, f2_random, second_random);
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Opção não existe!");
                    break;
            }

        } while (choice != 5);

        scanner.close();
    }
}
