package aula12.Ex03;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
      public static void main(String[] args) throws IOException {
            TreeSet<Movie> movies = Movie.loadMoviesByName("src/aula12/Ex03/movies.txt");

            movies.forEach(System.out::println);

            System.out.println("=========Sorted By Running Time=========");
            movies.stream()
                        .sorted(Comparator.comparing(Movie::getRunning_time))
                        .forEach(System.out::println);

            System.out.println("=========Sorted By Score Reversed=========");
            movies.stream()
                        .sorted(Comparator.comparing(Movie::getScore).reversed())
                        .forEach(System.out::println);

            movies.stream()
                        .collect(Collectors.groupingBy(Movie::getGenre))
                        .forEach((key, value) -> {
                              System.out.println("Genre: " + key + " (" + value.size() + ")");
                        });
      
            Scanner sc = new Scanner(System.in);
                        
            System.out.print("Genre: ");
            String genre = sc.next();

            PrintWriter out = new PrintWriter(new File("src/aula12/Ex03/myselection.txt"), StandardCharsets.UTF_8);

            movies.stream()
                        .filter((movie) -> movie.getScore() > 60 && movie.getGenre().equalsIgnoreCase(genre))
                        .forEach(out::println);

            sc.close();
            System.out.println("Data stored!");
            out.close();

      }

}

