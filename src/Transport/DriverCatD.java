package Transport;

public class DriverCatD<T extends Transport> {
    private String name;
    private int experience;
    private Bus bus;

    public DriverCatD(String name, int experience, Bus bus) {
        this.name = name;
        this.experience = experience;
        this.bus=bus;
    }

    public void startMoving() {
        System.out.println("Водитель начал движение");
    }

    public void stopMoving() {
        System.out.println("Водитель начал движение");
    }

    public void reFuel() {
        System.out.println("Водитель запраляет автомобиль");
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
