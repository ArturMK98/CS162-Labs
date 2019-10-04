public class Employee {
    
    private String name;
    private String jobTitle;
    private float salary;
    private int employeeID;
    
    public Employee() {
        
        name = "Tom Murphy";
        jobTitle = "Pilot";
        salary = 20000;
        employeeID = 1003;
    }
    
    public Employee(String n, String jt, float s, int eid) {
        
        name = n;
        jobTitle = jt;
        salary = s;
        employeeID = eid;
    }
    
    public void setName(String name) {
        
        this.name = name;
    }
    
    public String getName() {
        
        return name;
    }
    
    public void setJobTitle(String job) {
        
        jobTitle = job;
    }
    
    public String getJobTitle() {
        
        return jobTitle;
    }
    
    public void setSalary(float s) {
        
        if(s < 19000f) {

            System.out.println("Entered salary of " + s + " is too low. Salary set at minimum wage of 19000.0");
            salary = 19000f;
        }
    }
    
    public float getSalary() {
        
        return salary;
    }
    
    public int getEmployeeId() {
        
        return employeeID;
    }
    
    public void showEmp() {
            
        System.out.println("EMPLOYEE RECORD");
        System.out.println("NAME: " + name);
        System.out.println("JOB TITLE: " + jobTitle);
        System.out.println("CURRENT SALARY: " + salary);
        System.out.println("EMPLOYEE ID: " + employeeID);
    }
    
    public String toString() {
        
        return "NAME: " + name + '\n' + "JOB TITLE: " + jobTitle + '\n' + "CURRENT SALARY: " + salary + '\n' + "EMPLOYEE ID: " + employeeID;
    }
}