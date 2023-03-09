public class Engine {

    private FuelType fuelType;
    double FuelLevel;
    double FuelMax;

    /**
     * Gets the fuel type that the engine is using.
     * @return: The fuel type used by the engine.
     */
    public FuelType getFuelType(){
        FuelType a = FuelType.STEAM;
        FuelType b = FuelType.INTERNAL_COMBUSTION;
        FuelType c = FuelType.ELECTRIC;
        FuelType d = FuelType.OTHER;
        return this.fuelType;
    }
  
    /**
     * Gets the current fuel level of the engine.
     * @return: The current fuel level of the engine.
     */
    public double getFuelLevel(){
        return this.FuelLevel;
    }

   /**
    * Gets the maximum fuel level the engine can have.
    * @return: The maximum fuel level the engine can have.
    */
    public double getFuelMax(){
        this.FuelMax = 100;
        return this.FuelMax;
    }

    /**
     * Constructor for the parameters used in the engine.
     * @param fuelType: the type of fuel the engine is using.
     * @param FuelLevel: the current fuel level of the engine.
     * @param FuelMax: the maximum fuel level the engine can have.
     */
    public void SetFuel(FuelType fuelType, double FuelLevel, double FuelMax){
        this.fuelType = fuelType;
        this.FuelLevel = FuelLevel;
        this.FuelMax = FuelMax;
    }
    
    /**
     * Sets the current fuel level of the train to the maximum fuel level.
     * @param FuelLevel: The current fuel level of the engine.
     */
    public void refuel(double FuelLevel){
        this.FuelLevel = this.FuelMax;
    }

   /**
    * Decreases the fuel level of the engine as it moves. If the fuel level is below 0, it will be reported as empty.
    * @param FuelLevel: the current fuel level of the engine.
    */
    public void go(double FuelLevel){
        this.FuelLevel -= 10.0;
        if (this.FuelLevel <= 0.0){
            System.out.println("Fuel is empty.");
        }

        System.out.println("Remaining Fuel Level: " + this.FuelLevel);

        }
    
}