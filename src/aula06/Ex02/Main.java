package aula06.Ex02;
import java.util.Scanner;
import aula06.Ex01.Pessoa;

public class Main {
    public static int addContacto(Contacto[] contactos, Contacto contacto, int ncontactos){
        if (ncontactos >= contactos.length){
            Contacto[] newContactos = new Contacto[contactos.length*2];

            for (int i = 0; i < ncontactos; i++){
                newContactos[i] = contactos[i];
            }

            contactos = newContactos;
        }

        contactos[ncontactos] = contacto;
        ncontactos++;
        return ncontactos;
    } 


    public static boolean isPersonInList(Contacto[] contactos, Pessoa pessoa){
        boolean found = false;

        if (contactos[0] == null) return false;

        for (int i = 0; i < contactos.length; i++){
            if (contactos[i].pessoa.getNome() == pessoa.getNome()){
                found = true;
            }

            if (found)break;
        }

        return found;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contacto[] contactos = new Contacto[10];
        int ncontactos = 0;
        Contacto c;
        int continuar = 1;

        while (true){
            System.out.println("1. Inserir contacto");
            System.out.println("2. Alterar contacto");
            System.out.println("3. Apagar contacto");
            System.out.println("4. Procurar contacto");
            System.out.println("5. Listar contactos");
            System.out.println("0. Sair");

            int resp = sc.nextInt();

            if (resp == 0) break;

            if (resp == 1){
                System.out.print("Insira o nome: ");
                String nome = sc.next();
                Pessoa p = new Pessoa(nome);
                if (isPersonInList(contactos, p)){
                    System.out.print("Pessoa já existe\nPretende continuar?[0(Não)/1(Sim)]:  ");
                    continuar = sc.nextInt();
                }

                if (continuar == 0){
                    continue;
                }else{
                    System.out.print("\nNºTelemóvel: ");
                    String ntel = sc.next();
                    System.out.print("\nEmail: ");
                    String email = sc.next();
                    
                    if (email=="" && ntel != ""){
                        c = new Contacto(p, Integer.parseInt(ntel));
                    }else if (email !="" && ntel == ""){
                        c = new Contacto(p, email);
                    }else{
                        c = new Contacto(p, Integer.parseInt(ntel), email);

                    }
                    ncontactos = addContacto(contactos, c, ncontactos);
                }

            } else if (resp == 2){
                System.out.print("Insira o nome da pessoa que pretende alterar: ");
                String nome = sc.next();

                boolean alterarEmail;
                boolean alterarNtel;

                System.out.print("\nPretende alterar o email?[0(Não)/1(Sim)]: ");
                int valor = sc.nextInt();

                String email="";
                int ntel=0;

                if (valor == 1){
                    alterarEmail = true;
                    System.out.print("\nInsira novo email: ");
                    email = sc.next();

                }else{
                    alterarEmail = false;
                }

                System.out.print("\nPretende alterar o nº de telemóvel?[0(Não)/1(Sim)]: ");
                valor = sc.nextInt();

                if (valor == 1){
                    alterarNtel = true;
                    System.out.print("\nInsira novo nº de telemóvel: ");
                    ntel = sc.nextInt();

                }else{
                    alterarNtel = false;
                }

                for (int i = 0; i<ncontactos; i++){
                    if (contactos[i].pessoa.getNome() == nome){
                        if (alterarEmail){
                            contactos[i].setEmail(email);
                        }

                        if (alterarNtel){
                            contactos[i].setNtel(ntel);
                        }
                    }
                }
                
            }else if (resp == 3){
                System.out.print("Insira o nome da pessoa que pretende apagar: ");
                String nome = sc.next();

                for (int i = 0; i<ncontactos; i++){
                    if (contactos[i].pessoa.getNome() == nome){
                        contactos[i] = null;
                    }
                }
                ncontactos --;
            } else if (resp == 4){
                System.out.print("Insira o nº do contactio que pretende procurar: ");
                int ntel = sc.nextInt();

                for (int i = 0; i<ncontactos; i++){
                    if (contactos[i].getNtel() == ntel){
                        System.out.println(contactos[i].toString());
                    }
                }
            } else if (resp == 5){
                for (int i = 0; i<ncontactos; i++){
                    System.out.printf("\n%s", contactos[i].toString());
                }
            }

        }

        sc.close();
    }
}
