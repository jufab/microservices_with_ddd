package p1.myshop.shoppingcart;

import p1.myshop.catalog.Article;

import java.util.List;


public class Cart {
    private User user;
    private List<CartItem> items;

    public Cart(User user, List<CartItem> items) {
        this.user = user;
        this.items = items;
    }

    public List<CartItem> items() {
        return items;
    }

    public void appendItem(Article article) {
        // TODO add new item or increment quantity
    }
}
