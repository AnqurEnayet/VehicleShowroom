package com.company;

import java.util.Scanner;

public class NormalVehicle extends Vehicle {

    public NormalVehicle(IVehicleShowroom vehicleShowroom)
    {
        this.VehicleShowroom = vehicleShowroom;
        this.setVehicleId(this.VehicleShowroom.getShowroomCarIndex());
        this.setModelNumber(this.VehicleShowroom.getShowroomCarIndex());
        this.setEngineType(0);
        this.setEnginePower(120);
        this.setTireSize(8);
        this.setIsSportsCar(false);
    }

    public NormalVehicle(IVehicleShowroom vehicleShowroom, int modelNumber, int engineType, int enginePower, int tireSize)
    {
        this.VehicleShowroom = vehicleShowroom;
        this.setVehicleId(this.VehicleShowroom.getShowroomCarIndex());
        this.setEngineType(engineType);
        this.setEnginePower((enginePower));
        this.setTireSize(tireSize);
        this.setIsSportsCar(false);
    }

    public NormalVehicle GetNormalVehicle(IVehicleShowroom vehicleShowroom)
    {
        Scanner scan = new Scanner(System.in);
        NormalVehicle newNormalVehicle = new NormalVehicle(vehicleShowroom);

        String displayText = String.format("\nEnter Model Number(Integer):\t");
        System.out.print(displayText);
        int modelNumber = scan.nextInt();
        newNormalVehicle.setModelNumber(modelNumber);

        displayText = String.format("\nEnter Engine Type(0: Oil, 1: Gas, 2: Diesel):\t");
        System.out.print(displayText);
        int engineType = scan.nextInt();
        newNormalVehicle.setEngineType(engineType);

        displayText = String.format("\nEnter Engine Power(Interger):\t");
        System.out.print(displayText);
        int enginePower = scan.nextInt();
        newNormalVehicle.setEngineType(enginePower);

        displayText = String.format("\nEnter Tire Size(Integer:\t");
        System.out.print(displayText);
        int tireSize = scan.nextInt();
        newNormalVehicle.setEngineType(tireSize);

        return newNormalVehicle;
    }

    @Override
    public void Display() {
        String carDetails = String.format("Normal vehicle:\n\tVehicleId - %d\n\tModelNumber - %d\n\tEngine Type(0: Oil, 1: Gas, 2: Diesel) - %d\n\t" +
                "Engine Power - %dHP\n\tTire Size - %d\n", getVehicleId(), getModelNumber(), getEngineType(), getEnginePower(), getTireSize());
        System.out.println(carDetails);
    }
}
