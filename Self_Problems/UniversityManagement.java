import java.util.ArrayList;


class Faculty {
    private String name;
    private String specialization;


    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }


    public void displayFacultyDetails() {
        System.out.println("Faculty Name: " + name + ", Specialization: " + specialization);
    }
}


class Department {
    private String departmentName;
    private ArrayList<Faculty> facultyMembers;


    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
    }


    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }


    public void displayDepartmentDetails() {
        System.out.println("\nDepartment: " + departmentName);
        System.out.println("Faculty Members:");
        for (Faculty faculty : facultyMembers) {
            faculty.displayFacultyDetails();
        }
    }
}


class University {
    private String universityName;
    private ArrayList<Department> departments;


    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }


    public void addDepartment(Department department) {
        departments.add(department);
    }


    public void displayUniversityDetails() {
        System.out.println("\nUniversity: " + universityName);
        System.out.println("Departments:");
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }
}


public class UniversityManagement {
    public static void main(String[] args) {
        Faculty faculty1 = new Faculty("Sanjay", "Computer Science");
        Faculty faculty2 = new Faculty("Rohit", "Engineering Drawing");
        Faculty faculty3 = new Faculty("Ravindra", "Chemistry");
        Faculty faculty=new Faculty("Aadi", "Expert");


        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Mathematics");
        Department dept=new Department("Expert");

        dept1.addFaculty(faculty1);
        dept2.addFaculty(faculty2);
        dept2.addFaculty(faculty3);
        dept.addFaculty(faculty);


        University university = new University("RGPV University");


        university.addDepartment(dept1);
        university.addDepartment(dept2);


        university.displayUniversityDetails();


        System.out.println("\nIndependent Faculty Members:");
        faculty.displayFacultyDetails();


    }
}
