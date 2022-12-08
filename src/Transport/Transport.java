package Transport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    Set<Sponsor> sponsorList;

    Set<Mechanic> mechanicList;

    public Transport(String brand, String model, double engine) {
        this.brand = ValidateUtil.validateString(brand);
        this.model = ValidateUtil.validateString(model);
        this.engineVolume = engine;
        this.mechanicList = new HashSet<>();
        this.sponsorList = new HashSet<>();

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngine() {
        return engineVolume;
    }

    public abstract void startMoving();

    public abstract void endMoving();

    public abstract void printType();

    public Set<Sponsor> getSponsorList() {
        return sponsorList;
    }

    public Set<Mechanic> getMechanicList() {
        return mechanicList;
    }

}
