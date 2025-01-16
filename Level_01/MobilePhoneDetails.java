class MobilePhone{
    String brand;
    String model;
    double price;
    MobilePhone(String brand,String model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    void display(){
        System.out.println("Mobile brand "+brand);
        System.out.println("Model "+model);
        System.out.println("Price "+price);
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {
        MobilePhone mobilePhone=new MobilePhone("Samsung","S 24 Ultra",150000);
        mobilePhone.display();
    }
}
