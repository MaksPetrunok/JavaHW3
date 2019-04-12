package com.epam;

import java.util.HashMap;

public class WikiStorage {

    private HashMap<String, Article> articles = new HashMap<>();

    // Init some articles...
    {
        String key = "Patterns";
        articles.put(key, new Article(key));
        articles.get(key).addParagraph("In software engineering, a software design pattern is a general, reusable solution to a commonly occurring problem...");

        key = "Route 60";
        articles.put(key, new Article(key));
        articles.get(key).addParagraph("U.S. Route 60 (US 60) is an east–west United States highway...");
        articles.get(key).addParagraph("The highway's eastern terminus is in Virginia Beach, Virginia...");
    }

    public Article getArticleCopy(String subject) {

        Article article = articles.get(subject);
        if (article == null) {
            throw new IllegalArgumentException("Article '" + subject + "' not found.");
        }
        return article.clone();
    }

    public void putForReview(Article article) {
        System.out.println("Thank you for improving WikiStorage.");

        // review updated article and update
        articles.put(article.getSubject(), article);
    }
}
