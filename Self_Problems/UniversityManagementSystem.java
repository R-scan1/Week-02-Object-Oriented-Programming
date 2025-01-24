import java.util.ArrayList;
import java.util.List;
class Professor{
    private String professorName;
    private Course assignedCourse;


    public Professor(String professorName){
        this.professorName = professorName;
    }    public void displayProfessor(){
        System.out.println("Professor name - " + professorName);
        assignedCourse.displayCourse();
    }
    public String getName(){
        return professorName;
    }
}
class Course {
    private String courseName;
    private Professor professor;
    private List<Student> studentsList;


    public Course(String courseName) {
        this.courseName = courseName;
        this.studentsList = new ArrayList<>();
    }


    public void addStudent(Student student) {
        studentsList.add(student);
    }


    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }


    public void displayStudentDetails() {
        this.displayCourse();
        for (Student student : studentsList) {
            student.displayStudent();
        }
    }
    public void displayCourse() {
        System.out.println("\ncourse name - " + courseName +
                "\ncourse professor - " + professor.getName());
    }
}
class Student {
    private String studentName;
    private int rollNumber;
    private List<Course> coursesList;


    public Student(String studentName, int rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        coursesList = new ArrayList<>();
    }


    public void displayStudent() {
        System.out.println("Student name - " + studentName +
                "\nStudent roll number - " + rollNumber);
    }


    public void displayCourseDetails() {
        this.displayStudent();
        for (Course course : coursesList) {
            course.displayCourse();
        }
    }
    public void enrollCourse(Course course){
        coursesList.add(course);
    }
}
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor rajProfessor = new Professor("Dr. Vivek Sharma");
        Professor manishProfessor = new Professor("Dr. Manish Patel");
        Professor arpitaProfessor = new Professor("Dr. Arpita Goutam");




        Course physicsCourse = new Course("Physics");
        Course dsaCourse = new Course("Data Structure");
        Course tocCourse = new Course("Theory of computation");


        Student akashStudent = new Student("Akash Dhakad", 12);
        Student adityaStudent = new Student("Aditya Singh", 8);
        Student preetamStudent = new Student("Preetam Deshmukh", 40);


        tocCourse.assignProfessor(rajProfessor);
        dsaCourse.assignProfessor(manishProfessor);
        physicsCourse.assignProfessor(arpitaProfessor);


        akashStudent.enrollCourse(tocCourse);
        adityaStudent.enrollCourse(dsaCourse);
        preetamStudent.enrollCourse(physicsCourse);
       
   
        tocCourse.addStudent(akashStudent);
        dsaCourse.addStudent(adityaStudent);
        physicsCourse.addStudent(preetamStudent);
       
       
        tocCourse.displayStudentDetails();
        dsaCourse.displayStudentDetails();
        physicsCourse.displayStudentDetails();
    }
}
