package p1.myshop.dao;

import p1.myshop.catalog.Dvd;
import p1.myshop.catalog.ArticleId;

public interface DvdDAO {
    Dvd find(ArticleId itemId);
}
