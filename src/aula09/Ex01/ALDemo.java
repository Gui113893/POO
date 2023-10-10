package aula09.Ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import aula06.Ex01.Pessoa;

public class ALDemo {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10) 
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++) 
            System.out.println("Elemento: " + c1.get(i));

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio"); 
        c2.remove(0);
        System.out.println(c2);
        System.out.println(c2.contains("Vento"));
        System.out.println(c2.contains("Olá"));
        System.out.println(c2.subList(0, 2));

        Set<Pessoa> c3 = new HashSet<>();

        c3.add(new Pessoa("José"));
        c3.add(new Pessoa("João"));
        c3.add(new Pessoa("Beatriz"));
        c3.add(new Pessoa("António"));
        c3.add(new Pessoa("Manel"));
        c3.add(new Pessoa("José"));

        Iterator<Pessoa> it = c3.iterator();

        System.out.println("Elementos de c3: ");

        while(it.hasNext()){
            Pessoa p = it.next();
            System.out.println(p.getNome());
        }
        System.out.println(); 
    }
}