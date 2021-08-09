package model;

public class BatteryPack {

    private int batteryPowerLevel;

    public boolean isBatteryPowerLevelOk(){
        return batteryPowerLevel > 10;
    }

    public void charge(){
        batteryPowerLevel = 100;
    }

}
