public class CarRental {
    public String customerName; 
    public String carModel;     
    public int rentalDays;     
    public static final double DAILY_RATE = 50.0; 

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Unknown";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        defaultRental.displayRentalDetails();

        System.out.println();

        CarRental paramRental = new CarRental("Alice", "Toyota Corolla", 5);
        paramRental.displayRentalDetails();

        System.out.println();

        CarRental copyRental = new CarRental(paramRental);
        copyRental.displayRentalDetails();
    }
}
