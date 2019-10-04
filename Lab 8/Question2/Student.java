public class Student {
    
    private String name;
    private String course;
    private int studentID;
    
    private static int counter = 1001;
    
    public Student() {
        
        setName("");
        setCourse("");
        studentID = counter++;
    }
    
    public Student(String studentName, String studentCourse) {
        
        name = studentName;
        course = studentCourse;
        studentID = counter++;
    }
    
    public String getName() {
        
        return name;
    }
    
    public void setName(String studentName) {
        
        name = studentName;
    }
    
    public String getCourse() {
        
        return course;
    }
    
    public void setCourse(String studentCourse) {
        
        course = studentCourse;
    }
    
    public int getStudentID() {
        
        return studentID;
    }
    
    public void showStudent() {
        
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Student ID: " + studentID);
        System.out.println("---");
    }
}