package Proto_type_design_pattern;

public class Bus extends Vehicle  {
    private int numberOfSeats;

    public Bus() {
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
