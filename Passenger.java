public class Passenger {
    
    private String name;

    /**
     * Sets the name of a specific passenger.
     * @param name: The name of the passenger.
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Adds a passenger to a specific car. 
     * @param c: A specific car on the train.
     */
    public void boardCar(Car c){
        c.addPassenger(this);
    }

    /**
     * Removes a passenger from a specific car.
     * @param c: A specific car on the train.
     */
    public void getOffCar(Car c){
        c.removePassenger(this);
    }

}
