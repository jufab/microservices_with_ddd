package p1.myshop.services.shipping;

import p1.myshop.services.catalog.CatalogService;
import p1.myshop.shipping.HasWeight;
import p1.myshop.shoppingcart.Cart;
import p1.myshop.shoppingcart.CartItem;

public class DeliveryService {
    private final CatalogService catalogService;

    public DeliveryService(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    public double calculateOrderWeight(Cart cart) {
        return cart.items().stream()
                .map(CartItem::itemId)
                .map(catalogService::loadItem)
                .mapToDouble(HasWeight::weight)
                .sum();
    }
}
