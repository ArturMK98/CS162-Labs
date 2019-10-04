public class TestEmployee {
    
    public static void main(String args[]) {
        
        int num1 = 1;
        String n1 = "Tom Daly";
        String j1 = "Teacher";
        float s1 = 45000f;
        int i1 = 1001;

        int num2 = 2;
        String n2 = "Mary Murphy";
        String j2 = "Developer";
        float s2 = 30000f;
        int i2 = 1002;
        
        Employee e1 = new Employee(n1, j1, s1, i1);
        Employee e2 = new Employee(n2, j2, s2, i2);
        Employee e3 = new Employee();
        
        System.out.println("Employee " + num2 + " is called " + e2.getName() + '\n' + "They are a " + e2.getJobTitle() + '\n' + "Their salary is " + e2.getSalary() + '\n' + "Their Employee ID number is " + e2.getEmployeeId());
        
        e3.setName("Michael Higgins");
        e3.setJobTitle("President");
        e3.setSalary(1000f);
        
        e1.showEmp();
        e2.showEmp();
        e3.showEmp();
        
        System.out.println(e1.toString());
    }
}
