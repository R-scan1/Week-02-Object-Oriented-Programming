class Employee{
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displayDetails(){
        System.out.println("Your name is "+name);
        System.out.println("Your id is "+id);
        System.out.println("Your salary is "+salary);
    } 
}
    
public class EmployeeDetail{    
    public static void main(String[] args) {
        Employee ed=new Employee("Manish",13 , 10000);
        ed.displayDetails();
    }
}