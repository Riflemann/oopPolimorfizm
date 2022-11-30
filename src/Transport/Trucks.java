package Transport;

public class Trucks extends Transport implements Challenge {

    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начал движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Грузовик закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик на пит-стопе");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга грузовика:...");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовика:...");
    }

    @Override
    public String toString() {

        return "Track{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                '}';
    }
}
