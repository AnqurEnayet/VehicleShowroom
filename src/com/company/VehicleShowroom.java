package com.company;

import java.util.ArrayList;

public class VehicleShowroom implements IVehicleShowroom {

    private int showroomCarIndex;
    private ArrayList<Vehicle> ShowroomVehicles;
    private int showroomVisitorCount;

    public VehicleShowroom(){
        ShowroomVehicles = new ArrayList<Vehicle>();
    }

    public void AddVehicle(Vehicle newVehicle){
        ShowroomVehicles.add(newVehicle);
        System.out.print("New car Added.\nCarDetails:\n");
        newVehicle.Display();
        showroomCarIndex++;
    }

    public int GetVehicleCount()
    {
        return ShowroomVehicles.size();
    }

    public boolean RemoveVehicleByVehicleId(int vehicleId){
        boolean vehicleRemoved = false;
        for (int index = 0; index < ShowroomVehicles.size(); index++){
            if(ShowroomVehicles.get(index).getVehicleId() == vehicleId){
                Vehicle selectedVehicle = ShowroomVehicles.get(index);
                System.out.println("Removed Car Details:\n\t");
                selectedVehicle.Display();
                ShowroomVehicles.remove(selectedVehicle);
                vehicleRemoved = true;
            }
        }
        return vehicleRemoved;
    }

    public boolean RemoveVehicleByModelNumber(int modelNumber){
        boolean vehicleRemoved = false;
        for (int index = 0; index < ShowroomVehicles.size(); index++){
            if(ShowroomVehicles.get(index).getModelNumber() == modelNumber){
                Vehicle selectedVehicle = ShowroomVehicles.get(index);
                System.out.print("Removed Car Details:\n\t");
                selectedVehicle.Display();
                ShowroomVehicles.remove(selectedVehicle);
                vehicleRemoved = true;
                break;
            }
        }
        return vehicleRemoved;
    }

    public void DisplayShowroomCars(){
        if(ShowroomVehicles.size() > 0){
            showroomVisitorCount = 30;
        }
        else {
            showroomVisitorCount = 0;
        }
        for (int index = 0; index < ShowroomVehicles.size(); index++){
            Vehicle selectedVehicle = ShowroomVehicles.get(index);
            if(selectedVehicle.getIsSportsCar()){
                showroomVisitorCount += 20;
            }
            selectedVehicle.Display();
        }
        String visitorAmountDetails = String.format("Expected Visitor Count - %d\n", showroomVisitorCount);
        System.out.println(visitorAmountDetails);
    }

    public int getShowroomCarIndex() {
        return showroomCarIndex;
    }

    public void setShowroomCarIndex(int showroomCarIndex) {
        this.showroomCarIndex = showroomCarIndex;
    }

    public int getShowroomVisitorCount() {
        return showroomVisitorCount;
    }

    public void setShowroomVisitorCount(int showroomVisitorCount) {
        this.showroomVisitorCount = showroomVisitorCount;
    }
}
