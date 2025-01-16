class CartItem{
    String itemName;
     int quantity;

    CartItem(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }
    void addToCart(int quantity) {
        this.quantity += quantity;
    }
    void removeFromCart(int quantity) {
        if(this.quantity >= quantity) {
            this.quantity -= quantity;
        }
        else {
            System.out.println("Insufficient Quantity");
        }
    }
    void display() {
        System.out.println("Item Name: "+itemName);
        System.out.println("Quantity: "+quantity);
    }
}
public class ShoppingCart {
    public static void main(String[] args) {
        CartItem cartItem = new CartItem("SmartPhone", 2);
        cartItem.display();
        cartItem.addToCart(6);
        cartItem.display();
        cartItem.removeFromCart(2);
        cartItem.display();
        cartItem.removeFromCart(8);
        cartItem.display();
    }
}
