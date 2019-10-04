import java.util.*;
public class MethodOverload {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        String shape = new String(scan.nextLine());
        shape = shape.toLowerCase();
        
        if(shape.equals("square")) {
            
            int length = scan.nextInt();
            double area = area(length);
            System.out.println("Area: " + area);
            
        } else if(shape.equals("rectangle")) {
            
            int width = scan.nextInt();
            int height = scan.nextInt();
            double area = area(width, height);
            System.out.println("Area: " + area);
            
        } else if(shape.equals("triangle")) {
            
            double base = scan.nextDouble();
            int height = scan.nextInt();
            double area = area(base, height);
            System.out.println("Area: " + area);
            
        } else if(shape.equals("circle")) {
            
            double radius = scan.nextDouble();
            double area = area(radius);
            System.out.println("Area: " + area);
            
        } else if(shape.equals("ellipse")) {
            
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            a = a / 2;
            b = b / 2;
            double area = area(a, b);
            System.out.println("Area: " + area);
            
        } else {
            
            System.out.println("Not a valid shape!");
            
        }

        scan.close();
    }
    
    public static double area(int length) {
        
        return length * length;
    }
    
    public static double area(int width, int height) {
        
        return width * height;
    }
    
    public static double area(double base, int height) {
        
        return (0.5 * base) * height;
    }
    
    public static double area(double radius) {
        
        return Math.PI * Math.pow(radius, 2);
    }
    
    public static double area(double a, double b) {
        
        return Math.PI * a * b;
    }
}