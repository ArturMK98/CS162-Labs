import java.util.*;
public class TestBasicCircle {
    
    public static void main(String[] args){   
        
        Scanner scan = new Scanner(System.in);
        
        BasicCircle c = new BasicCircle();
        BasicCircle c1 = new BasicCircle(scan.nextInt());
        BasicCircle c2 = new BasicCircle(scan.nextInt());
        BasicCircle c3 = new BasicCircle(scan.nextInt());
        scan.close();
        
        System.out.println("Circle 1 has a radius of " + c1.getRadius());
        System.out.println("Circle 2 has a radius of " + c2.getRadius());
        System.out.println("Circle 3 has a radius of " + c3.getRadius());
        System.out.println("Circle 1 has a circumference of " + c1.getCircumference());
        System.out.println("Circle 2 has a circumference of " + c2.getCircumference());
        System.out.println("Circle 3 has a circumference of " + c3.getCircumference());
        System.out.println("Circle 1 has an area of " + c1.getArea());
        System.out.println("Circle 2 has an area of " + c2.getArea());
        System.out.println("Circle 3 has an area of " + c3.getArea());
        
    }
}