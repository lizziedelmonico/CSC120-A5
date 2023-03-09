import java.util.ArrayList;

public class Train {

    private final Engine engine;
    private ArrayList<Car> CarsAttached;


    /**
     * A constructor for the parameters used in this class.
     * @param fuelType: the type of fuel used by the engine.
     * @param fuelCapacity: the maximum fuel level the engine can use.
     * @param nCars: the number of cars attached to the train.
     * @param passengerCapacity: the maximum number of passengers who can be on the train.
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine();
        this.CarsAttached = new ArrayList<Car>();
    }

    /**
     * Gets the information from the Engine class.
     * @return: The information found in the Engine class.
     */
    public Engine getEngine(){
        return this.engine;
    }

    /**
     * Counts the number of cars attached to the train.
     * @param i: an integer that represents the number of cars attached to the train.
     * @return: The number of cars attached to the train.
     */
    public Car getCar(int i){
        return CarsAttached.get(i);
    }

    /**
     * Calculates the maximum capacity of the entire train.
     * @return: the maximum capacity of the entire train.
     */
    public int getMaxCapacity(){
        return 40 * CarsAttached.size();
    }

    /**
     * Calculates the total number of available seats on the train.
     * @param i: an integer that represents the number of cars attached to the train.
     * @return: the total number of available seats on the train.
     */
    public int seatsRemaining(int i){
        int n = 0;
        for (i = 0; i < CarsAttached.size(); i++){
            n = n + ((this.getCar(i)).SeatsRemaining());
        }
        return n;

    }

    /**
     * Prints out a list of all the passengers on board.
     */
    public void printManifest(){
        for (int i = 0; i < PassengersOnBoard.size(); i++){
            this.PassengersOnBoard.get(i).printManifest();
        }

}
}
