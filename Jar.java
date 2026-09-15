import java.util.Random;


public class Jar {
    private String itemName;
    private int maxItems;
    private int currentItems;

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

    public void fill() {
    Random random = new Random();
    int randomNumber = random.nextInt(maxItems) + 1;
    currentItems = randomNumber;
    }

    public int getCurrentItems() {
        return currentItems;
    }
}