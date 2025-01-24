import java.util.ArrayList;


class Employee {
    private String name;
    private String designation;


    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }


    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name + ", Designation: " + designation);
    }
}


class Department {
    private String departmentName;
    private ArrayList<Employee> employees;


    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }


    public void addEmployee(String name, String designation) {
        employees.add(new Employee(name, designation));
    }


    public void displayDepartmentDetails() {
        System.out.println("\nDepartment: " + departmentName);
        System.out.println("Employees:-");
        for (Employee employee : employees) {
            employee.displayEmployeeDetails();
        }
    }
}


class Company {
    private String companyName;
    private ArrayList<Department> departments;


    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }


    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }


    public Department getDepartment(int index) {
        return departments.get(index);
    }


    public void displayCompanyDetails() {
        System.out.println("\nCompany: " + companyName);
        System.out.println("Departments:");
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }
}


class DepartmentManagement {
    public static void main(String[] args) {
        Company company = new Company("TIT");

        
        company.addDepartment("AI&DS");
        company.addDepartment("CSE");


        company.getDepartment(0).addEmployee("Manish", "Senior Executive");
        company.getDepartment(0).addEmployee("Arpita", "Automation Engineer");
        company.getDepartment(1).addEmployee("Dhakad", "Tester");


        company.displayCompanyDetails();


        company = null;
           }
}
