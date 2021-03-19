package com.company;

public class HeavyVehicle extends Vehicle{
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public HeavyVehicle(IVehicleShowroom vehicleShowroom){
        this.VehicleShowroom = vehicleShowroom;
        this.setVehicleId(this.VehicleShowroom.getShowroomCarIndex());
        this.setModelNumber(this.VehicleShowroom.getShowroomCarIndex());
        this.setEngineType(0);
        this.setEnginePower(400);
        this.setTireSize(8);
        this.setWeight(1600);
        this.setIsSportsCar(false);
    }

    public HeavyVehicle(IVehicleShowroom vehicleShowroom, int modelNumber, int engineType, int enginePower, int tireSize, int weight){
        this.VehicleShowroom = vehicleShowroom;
        this.setVehicleId(this.VehicleShowroom.getShowroomCarIndex());
        this.setModelNumber(modelNumber);
        this.setEngineType(engineType);
        this.setEnginePower(enginePower);
        this.setTireSize(tireSize);
        this.setWeight(weight);
        this.setIsSportsCar(false);
    }

    @Override
    public void Display() {
        String carDetails = String.format("Heavy vehicle:\n\tModelNumber - %d\n\tEngine Type(0: Oil, 1: Gas, 2: Diesel) - %d\n\t" +
                "Engine Power - %dHP\n\tTire Size - %d\n\tWeight - %dKg\n", getModelNumber(), getEngineType(), getEnginePower(), getTireSize(), getWeight());
        System.out.println(carDetails);
    }
}
