import java.util.ArrayList;
import java.util.List;


class Product {
    private int productId;
    private String productName;
    private double price;


    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }


    public int getProductId() {
        return productId;
    }


    public String getProductName() {
        return productName;
    }


    public double getPrice() {
        return price;
    }


    public String getProductDetails() {
        return "Product ID: " + productId + ", Name: " + productName + ", Price: $" + price;
    }


    public String toString() {
        return productName + " ($" + price + ")";
    }
}


class Customer {
    private int customerId;
    private String customerName;
    private List<Product> products;


    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.products = new ArrayList<>();
    }


    public void addProduct(Product product) {
        products.add(product);
    }


    public int getCustomerId() {
        return customerId;
    }


    public String getCustomerName() {
        return customerName;
    }


    public List<Product> getProducts() {
        return products;
    }


    public String getCustomerDetails() {
        return "Customer ID: " + customerId + ", Name: " + customerName;
    }


    public String toString() {
        return customerName + " (ID: " + customerId + ")";
    }
}


class BillGenerator {
    public double calculateTotal(Customer customer) {
        double total = 0.0;
        for (Product product : customer.getProducts()) {
            total += product.getPrice();
        }
        return total;
    }


    public String generateBill(Customer customer) {
        StringBuilder billDetails = new StringBuilder();
        billDetails.append("Customer: ").append(customer.getCustomerDetails()).append("\n");
        billDetails.append("Purchased Products:\n");


        for (Product product : customer.getProducts()) {
            billDetails.append("  - ").append(product.getProductDetails()).append("\n");
        }


        double total = calculateTotal(customer);
        billDetails.append("Total Bill: $").append(String.format("%.2f", total));
        return billDetails.toString();
    }
}


public class GroceryStoreMain {
    public static void main(String[] args) {
        Product butter = new Product(1, "Butter (250 gram)", 7.0); 
        Product walnut = new Product(2, "Walnut (200 gram)", 6.0);


        Customer customer = new Customer(101, "Manish");
        customer.addProduct(butter);
        customer.addProduct(walnut);


        BillGenerator billGenerator = new BillGenerator();
        System.out.println(billGenerator.generateBill(customer));
    }
}
