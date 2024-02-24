// package libararyproject;

import java.util.Random;

public class Book {
    private String title;
    private String author;
    // private int id_get;
    private int id_gen() {
        Random rand = new Random();
        return rand.nextInt(1000); 
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
}
