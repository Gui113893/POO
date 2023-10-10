package aula10.Ex01;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Book> Conjunto = new HashMap<>();

        Conjunto.put("Drama", new Book("Livro Dramático", "José", 2004));
        Conjunto.put("Terror", new Book("Livro Assustador", "Jorge", 2014));
        Conjunto.put("Ação", new Book("Livro de Ação", "Manel", 2007));
        Conjunto.put("Ficção", new Book("Livro de Ficção", "António", 1987));
        Conjunto.put("Romântico", new Book("Livro Romântio", "Rei da Silva", 1000));

        Conjunto.replace("Drama", new Book("Livro Dramático 2", "José", 2005));

        Conjunto.remove("Ficção");

        System.out.println(Conjunto);
        System.out.println(Conjunto.keySet());
        System.out.println(Conjunto.values());

    }
}
