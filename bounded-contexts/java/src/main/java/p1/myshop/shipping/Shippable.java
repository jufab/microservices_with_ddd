package p1.myshop.shipping;

import p1.myshop.catalog.HasWeight;

public interface Shippable extends HasWeight {
    ShippableId shippableId();
}
