public class Square {
    
    private int length;
    
    public Square() {
        
        length = 1;
    }
    
    public Square(int l) {
        
        length = l;
    }
    
    public void setLength(int l) {
        
        length = l;
    }
    
    public int getLength() {
        
        return length;
    }
    
    public int getArea() {
        
        return length * length;
    }
    
    public String toString() {
        
        return "LENGTH: " + length;
    }
}