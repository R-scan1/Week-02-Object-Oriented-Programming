class Track{

       int itemCode;
       String itemName;
       double price;

       Track(int itemCode,String itemName,double price){
         this.itemCode=itemCode;
         this.itemName=itemName;
         this.price=price;
       }

       void display(){
         System.out.println("Item code is "+itemCode);
         System.out.println("Item name is "+itemName);
         System.out.println("Item price is "+price);
       }
}

public class TrackItem {
    public static void main(String[] args) {
        Track track=new Track(101,"Laptop",60000);
        track.display();
    }
}
