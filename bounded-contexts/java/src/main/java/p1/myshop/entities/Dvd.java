package p1.myshop.entities;

public class Dvd implements Item {
    private ItemId itemId;
    private String ean;

    public Dvd(ItemId itemId, String ean) {
        this.itemId = itemId;
        this.ean = ean;
    }

    @Override
    public ItemId itemId() {
        return null;
    }

    @Override
    public double weight() {
        return 0;
    }

    public String getEan() {
        return ean;
    }
}
