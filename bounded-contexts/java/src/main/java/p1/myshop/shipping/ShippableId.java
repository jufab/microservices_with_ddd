package p1.myshop.shipping;

public class ShippableId {
    private String id;

    public ShippableId(String id) {
        this.id = id;
    }

    public static ShippableId from(String s) {
        return new ShippableId(s);
    }
}
