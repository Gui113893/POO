package aula10.Ex04;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/aula10/Ex04/words.txt");
        Scanner input = new Scanner(new FileReader(file));
        ArrayList<String> Words = new ArrayList<>();
        ArrayList<String> S_Ended = new ArrayList<>();

        while (input.hasNext()){
            String word = input.next();
            System.out.println(word);
            if (word.length() > 2){
                Words.add(word);
            }
        }
        System.out.println(Words);

        for (int i = 0; i < Words.size(); i++){
            if (Words.get(i).charAt(Words.get(i).length() - 1) == 's'){
                S_Ended.add(Words.get(i));
            }

            if (!Words.get(i).matches("^[a-zA-Z]+$")){
                Words.remove(i);
            }
        }
        System.out.println(S_Ended);
        System.out.println(Words);

    }
}
