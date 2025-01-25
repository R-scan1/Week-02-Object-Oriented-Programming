package Multilevel_Inheritance;

class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double calculateDiscountedFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discounted Fee: $" + calculateDiscountedFee());
    }
}

public class CourseHierarchy {
    public static void main(String[] args) {
        Course course = new Course("Introduction to Programming", 40);
        System.out.println("Basic Course Details:");
        course.displayCourseDetails();
        System.out.println();

        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 60, "Udemy", true);
        System.out.println("Online Course Details:");
        onlineCourse.displayCourseDetails();
        System.out.println();

        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Java", 80, "Coursera", true, 199.99, 20);
        System.out.println("Paid Online Course Details:");
        paidOnlineCourse.displayCourseDetails();
    }
}

