package org.fasttrack.tema14;

public class Quote {
    private int id;
    private String author;
    private String quote;
    private boolean favourite;

    private static int currentId = 1;

    public Quote(int id, String author, String quote) {
        this.favourite = false;
        this.id = id;
        this.author = author;
        this.quote = quote;
    }

    //alternativa
    public Quote(String author, String quote) {
        this.favourite = false;
        this.author = author;
        this.quote = quote;
        this.id = currentId++;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }
}
