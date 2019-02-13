package com.LegendsOfTheArena.Elastic.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "moka", type = "books")
public class Book {

    @Id
    private String id;
    private String title;
    private String author;
    private String releaseDate;

    public Book() {
    }

    public Book(String id, String title, String author, String releaseDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    //getters and setters

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] getReleaseDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] getAuthor() {
		// TODO Auto-generated method stub
		return null;
	}
}