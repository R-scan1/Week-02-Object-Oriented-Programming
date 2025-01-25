package Single_Inheritance;

class Devices{
    String device_ID;
    String status;

    Devices(String device_ID, String status){
     this.device_ID=device_ID;
     this.status=status;
    }

    void functionality(){
        System.out.println("What does device do!!!");
    }

    void displayDetails(){
        System.out.println("Device ID: "+device_ID);
        System.out.println("Device status: "+status);
    }
}

class Thermostat extends Devices{
    double temperatureSetting;
    Thermostat(double temperatureSetting,String device_ID,String status){
        super(device_ID,status);
        this.temperatureSetting=temperatureSetting;
    }
    @Override
    void functionality() {
        System.out.println("Thermostat regulates temperature!\n");

    }
}


public class SmartHomeDevices {
    public static void main(String[] args) {
        Thermostat thermostat=new Thermostat(48.2,"AED2044","ON");
        thermostat.displayDetails();
        thermostat.functionality();

        Thermostat thermostat2=new Thermostat(35.2,"AED2023","OFF");
        thermostat2.displayDetails();
        thermostat2.functionality();
    }
}
