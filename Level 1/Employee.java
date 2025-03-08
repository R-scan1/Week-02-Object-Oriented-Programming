public class Employee {
    
    private static String companyName="Capgemini";
    private static int count=0;
    private String name;
    private final int id;
    private String designation;

    Employee(String name, int id, String designation){
       this.name=name;
       this.id=id;
       this.designation=designation;
       count++;
    }

    public static void displayTotalEmployees(){
        System.out.println("Company Name is "+companyName);
        System.out.println("Total number of employees "+count);
        System.out.println();
    }

    public void displayEmployeeDetails(){
        if(this instanceof Employee){
        System.out.println("Employee name is "+name);
        System.out.println("Employee id is "+id);
        System.out.println("Emplyee designation is "+designation);
        System.out.println();
        }
        else{
            System.out.println("Employee not found!!!");
        }
    }
   public static void main(String[] args) {
    Employee employee=new Employee("Manish", 101, "Senior Software Developer");
    Employee employee2=new Employee("Arpita", 102,"Senior Automation Engineer");

    displayTotalEmployees();
    employee.displayEmployeeDetails();
    employee2.displayEmployeeDetails();
   }
    
}
