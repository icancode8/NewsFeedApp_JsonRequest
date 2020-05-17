package com.example.udacity_newsfeedapp_v2;

public class NewsFeed {

    // Declare the VARIABLES for each property of the NEWS object
    private String mTitle;
    private String mNews;
    private String mDate;
    private String mAuthor;
    private String mUrl;

    // Create CONSTRUCTOR to pass each of the properties to the NewsFeed Class
    public NewsFeed(String title, String news, String date, String author, String url) {
        this.mTitle = title;
        this.mNews = news;
        this.mDate = date;
        this.mAuthor = author;
        this.mUrl = url;
    }

    // Create GETTERS METHODS for each variable of the NEWS Object
    // this will be accessed by the NewsFeed_ArrayAdapter
    public String getmTitle() {
        return mTitle;
    }
    public String getmNews() {
        return mNews; }

    public String getmDate() {
        return mDate;
    }
    public String getmAuthor() {
        return mAuthor;
    }
    public String getUrl() {
        return mUrl;
    }


}
