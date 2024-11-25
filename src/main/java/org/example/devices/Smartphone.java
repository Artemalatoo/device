package org.example.devices;

public class Smartphone extends Device {
    private double screenSize;
    private String cameraResolution;

    public Smartphone(String name, double price, double weight, double screenSize, String cameraResolution) {
        super(name, price, weight);
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Screen: %.1f\" | Camera: %s", screenSize, cameraResolution);
    }
}
