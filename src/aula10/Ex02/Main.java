package aula10.Ex02;
import aula10.Ex01.Book;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import java.util.Iterator;

import java.util.HashSet;

public class Main {
    public static Book randBook(Map<String, HashSet<Book>> library, String genre) {
        int genreSize = library.get(genre).size();

        int currentIndex = 0;
        Random random = new Random();

        int randNumber = random.nextInt(genreSize);

        Book randbook = new Book();
        Iterator<Book> iterator = library.get(genre).iterator();


        while(iterator.hasNext()){
            
            randbook = iterator.next();

            if (currentIndex == randNumber){
                return randbook;
            }

            currentIndex++;

        }
        return null;
        
    }

    public static void main(String[] args) {
        Map<String, HashSet<Book>> Library = new TreeMap<>();
        Book b1 = new Book("Livro Dramático", "José", 2004);
        Book b2 = new Book("Livro Assustador", "Jorge", 2014);
        Book b3 = new Book("Livro de Ação", "Manel", 2007);
        Book b4 = new Book("Livro de Ficção", "António", 1987);
        Book b5 = new Book("Livro Romântio", "Rei da Silva", 1000);

        HashSet<Book> s1 = new HashSet<>();
        s1.add(b1);
        HashSet<Book> s2 = new HashSet<>();
        s2.add(b2);
        HashSet<Book> s3 = new HashSet<>();
        s3.add(b3);
        HashSet<Book> s4 = new HashSet<>();
        s4.add(b4);
        HashSet<Book> s5 = new HashSet<>();
        s5.add(b5);

        Library.put("Drama", s1);
        Library.put("Terror", s2);
        Library.put("Ação", s3);
        Library.put("Ficção", s4);
        Library.put("Romântico", s5);

        HashSet<Book> s6 = new HashSet<>();
        s6.add(new Book("Livro drama Replace", "José", 2005));

        Library.replace("Drama", s6);

        Library.remove("Ficção");

        
        Library.get("Drama").add(new Book("Drama 2", "José", 2006));
        Library.get("Ação").add(new Book("Ação 2", "Manel", 2016));
        Library.get("Ação").add(new Book("Ação 3", "Manel", 2005));
        Library.get("Romântico").add(new Book("Romântico 2", "Rei da Silva", 2012));
        Library.get("Ação").add(new Book("Ação 4", "Manel", 2010));
        Library.get("Terror").add(new Book("Terror 2", "Jorge", 1998));
        Library.get("Terror").add(new Book("Terror 3", "Jorge", 1785));
        Library.get("Romântico").add(new Book("Romântico 3", "Rei da Silva", 2003));




        System.out.println(Library);
        System.out.println(Library.keySet());
        System.out.println(Library.values());
        System.out.println(randBook(Library, "Ação"));

    }
}
