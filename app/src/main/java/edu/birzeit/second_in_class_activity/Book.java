package edu.birzeit.second_in_class_activity;

public class Book {

    private String title;
    private String authorName;
    private String Pages;
    private boolean avaliable;

    public Book(String title, String authorName, String pages, boolean avaliable) {
        this.title = title;
        this.authorName = authorName;
        Pages = pages;
        this.avaliable = avaliable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPages() {
        return Pages;
    }

    public void setPages(String pages) {
        Pages = pages;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }
}
