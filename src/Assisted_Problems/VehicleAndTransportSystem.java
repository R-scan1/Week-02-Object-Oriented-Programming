package Assisted_Problems;

class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void vehicleBrand() {
        System.out.println("Brand Name of the vehicle!!!");
    }

    void displayInfo(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].vehicleBrand();
            System.out.println("Max speed is: " + vehicles[i].maxSpeed + " KM/HR");
            System.out.println("Fuel type is: " + vehicles[i].fuelType);
            System.out.println();
        }
    }
}

class Car extends Vehicle {
    int seatCapacity;
    String brandName;

    Car(String brandName, int seatCapacity, int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
        this.brandName = brandName;
        this.seatCapacity = seatCapacity;
    }

    @Override
    void vehicleBrand() {
        System.out.println("The brand of this car is: " + brandName);
        System.out.println("Seat capacity for this car is: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    double loadCapacity;
    String brandName;

    Truck(double loadCapacity, String brandName, int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
        this.brandName = brandName;
    }

    @Override
    void vehicleBrand() {
        System.out.println("The brand of this truck is: " + brandName);
        System.out.println("Load capacity for this truck is: " + loadCapacity + " TON");
    }
}

class Motorcycle extends Vehicle {
    String brandName;
    String bikeType;

    Motorcycle(String bikeType, String brandName, int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
        this.brandName = brandName;
        this.bikeType = bikeType;
    }

    @Override
    void vehicleBrand() {
        System.out.println("The brand of this bike is: " + brandName);
        System.out.println("This bike is a: " + bikeType);
    }
}

public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("Chevrolet", 4, 300, "Petrol");
        vehicles[1] = new Truck(2, "Ashok Leyland", 150, "Diesel");
        vehicles[2] = new Motorcycle("Sports", "Kawasaki Ninja", 400, "Petrol");

        vehicles[0].displayInfo(vehicles);
    }
}

