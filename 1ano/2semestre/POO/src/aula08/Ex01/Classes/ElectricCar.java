package aula08.Ex01.Classes;

import aula08.Ex01.Interfaces.ElectricVehicleInterface;

public class ElectricCar extends Car implements ElectricVehicleInterface {
    private int batteryPercentage;

    public ElectricCar(String plate, String brand, String model, int horsePower, int boardNumber, int trunkSize, int batteryPercentage){
        super(plate, brand, model, horsePower, boardNumber, trunkSize);
        if (batteryPercentage < 0)
            throw new IllegalArgumentException("Invalid battery percentage");
        this.batteryPercentage = batteryPercentage;
    }

    @Override
    public int autonomy() {
        return this.batteryPercentage; 
    }

    @Override
    public void charge(int finalPercentage) {
        int percentageToBeCharged = finalPercentage - this.batteryPercentage;
        if(percentageToBeCharged < 0)
            throw new IllegalArgumentException("The car has more battery than the battery you want it to charge to");
        this.batteryPercentage += percentageToBeCharged;
    }

}