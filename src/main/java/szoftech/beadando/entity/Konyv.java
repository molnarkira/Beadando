package szoftech.beadando.entity;

import javax.persistence.*;

@Entity
@Table(name = "konyv")
public class Konyv {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String title;

    @Column
    private int year;

    @Column
    private String description;

    public Konyv(){
    }

    public int getId(){ return id;}
    private void setId(int id){ this.id = id;}

    public String getAuthor(){ return author;}
    public void setAuthor(String author){ this.author = author;}

    public String getTitle(){ return title;}
    public void setTitle(String title){ this.author = author;}

    public int getYear(){ return year;}
    public void setYear(int year){ this.year = year;}

    public String getDescription(){ return description;}
    public void setDescription(String description){ this.description = description;}


}
