package aula12.Ex03;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Movie {
    private String name;
    private double score;
    private String rating;
    private String genre;
    private int running_time;

    public Movie(){}

    public Movie(String name, double score, String rating, String genre, int running_time){
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.running_time = running_time;
    }


    public String getName() {
        return this.name;
    }

    public String getNameLower(){
        return this.name.toLowerCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRunning_time() {
        return this.running_time;
    }

    public void setRunning_time(int running_time) {
        this.running_time = running_time;
    }

    public static TreeSet<Movie> loadMoviesByName(String path) throws IOException{
        File file = new File(path);
        Scanner sc = new Scanner(new FileReader(file, StandardCharsets.UTF_8));

        String[] line = sc.nextLine().split("\t");
        

        TreeSet<Movie> movies = new TreeSet<>(Comparator.comparing(Movie::getNameLower));

        while (sc.hasNextLine()){
            line = sc.nextLine().split("\t");
            String nome = line[0];
            double score = Double.parseDouble(line[1]);
            String rating = line[2];
            String genre = line[3];
            int running_time = Integer.parseInt(line[4]);

            Movie movie = new Movie(nome, score, rating, genre, running_time);
            movies.add(movie);

        }
        sc.close();

        return movies;
    }


    @Override
    public String toString() {
        // name	score	rating	genre	running time
        return String.format("%-40s%-15.2f%-15s%-15s%3d",this.name, this.score, this.rating, this.genre, this.running_time);
    }

}
