package P02_Vehicles_Extension;

import java.text.DecimalFormat;

public class Car extends Vehicle {
    public Car(double fuelQuantity, double consumption, double capacity) {
        super(fuelQuantity, consumption, capacity);
    }

    @Override
    public void setConsumption(double consumption) {
        super.setConsumption(consumption + 0.9);
    }


    @Override
    public String drive(double distance) {
        String result = "Car needs refueling";
        DecimalFormat df = new DecimalFormat("#.##");

        if (distance * this.getConsumption() <= this.getFuelQuantity()) {
            result = String.format("Car travelled %s km", df.format(distance));
            this.setFuelQuantity(this.getFuelQuantity() - (distance * this.getConsumption()));
        }

        return result;
    }

    @Override
    public String toString() {
        return String.format("Car: %.2f", this.getFuelQuantity());
    }
}
