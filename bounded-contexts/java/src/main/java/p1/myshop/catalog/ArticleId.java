package p1.myshop.catalog;

public class ArticleId {
    private final String id;

    private ArticleId(String id) {
        this.id = id;
    }

    public static ArticleId from(String s) {
        return new ArticleId(s);
    }
}
