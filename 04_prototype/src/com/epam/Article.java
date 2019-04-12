package com.epam;

import java.util.ArrayList;

public class Article implements ArticlePrototype {

    private String subject;
    private ArrayList<String> paragraphs;

    public Article(String subject) {
        this.subject = subject;
        this.paragraphs = new ArrayList<>();
    }

    public String getSubject() {
        return subject;
    }

    public void addParagraph(String text) {
        this.paragraphs.add(text);
    }

    public ArrayList<String> getText() {
        return this.paragraphs;
    }

    @Override
    public Article clone() {
        Article article = null;
        try {
            article = (Article)super.clone();
            article.subject = this.subject;
            article.paragraphs = (ArrayList<String>) this.paragraphs.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return article;
    }
}
