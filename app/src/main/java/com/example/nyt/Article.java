package com.example.nyt; // <============= CHANGE ME

import com.google.gson.annotations.SerializedName;

/***
 * Model class for news articles. This should be 100% familiar to you.
 */
public class Article extends ParsedArticles {


    private String id;

    private String byline;

    private String published_date;

    private String title;

    private String url;

    @SerializedName("abstract")
    private String theAbstract;


    // unique identifier of an article
    private int articleID;

    // Title of the article
    private String headline;
    // Name of the author
    private String author;
    // Short text to be displayed on main page
    private String summary;
    // Full text of the article
    private String content;
    // Resource ID of associated image (e.g. R.drawable.my_image)
    private int imageDrawableId;


    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }

    public Article(String id, String byline, String published_date, String title, String url, String theAbstract) {
        this.id = id;
        this.byline = byline;
        this.published_date = published_date;
        this.title = title;
        this.url = url;
        this.theAbstract = theAbstract;

        // Added this line for temporary way of showing images
        this.imageDrawableId = imageDrawableId;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTheAbstract() {
        return theAbstract;
    }

    public void setTheAbstract(String theAbstract) {
        this.theAbstract = theAbstract;
    }
}
