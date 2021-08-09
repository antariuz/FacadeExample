package facade;

import model.BatteryPack;
import model.GPS;
import model.Payment;

public class ScooterFacade {
    GPS gps = new GPS();
    Payment payment = new Payment();
    BatteryPack batteryPack = new BatteryPack();

    public void unlock() {
        if (!gps.hasSatelliteConnection()) gps.connect();
        if (!batteryPack.isBatteryPowerLevelOk()) batteryPack.charge();
        if (!payment.isPaymentDone()) payment.pay();
    }


}
