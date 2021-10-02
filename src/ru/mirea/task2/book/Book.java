package ru.mirea.task2.book;

public class Book {
    private String name;
    private String author;
    private String genre;
    private int pagesNum;

    public Book(String name, String author, String genre, int pagesNum){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.pagesNum = pagesNum;
    }
    public Book(String name, String author, String genre){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.pagesNum = 0;
    }
    public Book(String name, String author){
        this.name = name;
        this.author = author;
        this.genre = "NoGenre";
        this.pagesNum = 0;
    }
    public Book(String name){
        this.name = name;
        this.author = "Nick";
        this.genre = "NoGenre";
        this.pagesNum = 0;
    }
    public Book(){
        this.name = "NoName";
        this.author = "Nick";
        this.genre = "NoGenre";
        this.pagesNum = 0;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setPagesNum(int pagesNum) {
        this.pagesNum = pagesNum;
    }

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public int getPagesNum() {
        return pagesNum;
    }

    public float readTime(){
        float readingSpeed = 5.4f;
        return pagesNum/readingSpeed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", pagesNum=" + pagesNum +
                '}';
    }
}
