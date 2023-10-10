package aula10.Ex03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, ArrayList<Integer>> CharInPhrase = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Frase: ");
        String phrase = sc.nextLine();
        sc.close();
        char Char = ' ';

        for (int i = 0; i < phrase.length(); i++){
            Char = phrase.charAt(i);

            if (CharInPhrase.containsKey(Char)){
                CharInPhrase.get(Char).add(phrase.indexOf(Char, i));
            }else{
                ArrayList<Integer> new_Array = new ArrayList<>();
                new_Array.add(phrase.indexOf(Char, i));
                CharInPhrase.put(Char, new_Array);
            }
        }

        System.out.println(CharInPhrase);
    }
}
