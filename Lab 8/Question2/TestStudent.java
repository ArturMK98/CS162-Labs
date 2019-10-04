import java.util.*;
public class TestStudent {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        Student [] students = new Student[3];
        
        for(int i = 0; i < 3; i++) {
            
            students[i] = new Student(scan.nextLine(), scan.nextLine());
        }
        
        for(int i = 0; i < 3; i++) {
            
            students[i].showStudent();
        }
        
        students[0].setCourse("CSSE");
        System.out.println("Name: " + students[0].getName() + '\n' + "Course: " + students[0].getCourse() + '\n' + "Student ID: " + students[0].getStudentID() + '\n' + "---");
        
        students[2].setName("Louise Johnson");
        System.out.println(students[2].getName());
    }
}