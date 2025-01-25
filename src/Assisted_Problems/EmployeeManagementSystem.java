package Assisted_Problems;

class  Employee{
    String name;
    String id;
    double salary;

    Employee(String name,String id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    void task(){
        System.out.println("Every employee has different tasks!!!");
    }

    void displayDetails(){
        System.out.println("Employee name is: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Salary: "+salary);
    }

}

class Manager extends Employee{
    int teamSize;
    Manager(int teamSize,String name,String id,double salary){
        super(name,id,salary);
        this.teamSize=teamSize;
    }
    @Override
    void task(){
        System.out.println(name+" manages the team!!!");
        System.out.println(name+"'s team size is: "+teamSize);
        System.out.println();
    }
}

class Developer extends Employee{
    String programmingLanguage;

    Developer(String programmingLanguage,String name,String id,double salary){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }
    @Override
    void task(){
        System.out.println(name+" develops applications!!!");
        System.out.println(name+"'s programming language is "+programmingLanguage);
        System.out.println();
    }
}

class Intern extends Employee{
    int duration;
    Intern(int duration,String name,String id,double salary){
        super( name, id, salary);
        this.duration=duration;
    }

    void task(){
        System.out.println(name+" is here for a short time!!!");
        System.out.println(name+"'s duration here is "+duration+" months");
        System.out.println();
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager manager=new Manager(15, "Manish Patel", "M101", 180000);
        Developer developer=new Developer("Java", "Raj Chandanan", "D101", 80000);
        Intern intern=new Intern(3,"Arpita Gautam","I101",0);

        manager.displayDetails();
        manager.task();
        developer.displayDetails();
        developer.task();
        intern.displayDetails();
        intern.task();
    }
}

