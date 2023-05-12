public class Engine {

    private FuelType FuelType;
    private double FuelLevel;
    private double FuelMax;

    /* Constructor for the Engine Class
     * @FuelType the type of fuel used
     * @FuelLevel the current fuel level of the train
     * @FuelMax the maximum fuel level the engine can have
     */
    public Engine(FuelType FuelType, double FuelLevel, double FuelMax){
        this.FuelType = FuelType;
        this.FuelLevel = FuelLevel;
        this.FuelMax = FuelMax;
    }

    /**
     * Gets the fuel type that the engine is using.
     * @return The fuel type used by the engine.
     */
    public FuelType getFuelType(){
        return this.FuelType;
    }

    /**
     * Gets the current fuel level of the engine.
     * @return The current fuel level of the engine.
     */
    public double getFuelLevel(){
        return this.FuelLevel;
    }

   /**
    * Gets the maximum fuel level the engine can have.
    * @return The maximum fuel level the engine can have.
    */
    public double getFuelMax(){
        this.FuelMax = 100;
        return this.FuelMax;
    }
    
    /**
     * Sets the current fuel level of the train to the maximum fuel level.
     * @param FuelLevel The current fuel level of the engine.
     */
    public void refuel(double FuelLevel){
        this.FuelLevel = this.FuelMax;
    }

   /**
    * Decreases the fuel level of the engine as it moves. If the fuel level is below 0, it will be reported as empty.
    * @param FuelLevel the current fuel level of the engine.
    */
    public void go(double FuelLevel){
        this.FuelLevel -= 10.0;
        if (this.FuelLevel <= 0.0){
            throw new RuntimeException(this.FuelLevel + " is below the minimum fuel level required for the engine.");
        }

        System.out.println("Remaining Fuel Level: " + this.FuelLevel);

        }
    
}