package model;

public class GPS {

    private boolean signal = false;

    public boolean hasSatelliteConnection() {
        return signal;
    }

    public void connect() {
        signal = true;
    }

    public void disconnect() {
        signal = false;
    }


}
