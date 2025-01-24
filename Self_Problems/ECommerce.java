import java.util.List;
import java.util.ArrayList;

class Product {
    private String productName;
    private double price;


    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }


    public void displayProduct() {
        System.out.println("Product name - " + productName +
                "\nproduct price- " + price);
    }
}
class Order {
    private int orderId;
    private List<Product> productList;


    public Order(int orderId) {
        this.orderId = orderId;
        productList = new ArrayList<>();
    }


    public void addProduct(Product product) {
        productList.add(product);
    }


    public void displayOrder() {
        System.out.println("\nOrder id - " + orderId +
                "\nAll products - ");
        for (Product product : productList) {
            product.displayProduct();
        }


    }
}
class Customer {
    private String customerName;
    private Order order;


    public Customer(String customerName, Order order) {
        this.customerName = customerName;
        this.order = order;
    }


    public void displayCustomer() {
        System.out.println("\nCustomer name - " + customerName);
        order.displayOrder();
    }
}


public class ECommerce {
    public static void main(String[] args) {
        Product product1 = new Product("SmartPhone", 55000);
        Product product2 = new Product("Television", 60000);


        Order order = new Order(106);
        order.addProduct(product1);
        order.addProduct(product2);


        Customer customer = new Customer("Viraj", order);
        customer.displayCustomer();
    }
}
