package com.company;

public class SportsCar extends Vehicle{

    private boolean turbo;

    public boolean getTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public SportsCar(IVehicleShowroom vehicleShowroom){
        this.VehicleShowroom = vehicleShowroom;
        this.setVehicleId(this.VehicleShowroom.getShowroomCarIndex());
        this.setModelNumber(this.VehicleShowroom.getShowroomCarIndex());
        this.setEngineType(0);
        this.setEnginePower(400);
        this.setTireSize(8);
        this.setTurbo(true);
        this.setIsSportsCar(true);
    }

    public SportsCar(IVehicleShowroom vehicleShowroom, int modelNumber, int engineType, int enginePower, int tireSize, boolean turbo)
    {
        this.VehicleShowroom = vehicleShowroom;
        this.setVehicleId(this.VehicleShowroom.getShowroomCarIndex());
        this.setModelNumber(modelNumber);
        this.setEngineType(engineType);
        this.setEnginePower(enginePower);
        this.setTireSize(tireSize);
        this.setTurbo(turbo);
        this.setIsSportsCar(true);
    }

    @Override
    public void Display() {
        String turboStatus = "No";
        if(getTurbo()){
            turboStatus = "Yes";
        }
        else{
            turboStatus = "No";
        }
        String carDetails = String.format("Sports Car:\n\tModelNumber - %d\n\tEngine Type(0: Oil, 1: Gas, 2: Diesel) - %d\n\t" +
                "Engine Power - %dHP\n\tTire Size - %d\n\tTurbo - %s\n", getModelNumber(), getEngineType(), getEnginePower(), getTireSize(), turboStatus);
        System.out.println(carDetails);
    }

}
