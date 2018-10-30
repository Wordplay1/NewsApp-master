package com.example.android.newsapp;

public class Story {

    private static final String NO_DATE_PROVIDED = null;

    private static final String NO_AUTHOR_PROVIDED = null;

    private static final int NO_IMAGE_PROVIDED = -1;

    private String title;

    private String section;

    private String url;

    private String date = NO_DATE_PROVIDED;

    private String author = NO_AUTHOR_PROVIDED;

    private int imageResourceId;

    /** Second constructor
     *
     * @param title     title of the article
     * @param section   section of the article
     * @param url       url of article
     * @param date      date of article
     * @param author    author of article
     */
    public Story(String title, String section, String url, String date, String author) {
        this.title = title;
        this.section = section;
        this.url = url;
        this.date = date;
        this.author = author;
    }

    /** 3rd constructor
     *
     * @param title     title of the article
     * @param section   section of the article
     * @param url        url of article
     */
    public Story(String title, String section, String url){
        this.title = title;
        this.section = section;
        this.url = url;

    }

    /** method to get title
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /** method to return section
     *
     * @return section
     */
    public String getSection() {
        return section;
    }

    /** method to return url
     *
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /** method to return date
     *
     * @return date
     */
    public String getDate() {
        return date;
    }

    /** method to return author
     *
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /** method to check date
     *
     * @return date not null
     */
    public boolean hasDate(){
        return date != NO_DATE_PROVIDED;
    }

    /** method to check author
     *
     * @return author not null
     */
    public boolean hasAuthor(){
        return author != NO_AUTHOR_PROVIDED;
    }

    /** method to check image
     *
     * @return image not null
     */
    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
