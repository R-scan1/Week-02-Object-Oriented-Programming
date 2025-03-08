public class Student {
    private static String universityName="RGPV";
    private String name;
    private final int rollNumber;
    private char grade;

    Student(String name,int rollNumber,char grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
    }

    public static void displayUniversityName(){
        System.out.println("University name is "+universityName);
        System.out.println();
    }

    void displayDetails(){
        if(this instanceof Student){
       System.out.println("Name of student is "+name);
       System.out.println("Roll Number of student is "+rollNumber);
       System.out.println("Grade of student is "+grade);
       System.out.println();
        }
        else{
            System.out.println("Student not found!!!");
        }
    }

    public static void main(String[] args) {
        Student student=new Student("Sahil", 101, 'A');
        Student student2=new Student("Maira", 102, 'B');
        
        displayUniversityName();
        student.displayDetails();
        student2.displayDetails();
    }
}
