package com.company;

public interface IVehicleShowroom {
    void AddVehicle(Vehicle newVehicle);
    int GetVehicleCount();
    boolean RemoveVehicleByVehicleId(int vehicleId);
    boolean RemoveVehicleByModelNumber(int modelNumber);
    void DisplayShowroomCars();
    int getShowroomCarIndex();
    void setShowroomCarIndex(int showroomCarIndex);
}
