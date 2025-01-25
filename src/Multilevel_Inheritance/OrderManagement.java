package Multilevel_Inheritance;

class Order {
    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-01-20");
        System.out.println("Order Status: " + order.getOrderStatus());
        order.displayOrderDetails();
        System.out.println();

        ShippedOrder shippedOrder = new ShippedOrder(102, "2025-01-21", "TRK12345");
        System.out.println("Order Status: " + shippedOrder.getOrderStatus());
        shippedOrder.displayOrderDetails();
        System.out.println();

        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-01-22", "TRK67890", "2025-01-23");
        System.out.println("Order Status: " + deliveredOrder.getOrderStatus());
        deliveredOrder.displayOrderDetails();
    }
}

