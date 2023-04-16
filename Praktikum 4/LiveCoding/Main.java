package LiveCoding;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Samsung Galaxy A23");
        product1.setCategory("Smartphone");
        product1.setPrice(3300000);
        product1.setStock(5);
        product1.setIsAvailable(true);

        product1.displayInfo();
        Utils.displaySelfData();
    }
}
