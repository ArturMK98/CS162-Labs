class Car extends Vehicle {

    private boolean sportsModel; // check if the vehicle is a Sports Model or not
    
    //Write Constructors here
    public Car() {
        
        super();
        sportsModel = false;
    }
    
    public Car(int doors, String brand, boolean sportsModel) {
        
        super(doors, brand);
        this.sportsModel = sportsModel;
    }
    
    
    // Instance methods of child
    public void setSportsModel(boolean sports) {
        
        sportsModel = sports;
    }
    
    public boolean isSportsModel() {

        return sportsModel;
    }
}