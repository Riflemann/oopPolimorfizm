package Transport;

public class DriverCatB<T extends Transport> {
    private String name;
    private int experience;

    private Car car;

    public DriverCatB(String name, int experience, Car car) {
        this.name = name;
        this.experience = experience;
        this.car=car;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
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
