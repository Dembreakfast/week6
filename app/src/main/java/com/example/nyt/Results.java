package com.example.nyt;

import com.google.gson.annotations.SerializedName;

public class Results {

    private String id;

    private String byline;

    private String published_date;

    private String title;

    private String url;

    @SerializedName("abstract")
    private String theAbstract;


    public Results(String id, String byline, String published_date, String title, String url, String theAbstract) {
        this.id = id;
        this.byline = byline;
        this.published_date = published_date;
        this.title = title;
        this.url = url;
        this.theAbstract = theAbstract;
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