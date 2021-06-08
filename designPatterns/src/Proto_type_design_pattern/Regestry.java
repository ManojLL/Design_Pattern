package Proto_type_design_pattern;

import java.util.HashMap;
import java.util.Map;

public class Regestry {
    private Map<VehicleType,Vehicle> vehicleMap = new HashMap<>();

    public Regestry() {
        this.createObj();
    }

    public Vehicle getVehicle(VehicleType vehicleType) throws CloneNotSupportedException {

        return (Vehicle) vehicleMap.get(vehicleType).clone();
    }

    private void createObj() {
        Car car = new Car();
        car.setType("lux");
        car.setBrand("toyota");

        Bus bus = new Bus();
        bus.setNumberOfSeats(42);
        bus.setBrand("TATA");

        vehicleMap.put(VehicleType.CAR,car);
        vehicleMap.put(VehicleType.BUS,bus);
    }


}
