package p1.myshop.catalog;

public abstract class Article implements HasWeight {
    ArticleId articleId;
    private String ean;

    public Article(ArticleId articleId, String ean) {
        this.articleId = articleId;
        this.ean = ean;
    }

    public ArticleId getArticleId() {
        return articleId;
    }

    public String getEan() {
        return ean;
    }

    @Override
    public double weight() {
        return 0;
    }
}
