package aula12.Ex01;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/aula12/Ex01/file.txt");
        Scanner sc = new Scanner(new FileReader(file));
        Set<String> words = new HashSet<>();

        int different_words = 0;
        int total_words = 0;

        while (sc.hasNext()){
            String word = sc.next();
            words.add(word);            
            total_words += 1;
        }

        different_words = words.size();

        System.out.printf("Número total de Palavras: %d\n", total_words);
        System.out.printf("Número de Diferentes Palavras: %d", different_words);
    }
}
