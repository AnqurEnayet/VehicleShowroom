package com.company;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IVehicleShowroom vehicleShowroom = new VehicleShowroom();
        //vehicleShowroom.AddVehicle(new NormalVehicle(vehicleShowroom));
        //vehicleShowroom.AddVehicle(new NormalVehicle((vehicleShowroom)));
        //vehicleShowroom.AddVehicle(new NormalVehicle((vehicleShowroom)));
        //vehicleShowroom.RemoveVehicleByVehicleId(0);
        //vehicleShowroom.DisplayShowroomCars();

        Scanner scan = new Scanner(System.in);
        int choice = 0;
        while (choice != 4)
        {
            String displayChoices = String.format("1. Add vehicle\n2. Remove vehicle \n3. Display vehicle\n4. Exit\n\nEnter your choice:\t");
            System.out.print(displayChoices);
            choice = scan.nextInt();

            if(choice == 1){
                String displayCarOptions = String.format("1. Normal vehicle\n2. Sports Car\n3. Heavy vehicle\n4. Exit\n\nEnter your choice:\t");
                System.out.print(displayCarOptions);
                int chosenCar = scan.nextInt();

                if(chosenCar == 1){
                    NormalVehicle newVehicle = new NormalVehicle(vehicleShowroom);
                    String displayText = String.format("\nEnter Model Number(Integer):\t");
                    System.out.print(displayText);
                    int modelNumber = scan.nextInt();
                    newVehicle.setModelNumber(modelNumber);

                    displayText = String.format("\nEnter Engine Type(0: Oil, 1: Gas, 2: Diesel):\t");
                    System.out.print(displayText);
                    int engineType = scan.nextInt();
                    newVehicle.setEngineType(engineType);

                    displayText = String.format("\nEnter Engine Power(Integer):\t");
                    System.out.print(displayText);
                    int enginePower = scan.nextInt();
                    newVehicle.setEnginePower(enginePower);

                    displayText = String.format("\nEnter Tire Size(Integer):\t");
                    System.out.print(displayText);
                    int tireSize = scan.nextInt();
                    newVehicle.setTireSize(tireSize);

                    vehicleShowroom.AddVehicle(newVehicle);
                }
                else if(chosenCar == 2){
                    SportsCar newVehicle = new SportsCar(vehicleShowroom);
                    String displayText = String.format("\nEnter Model Number(Integer):\t");
                    System.out.print(displayText);
                    int modelNumber = scan.nextInt();
                    newVehicle.setModelNumber(modelNumber);

                    newVehicle.setEngineType(0);

                    displayText = String.format("\nEnter Engine Power(Interger):\t");
                    System.out.print(displayText);
                    int enginePower = scan.nextInt();
                    newVehicle.setEnginePower(enginePower);

                    displayText = String.format("\nEnter Tire Size(Integer):\t");
                    System.out.print(displayText);
                    int tireSize = scan.nextInt();
                    newVehicle.setTireSize(tireSize);

                    displayText = String.format("\nDoes the has turbo(Integer).\n1. Yes\n2 or other. No\nEnter your choice:\t");
                    System.out.print(displayText);
                    int turboChoice = scan.nextInt();
                    if(turboChoice == 1)
                    {
                        newVehicle.setTurbo(true);
                    }
                    else{
                        newVehicle.setTurbo(false);
                    }

                    vehicleShowroom.AddVehicle(newVehicle);
                }
                else if(chosenCar == 3){
                    HeavyVehicle newVehicle = new HeavyVehicle(vehicleShowroom);
                    String displayText = String.format("\nEnter Model Number(Integer):\t");
                    System.out.print(displayText);
                    int modelNumber = scan.nextInt();
                    newVehicle.setModelNumber(modelNumber);

                    newVehicle.setEngineType(2);

                    displayText = String.format("\nEnter Engine Power(Integer):\t");
                    System.out.print(displayText);
                    int enginePower = scan.nextInt();
                    newVehicle.setEnginePower(enginePower);

                    displayText = String.format("\nEnter Tire Size(Integer):\t");
                    System.out.print(displayText);
                    int tireSize = scan.nextInt();
                    newVehicle.setTireSize(tireSize);

                    displayText = String.format("\nEnter Weight(Integer):\t");
                    System.out.print(displayText);
                    int weight = scan.nextInt();
                    newVehicle.setWeight(weight);

                    vehicleShowroom.AddVehicle(newVehicle);
                }
                else{
                    System.out.println("Invalid choice\n");
                }
            }
            else if(choice == 2){
                if(vehicleShowroom.GetVehicleCount() == 0){
                    System.out.println("No car available to remove\n");
                    continue;
                }
                String displayText = "\nEnter Model Number(Integer):\t";
                System.out.print(displayText);
                int modelNumber = scan.nextInt();
                boolean success = vehicleShowroom.RemoveVehicleByModelNumber(modelNumber);
                if(!success){
                    System.out.println("Invalid model number");
                }
            }
            else if(choice == 3)
            {
                System.out.println("\nAll Showroom car details\n\n");
                vehicleShowroom.DisplayShowroomCars();
            }
            else if(choice == 4)
            {
                System.out.println("Exiting application");
            }
            else
            {
                System.out.println("\nInvalid choice. Try again.");
            }
        }
    }

}
