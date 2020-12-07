package p1.myshop.shoppingcart;

import p1.myshop.catalog.Article;

import java.util.Collections;

public class ShoppingCartService {

    public Cart findUserCart(User user) {
        //TODO: Should go in the database to see if the user has already a cart
        return new Cart(user, Collections.emptyList());
    }

    public void addItem(Cart cart, Article article) {
        cart.appendItem(article);
    }

}
