class Student{
    String name;
    int rollNumber;
    double marks;

    Student(String name,int rollNumber,double marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }

    char calculateGrade(){
        if(marks>90){
            return 'A';
        }else if(marks>80){
            return 'B';
        }else if(marks>70){
            return 'C';
        }else if(marks>60){
            return 'D';
        }else if(marks>50){
            return 'E';
        }
            return 'F';
        
    } 

    void display(char grade){
        System.out.println("Name "+name);
        System.out.println("Roll Number "+rollNumber);
        System.out.println("Marks "+marks);
        System.out.println("Grade "+grade);
    }

}

public class StudentReport {
    public static void main(String[] args) {
        Student student=new Student("Rahul Singh",128,95);
        char grade=student.calculateGrade();
        student.display(grade);
    }    
}
