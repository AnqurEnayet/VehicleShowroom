package com.company;

public abstract class Vehicle {
    private int vehicleId;
    private int modelNumber;
    private int engineType;
    private int enginePower;
    private int tireSize;
    private boolean isSportsCar;
    public IVehicleShowroom VehicleShowroom;

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getEngineType() {
        return engineType;
    }

    public void setEngineType(int engineType) {
        this.engineType = engineType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public boolean getIsSportsCar() {
        return isSportsCar;
    }

    public void setIsSportsCar(boolean sportsCar) {
        isSportsCar = sportsCar;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public abstract void Display();
}
