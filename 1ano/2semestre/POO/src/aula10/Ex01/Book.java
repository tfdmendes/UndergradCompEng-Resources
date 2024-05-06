package aula10.Ex01;

public class Book {

    private String title, author;
    private int year; 

    public Book(String title, String author, int year){
        if(title.isBlank())
            throw new IllegalArgumentException("Invalid title");
        if(author.isBlank())
            throw new IllegalArgumentException("Invalid author");
        if(year <= 0)
            throw new IllegalArgumentException("Invalid year");
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return "Titulo: " + this.title + ", Autor: " + this.author + ", Ano: " + this.year;
    }
    

}
