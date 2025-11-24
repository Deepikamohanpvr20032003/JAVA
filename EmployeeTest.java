//Create an Employee class that encapsulates the following fields:
   // Name (String)
    //ID number (integer)
    //Department (String)
     //Salary (double)
//Ensure all fields are private to prevent direct access or modification.
//Provide public getter and setter methods for each field (name, ID, department, salary) to allow controlled access and modification.
//Create a test class named EmployeeTest with a main() method that:
//Creates two Employee objects.
    //Uses setter methods to assign values for name, ID, department, and salary for each employee.
    // Displays the details of both employees using getter methods only, not by accessing fields directly.

class Employee{  
   private String name;
   private int idno;
   private double salary;
   private String department;

   public String getname() {
        return name;
    }
    public int getidno() {
        return idno;
    }
    public double getsalary() {
        return salary;
    }
    public String getdepartment() {
        return department;   
}  
    public void setname(String name) {
        this.name = name;
    }
    public void setidno(int idno) {
        this.idno = idno;
    }
    public void setsalary(double salary) {
        this.salary = salary;
    }
    public void setdepartment(String department) {
        this.department = department;
    }
}
    
public class EmployeeTest{
   public static void main(String args[]){  
	Employee obj1 = new Employee();
    Employee obj2 = new Employee(); 

    obj1.setname("Deepika");
    obj1.setidno(101); 
    obj1.setdepartment("IT");
    obj1.setsalary(45000.50);

    obj2.setname("Aishwarya");
    obj2.setidno(102);          
    obj2.setdepartment("HR");
    obj2.setsalary(55000.75);
    
    System.out.println("Name: " + obj1.getname());  
    System.out.println("ID No: " + obj1.getidno()); 
    System.out.println("salary:"+ obj1.getsalary());
    System.out.println("Department: " + obj1.getdepartment());  
    
    System.out.println("Name: " + obj2.getname());
    System.out.println("ID No: " + obj2.getidno());
    System.out.println("salary:"+ obj2.getsalary());
    System.out.println("Department: " + obj2.getdepartment());  
   }  
}