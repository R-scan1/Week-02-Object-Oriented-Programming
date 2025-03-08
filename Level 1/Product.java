public class Product {
    private static double discount=5;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;
    private double totalPrice=0.0;
    
    Product(int productID,String productName,double price,int quantity){
          this.productID=productID;
          this.productName=productName;
          this.price=price;
          this.quantity=quantity;
    }

        void displayTotal(){
          totalPrice=(price-(price/100)*discount)*quantity;
          System.out.println("Total amount after "+discount+" % discount is "+totalPrice);
          System.out.println();
     }

    void displayDetails(){
        if(this instanceof Product){
        System.out.println("Product ID "+productID);
        System.out.println("Product Name "+productName);
        System.out.println("Product price "+price);
        System.out.println("Product Quantity "+quantity);
        }
        else{
            System.out.println("Product not found!!!");
        }
    }

    public static void updateDiscount(double newDiscount){
          discount=newDiscount;
    }
    
    public static void main(String[] args) {
        Product product=new Product(101, "SmartPhone", 50000, 10);
        Product product2=new Product(102, "SmartWatch", 4000, 20);

        product.displayDetails();
        product.displayTotal();
        updateDiscount(10);
        product.displayDetails();
        product.displayTotal();

        product2.displayDetails();
        product2.displayTotal();
        updateDiscount(15);
        product2.displayDetails();
        product2.displayTotal();
    }
    
}
