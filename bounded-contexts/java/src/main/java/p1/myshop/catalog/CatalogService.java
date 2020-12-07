package p1.myshop.catalog;

import p1.myshop.catalog.Article;
import p1.myshop.catalog.ArticleId;
import p1.myshop.dao.BookDAO;
import p1.myshop.dao.DvdDAO;

public class CatalogService {
    private BookDAO bookDao;
    private DvdDAO dvdDao;

    public Article loadItem(ArticleId articleId) {
        Article article1 = bookDao.find(articleId);
        Article article2 = dvdDao.find(articleId);

        if (article1 == null) {
            return article2;
        }
        return article1;
    }
}
