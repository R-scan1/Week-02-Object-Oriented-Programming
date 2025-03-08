public class Vehicle {
    private static int registrationFee=5000;
    private String ownerName;
    private String vehicleType;
    private final int registrationNumber;
    
    Vehicle(String ownerName,String vehicleType,int registrationNumber){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        this.registrationNumber=registrationNumber;
    }
    
    void displayDetails(){
        if(this instanceof Vehicle){
        System.out.println("Owner name is "+ownerName);
        System.out.println("Vehicle Type "+vehicleType);
        System.out.println("Vehicle Registration Number is "+registrationNumber);
        System.out.println("Vehicle registration cost is "+registrationFee);
        System.out.println();
        }
        else{
            System.out.println("Vehicle not found!!!");
        }
    }

    public static void updateRegistrationFee(int updateFee){
        registrationFee=updateFee;
    }
    
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("Manish", "Petrol", 11310042);
        Vehicle vehicle2=new Vehicle("Shivam", "Diesel", 11310041);

        vehicle.displayDetails();
        Vehicle.updateRegistrationFee(1000);
        System.out.println("After updating the registration fee :");
        vehicle.displayDetails();
        vehicle2.displayDetails();
    }
    
}
