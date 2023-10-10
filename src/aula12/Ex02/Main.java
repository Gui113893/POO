package aula12.Ex02;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) throws IOException{
        File file = new File("src/aula12/Ex02/A_cidade_e_as_serras.txt");

        Scanner sc = new Scanner(new FileReader(file, StandardCharsets.UTF_8));
        Map<Character, Map<String, Integer>> words = new TreeMap<>();

        while (sc.hasNextLine()){
            String[] line = sc.nextLine().split("[ \\t\\n.,:^'‘’;?!\\-\\*{}=«»#$﻿_+&/()\\[\\]”“\"']");
            for (String word : line) {
                word = word.toLowerCase();
                if (word.length() >= 3 && !Character.isDigit(word.charAt(0))){
                    if (!words.containsKey(word.charAt(0))){
                        Map<String, Integer> counter = new TreeMap<>();
                        counter.put(word, 1);
                        words.put(word.charAt(0), counter);
                    }else{
                        if (!words.get(word.charAt(0)).containsKey(word)){
                            words.get(word.charAt(0)).put(word, 1);
                        } else{
                            int new_value = words.get(word.charAt(0)).get(word) + 1;
                            words.get(word.charAt(0)).replace(word, new_value);
                        }
                    }
                }
                
            }
            
        }
        sc.close();
        
        PrintWriter out = new PrintWriter(new File("src/aula12/Ex02/out_put.txt"), StandardCharsets.UTF_8);
        Map<String, Integer> counter = new TreeMap<>();

        for (Character key : words.keySet()) {
            out.printf("\n%c: ", key);
            counter = words.get(key);

            for (String word : counter.keySet()) {
                out.printf("%s, %d; ", word, counter.get(word));
            }
        }

        out.close();
        System.out.println("Data Stored");
    }
}
