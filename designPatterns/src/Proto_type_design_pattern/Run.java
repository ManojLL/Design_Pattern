package Proto_type_design_pattern;

public class Run {
    public static void main(String[] args) throws CloneNotSupportedException {
        Regestry regestry = new Regestry();
        Car car = (Car) regestry.getVehicle(VehicleType.CAR);
        System.out.println(car.getType());
        car.setType("mini");
        System.out.println(car.getType());

        Car car1 = (Car) regestry.getVehicle(VehicleType.CAR);
        System.out.println(car1.getType());
    }
}
