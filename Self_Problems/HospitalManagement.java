import java.util.ArrayList;
import java.util.List;
class Doctor {
    private String name;
    private List<Patient> patients;


    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }


    public String getName() {
        return name;
    }


    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println("Doctor " + name + " is consulting with Patient " + patient.getName() + ".");
        patient.addDoctor(this);
    }


    public List<Patient> getPatients() {
        return patients;
    }
}


class Patient {
    private String name;
    private List<Doctor> doctors;


    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }


    public String getName() {
        return name;
    }


    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }


    public List<Doctor> getDoctors() {
        return doctors;
    }
}


class Hospital {
    private List<Doctor> doctors;
    private List<Patient> patients;


    public Hospital() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }


    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }


    public void addPatient(Patient patient) {
        patients.add(patient);
    }


    public List<Doctor> getDoctors() {
        return doctors;
    }


    public List<Patient> getPatients() {
        return patients;
    }


    public void displayConsultations() {
        for (Doctor doctor : doctors) {
            for (Patient patient : doctor.getPatients()) {
                System.out.println("Doctor " + doctor.getName() + " has consulted with Patient " + patient.getName());
            }
        }
    }
}
public class HospitalManagement {
    public static void main(String[] args) {
       
        Doctor doctor1 = new Doctor("Manish");
        Doctor doctor2 = new Doctor("Arpita");


        Patient patient1 = new Patient("Raj");
        Patient patient2 = new Patient("Rahul");


        Hospital hospital = new Hospital();
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);


        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient2);


        hospital.displayConsultations();
    }
}
