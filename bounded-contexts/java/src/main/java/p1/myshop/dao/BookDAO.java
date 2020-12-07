package p1.myshop.dao;

import p1.myshop.catalog.Book;
import p1.myshop.catalog.ArticleId;

public interface BookDAO {
    Book find(ArticleId itemId);
}
