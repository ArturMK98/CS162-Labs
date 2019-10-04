public class SUV extends Vehicle {
    
    private String wheelDrive; // states whether SUV is 4, front, or rear wheel drive
    
    public SUV() {

        super();
        wheelDrive="front";
    }
    
    public SUV(int doors, String brand, String wheelDrive) {
        
        super(doors, brand);
        this.wheelDrive = wheelDrive;
        
    }
    
    public String getDrive() {
        
        return wheelDrive;
    }
    
    public void setDrive(String drive) {
        
        wheelDrive = drive;
    }
}