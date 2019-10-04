import java.util.*;
public class TestPerson {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        Person [] people = new Person[3];

        for(int i = 0; i < 3; i++) {
            
            people[i] = new Person(scan.nextLine(), scan.nextLine());
            
        }
        
        System.out.println("Person 1 is called " + people[0].getName() + '\n' + "They live in " + people[0].getAddress() + '\n' + "Their PPS Number is " + people[0].getPPSNo());
        
        people[1].setName(scan.nextLine());
        people[1].setAddress(scan.nextLine());
        
        for(int i = 0; i < 3; i++){
            
            people[i].showPerson();
        }
        
        System.out.println(people[2].toString());
    }
}