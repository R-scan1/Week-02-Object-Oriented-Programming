public class Vehicle {
    private String ownerName;        
    private String vehicleType;      
    private static double registrationFee = 100.0; 

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        if (newFee > 0) { 
            registrationFee = newFee;
        } else {
            System.out.println("Invalid registration fee! It must be greater than 0.");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Alice", "Car");
        Vehicle vehicle2 = new Vehicle("Bob", "Bike");
        Vehicle vehicle3 = new Vehicle("Charlie", "Truck");

        System.out.println("Before updating the registration fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        System.out.println();
        vehicle3.displayVehicleDetails();
        System.out.println();

        Vehicle.updateRegistrationFee(150.0);

        System.out.println("After updating the registration fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        System.out.println();
        vehicle3.displayVehicleDetails();
    }
}
