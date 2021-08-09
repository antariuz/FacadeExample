package model;

public class Payment {

    private double moneyReceived;

    public boolean isPaymentDone() {
        return moneyReceived >= 50;
    }

    public void pay() {
        moneyReceived = 50;
    }

}
