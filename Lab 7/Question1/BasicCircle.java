public class BasicCircle {
    
    private int radius;
    
    public BasicCircle() {
        
        radius = 1;
    }
    
    public BasicCircle(int r) {
        
        radius = r;
    }
    
    public int getRadius() {
        
       return radius;
    }
    
    public double getCircumference() {
        
        return Math.round((2 * (Math.PI * radius)) * 100.0) / 100.0;
    }
    
    public double getArea() {
        
        return  Math.round((Math.PI * (radius * radius)) * 100.0) / 100.0;
    }
}