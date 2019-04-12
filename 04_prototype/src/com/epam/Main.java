package com.epam;

public class Main {

    public static void printArticle(Article article) {
        System.out.println(article.getSubject());
        for (String paragraph : article.getText()) {
            System.out.println(paragraph);
        }
    }

    public static void main(String[] args) {
        WikiStorage ws = new WikiStorage();

        Article article = ws.getArticleCopy("Route 60");

        article.addParagraph("New paragraph in copy of Route 60 article.");

        System.out.println("--- Modified copy ---");
        printArticle(article);

        Article newCopy = ws.getArticleCopy("Route 60");

        System.out.println("--- Reference copy ---");
        printArticle(newCopy);

        System.out.println("--- Updating copy in storage ---");
        ws.putForReview(article);

        Article updated = ws.getArticleCopy("Route 60");
        printArticle(updated);
    }
}
