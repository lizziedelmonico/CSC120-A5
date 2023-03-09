import java.util.ArrayList;

public class Car {

    private ArrayList<Passenger> PassengersOnBoard;
    int CarMaxCap;

   /**
    * Sets the maximum capacity for a single car. 
    * @param CarMaxCap: The maximum capacity for a single car.
    */
    public Car(int CarMaxCap){
        this.CarMaxCap = 40;
        this.PassengersOnBoard = new ArrayList<Passenger>();
    }

    /**
     * Gets the maximum capacity of a single car. 
     * @return: The maximum capacity of a single car.
     */
    public int GetCapacity(){
        return CarMaxCap;
    }

    /**
     * Calculates the remaining seats available on a single car.
     * @return: The amount of available seats on a single car.
     */
    public int SeatsRemaining(){
        return this.CarMaxCap - this.PassengersOnBoard.size();
    }

    /**
     * Adds a passenger on board a specific car.
     * @param p: The passenger who will be on board a specific car.
     */
    public void addPassenger(Passenger p){
        if (this.PassengersOnBoard.size() >= this.CarMaxCap){
            throw new RuntimeException("This car is already full.");
        }
        this.PassengersOnBoard.add(p);
    }

    /**
     * Removes a passenger from a specific car. 
     * @param p: The passenger who will be removed from the car.
     */
    public void removePassenger(Passenger p){
        if (!this.PassengersOnBoard.contains(p)){
            throw new RuntimeException(p + "is not on board");
        }
        this.PassengersOnBoard.remove(p);
    }

    /**
     * Prints out the passengers who on board a specific car. If the car has 0 passengers, it will be reported as empty.
     */
    public void printManifest(){
        if (this.PassengersOnBoard.size() == 0){
            System.out.println("This car is empty.");
        }
        System.out.println(this.PassengersOnBoard);
    }

}