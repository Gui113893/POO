package aula09.Ex03;

import java.util.Scanner;

import aula09.Ex03.Planes.*;


public class PlaneTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        boolean PlaneManagerCriado = false;
        PlaneManager planeManager = null;

        while (true){
            System.out.println("1 - Criar Plane Manager");
            System.out.println("2 - Adicionar avião");
            System.out.println("3 - Remover avião");
            System.out.println("4 - Procurar um avião");
            System.out.println("5 - Imprimir todos os aviões");
            System.out.println("6 - Imprimir lista de um tipo de avião");
            System.out.println("7 - Imprimir avião mais rápido");
            System.out.println("8 - Fechar");

            res = sc.nextInt();

            if (res == 8){
                break;
            }
            else if (res == 1){
                planeManager = new PlaneManager();
                PlaneManagerCriado = true;
            }
            else if (res != 1 && !PlaneManagerCriado){
                System.out.println("Não é possível fazer ação sem criar primeiro um PLaneManager");
            }
            else if (res == 2){
                System.out.println("1 - Adicionar Avião Comercial");
                System.out.println("2 - Adicionar Avião Militar");

                int op = sc.nextInt();
                String id = "";
                String fab = "";
                String modelo = "";
                int ano = 0;
                int max_pass = 0;
                int max_vel = 0;
                Plane p = null;
                boolean planeCriado = false;

                switch (op) {
                    case 1:
                        System.out.print("Identificador: ");
                        id = sc.next();
                        System.out.print("\nFabricante: ");
                        fab = sc.next();
                        System.out.print("\nModelo: ");
                        modelo = sc.next();
                        System.out.print("\nAno de produção: ");
                        ano = sc.nextInt();
                        System.out.print("\nNúmero máximo de passageiros: ");
                        max_pass = sc.nextInt();
                        System.out.print("\nVelocidade máxima: ");
                        max_vel = sc.nextInt();
                        p = null;
                        planeCriado = false;
                        System.out.print("\nNúmero de tripulantes: ");
                        int n_trip = sc.nextInt();
                        p = new CommercialPlane(id, fab, modelo, ano, max_pass, max_vel, n_trip);
                        planeCriado = true;
                        break;
                    case 2:
                        System.out.print("Identificador: ");
                        id = sc.next();
                        System.out.print("\nFabricante: ");
                        fab = sc.next();
                        System.out.print("\nModelo: ");
                        modelo = sc.next();
                        System.out.print("\nAno de produção: ");
                        ano = sc.nextInt();
                        System.out.print("\nNúmero máximo de passageiros: ");
                        max_pass = sc.nextInt();
                        System.out.print("\nVelocidade máxima: ");
                        max_vel = sc.nextInt();
                        p = null;
                        planeCriado = false;
                        System.out.print("\nNúmero de munições: ");
                        int n_mun = sc.nextInt();
                        p = new MilitaryPlane(id, fab, modelo, ano, max_pass, max_vel, n_mun);
                        planeCriado = true;
                        break;
                    default:
                        System.out.println("Input inválido");
                        break;
                }

                if (planeCriado) planeManager.addPlane(p);

            }
            else if (res == 3){
                System.out.print("\nIdentificador do avião que pretende remover: ");
                String id = sc.next();
                planeManager.removePlane(id);
            }
            else if (res == 4){
                System.out.print("\nIdentificador do avião que pretende procurar: ");
                String id = sc.next();

                System.out.println(planeManager.searchPlane(id));
            }
            else if (res == 5){
                planeManager.printAllPlanes();
            }
            else if (res == 6){
                System.out.println("1 - Lista de Aviões Comercial");
                System.out.println("2 - Lista de Aviões Militar");

                int op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println(planeManager.getCommercialPlanes());
                        break;
                    case 2:
                        System.out.println(planeManager.getMilitaryPlanes());
                        break;
                    default:
                        System.out.println("Input inválido");
                        break;
                }
            }
            else if (res == 7){
                System.out.println(planeManager.getFastestPlane());
            }
        }
        sc.close();
    }    
}
