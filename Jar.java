public class Jar {
    private String itemName;
    private int maxItems;

    public Jar(String itemName, int maxItems) {
        this.itemName = itemName;
        this.maxItems = maxItems;
    }

    public String getItemName() {
        return itemName;
    }

    public int getMaxItems() {
        return maxItems;
    }
}