package aula10.Ex01;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(){}

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    


    @Override
    public String toString() {
        return "{" +
            " title = '" + getTitle() + "'" +
            ", author = '" + getAuthor() + "'" +
            ", year = '" + getYear() + "'" +
            "}";
    }

}

