package org.example.devices;

public class Tablet extends Device {
    private double batteryLife;
    private boolean hasStylus;

    public Tablet(String name, double price, double weight, double batteryLife, boolean hasStylus) {
        super(name, price, weight);
        this.batteryLife = batteryLife;
        this.hasStylus = hasStylus;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isHasStylus() {
        return hasStylus;
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Battery: %.1f hrs | Stylus: %b", batteryLife, hasStylus);
    }
}
