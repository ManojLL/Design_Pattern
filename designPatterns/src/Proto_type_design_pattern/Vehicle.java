package Proto_type_design_pattern;

public abstract class Vehicle implements Cloneable {
    private String brand;

    public Vehicle() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
