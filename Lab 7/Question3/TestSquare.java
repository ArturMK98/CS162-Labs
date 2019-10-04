public class TestSquare {
    
    public static void main(String args[]) {
        
        Square [] length = new Square [4];
        for(int i = 0; i < 4; i++) {
            
            length[i] = new Square();
        }
        
        length[0].setLength(10);
        length[2].setLength(10);
         
        for(int i = 0; i < 4; i++) {
            
            System.out.println("Square " + (i + 1) + " has a side length of " + length[i].getLength());
        }
        
        System.out.println("Square 1 has an area of " + length[0].getArea());
        System.out.println("Square 2 has an area of " + length[1].getArea());
        System.out.println(length[2].toString());
    }
}