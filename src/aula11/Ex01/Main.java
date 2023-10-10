package aula11.Ex01;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/aula11/Ex01/major.txt");
        Scanner sc = new Scanner(new FileReader(file));
        Map<String, Map<String, Integer>> PairCounter = new TreeMap<>();
        ArrayList<String> words = new ArrayList<>();
    

        while (sc.hasNext()){
            String word = sc.next();

            if (word.length() >= 3){
                words.add(word);
            }
        }

        System.out.println(words);

        ArrayList<ArrayList<String>> pairs = new ArrayList<>();
        ArrayList<String> pair = new ArrayList<>();

        for (int i = 0; i < words.size() - 1; i++){
            pair.add(words.get(i));
            pair.add(words.get(i+1));

            pairs.add(pair);

            pair = new ArrayList<>();
        }

        System.out.println(pairs);
        String lastWord = "";
        String word = "";

        for (int i = 0; i < pairs.size(); i++){
            lastWord = pairs.get(i).get(0);
            word = pairs.get(i).get(1);

            if (PairCounter.containsKey(lastWord) && PairCounter.get(lastWord).containsKey(word)){
                int valor = PairCounter.get(lastWord).get(word) + 1;
                PairCounter.get(lastWord).replace(word, valor - 1, valor);
            }

            if (PairCounter.containsKey(lastWord) && !PairCounter.get(lastWord).containsKey(word)){
                PairCounter.get(lastWord).put(word, 1);
            }

            if (!PairCounter.containsKey(lastWord) && lastWord != null){
                Map<String, Integer> palavras = new TreeMap<>();
                palavras.put(word, 1);
                PairCounter.put(lastWord, palavras);
            }
        }

        System.out.println(PairCounter);
    } 
}
