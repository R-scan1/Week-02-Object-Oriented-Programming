import java.util.ArrayList;
import java.util.List;


class Student {
    private String name;
    private String rollNumber;
    private ArrayList<Course> courseList;


    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.courseList = new ArrayList<>();
    }


    public List<Course> getCourses() {
        return courseList;
    }


    public void addCourse(Course course) {
        this.courseList.add(course);
    }


    public void displayStudent() {
        System.out.println("Student name - " + name + "\nRoll number - " + rollNumber+"\n");
    }
}


class Course {
    private String courseName;
    private List<Student> enrolledStudents;


    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }


    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        student.addCourse(this);
    }


    public void displayCourse() {
        System.out.println("Course name - " + courseName);
        System.out.println("Enrolled students:");
        for (Student student : enrolledStudents) {
            student.displayStudent();
        }
    }
}


class School {
    private String schoolName;
    private List<Student> studentList;


    public School(String schoolName) {
        this.schoolName = schoolName;
        this.studentList = new ArrayList<>();
    }
    
    public void addStudent(Student student, Course course) {
        studentList.add(student);
        course.enrollStudent(student);
    }

    public void displaySchoolName(){
        System.out.println("School Name: "+schoolName+"\n");
    }
}


public class SchoolManagementSystem {
    public static void main(String[] args) {
        School school = new School("Gurukul School");
       
        Course course1 = new Course("Physics");
        Course course2 = new Course("Chemistry");
        Course course3 = new Course("Mathematics");
       
        Student student1 = new Student("Manish", "27");
        Student student2 = new Student("Preetam", "42");


        school.addStudent(student1, course1);
        school.addStudent(student1, course2);
        school.addStudent(student2, course3);

        school.displaySchoolName();
        course1.displayCourse();
        course2.displayCourse();
        course3.displayCourse();
    }
}
