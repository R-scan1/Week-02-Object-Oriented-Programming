public class Patient {
    private static final String hospitalName="Apollo";
    private static int count=0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;
    
    Patient(int patientID,String name,int age,String ailment){
         this.patientID=patientID;
         this.name=name;
         this.age=age;
         this.ailment=ailment;
         count++;
    }

    public static void getTotalPatients(){
         System.out.println("Hospital Name "+hospitalName);
         System.out.println("Total number of patients is "+count);
         System.out.println();
    }

    public void displayDetails(){
        System.out.println("Patient ID "+patientID);
        System.out.println("Patient name "+name);
        System.out.println("Patient age "+age);
        System.out.println("Ailment : "+ailment);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Patient patient=new Patient(101,"Sharad",25, "Dengue");
        Patient patient2=new Patient(102, "Jarvis", 19, "Viral Fever");
        
        Patient.getTotalPatients();
        patient.displayDetails();
        patient2.displayDetails();
    }
    
}
