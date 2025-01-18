public class Course {
    private String courseName;    
    private int duration;         
    private double fee;         
    private static String instituteName = "Global Academy"; 

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 8, 300.00);
        Course course2 = new Course("Web Development", 12, 450.00);
        Course course3 = new Course("Data Science", 10, 500.00);

        System.out.println("Before updating the institute name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();
        course3.displayCourseDetails();
        System.out.println();

        Course.updateInstituteName("Tech Learning Hub");

        System.out.println("After updating the institute name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();
        course3.displayCourseDetails();
    }
}
