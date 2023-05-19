import java.text.SimpleDateFormat;
import java.util.Date;

class Product<T> {
    String name;
    T harga;
    Date expiryDate;
    
    public Product(String name, T harga, Date expiryDate) {
        this.name = name;
        this.harga = harga;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }
    public T getHarga() {
        return harga;
    }
    public Date getExpiryDate() {
        return expiryDate;
    }
}

class Main2 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Product<Integer> product1 = new Product<Integer>("Doritos", 6000, new Date(123, 4, 10));
        Product<String> product2 = new Product<String>("Kit Kat", "5.000", new Date(124, 4, 22));
        Product<Double> product3 = new Product<Double>("Olatte", 10.000, new Date(125, 7, 5));

        System.out.println("Product 1 : " + product1.getName() + " - " + product1.getHarga() + " - " + product1.getExpiryDate());
        System.out.println("Product 2 : " + product2.getName() + " - " + product2.getHarga() + " - " + product2.getExpiryDate());
        System.out.println("Product 3 : " + product3.getName() + " - " + product3.getHarga() + " - " + product3.getExpiryDate());
    }
}