package ru.milandr.courses.vorobyev;

public class Phone {
    private String manufacturer;
    private double price;
    private String operatingSystem;
    private int benchmarkResults;
    private double batteryCapacity;


    /*Constructors:*/

    public Phone(String manufacturer) {
        this.manufacturer = manufacturer;
        if (this.manufacturer == "Apple")
            this.operatingSystem = "iOS";
        else
            this.operatingSystem = "Android";
    }

    public Phone(String manufacturer, double price, double batteryCapacity) {
        this.manufacturer = manufacturer;
        if (this.manufacturer == "Apple") {
            this.operatingSystem = "iOS";
            this.benchmarkResults = 1000000;
        } else {
            this.operatingSystem = "Android";
            this.benchmarkResults = -2;
        }
        this.price = this.price;
        this.batteryCapacity = batteryCapacity;
        this.benchmarkResults = benchmarkResults;
    }

    public Phone(String manufacturer, double price, String operatingSystem, int benchmarkResults, double batteryCapacity) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.operatingSystem = operatingSystem;
        this.benchmarkResults = benchmarkResults;
        this.batteryCapacity = batteryCapacity;
    }

    public Phone() {
    }

    /* Getters and setters: */

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setBenchmarkResults(int benchmarkResults) {
        this.benchmarkResults = benchmarkResults;
    }

    public int getBenchmarkResult() {
        return this.benchmarkResults;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return this.batteryCapacity;
    }


}