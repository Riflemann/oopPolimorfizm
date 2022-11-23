package Transport;

public class DriverCatC<T extends Transport> {
    private String name;
    private int experience;

    private Trucks truck;

    public DriverCatC(String name, int experience, Trucks truck) {
        this.name = name;
        this.experience = experience;
        this.truck= truck;
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

    public Trucks getTruck() {
        return truck;
    }

    public void setTruck(Trucks truck) {
        this.truck = truck;
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
