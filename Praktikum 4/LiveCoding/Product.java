package LiveCoding;

public class Product {
    private String name;
    private String category;
    private double price;
    private int stock;
    private boolean isAvailable;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void displayInfo() {
        System.out.println("Product name : " + name);
        System.out.println("Category : " + category);
        System.out.println("Price : " + price);
        System.out.println("Stock : " + stock);
        System.out.println("Is available : " + isAvailable);
    }
}