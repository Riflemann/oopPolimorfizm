import Transport.*;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada ", " Granta ", 1.7, Car.BodyType.SEDAN);
        Car audi = new Car("Audi ", " A8 ", 3.0, Car.BodyType.COUPE);
        Car bmw = new Car("BMW ", " Z8 ", 3.0, Car.BodyType.COUPE);
        Car kia = new Car("KIA ", " Sportage ", 2.4, Car.BodyType.CROSSOVER);

        Trucks kamaz = new Trucks("Kamaz ", " A-1 ", 5.5,
                Trucks.LoadCapacity.N3);
        Trucks man = new Trucks("Man ", " B-2 ", 4.5,
                Trucks.LoadCapacity.N2_DOWN_BOUND, Trucks.LoadCapacity.N2_UPPER_BOUND);
        Trucks volvo = new Trucks("Volvo ", " C-3 ", 5.0,
                Trucks.LoadCapacity.N1);
        Trucks reno = new Trucks("Reno ", " D-4 ", 3.5,
                Trucks.LoadCapacity.N3);

        Bus busOne = new Bus("busOne ", " A1 ", 3.0,
                Bus.CapacityType.EXTRA_SMALL);
        Bus busTwo = new Bus("busTwo ", " A2 ", 3.0,
                Bus.CapacityType.MEDIUM_DOWN_BOUND, Bus.CapacityType.MEDIUM_UPPER_BOUND);
        Bus busThree = new Bus("busThree ", " A3 ", 2.4,
                Bus.CapacityType.LARGE_DOWN_BOUND, Bus.CapacityType.LARGE_UPPER_BOUND);
        Bus busFour = new Bus("busFour ", " A4 ", 2.5,
                Bus.CapacityType.ESPECIALLY_LARGE_DOWN_BOUND, Bus.CapacityType.ESPECIALLY_LARGE_UPPER_BOUND);


        DriverCatB carDriverCatB = new DriverCatB("Петя",5, audi);
        DriverCatD busDriverCatD = new DriverCatD("Вася", 20, busOne);
        DriverCatC truckDriverCatC = new DriverCatC("Иван", 2, volvo);


        System.out.println(audi);
        System.out.println(lada);

        System.out.println(kamaz);
        System.out.println(man);

        System.out.println(busOne);
        System.out.println(busTwo);
        System.out.println(busThree);
        System.out.println(busFour);

        audi.setTransportType(TransportType.CAR);
        busOne.setTransportType(TransportType.BUS);
        volvo.setTransportType(TransportType.TRUCK);
        audi.printType();
        busOne.printType();
        volvo.printType();
        reno.printType();

        try {
            carDriverCatB.diagnostic();
            busDriverCatD.diagnostic();
            truckDriverCatC.diagnostic();
            carDriverCatB.setCategory("");
            carDriverCatB.diagnostic();
        } catch (WrongTypeLicence e) {
            throw new RuntimeException(e);
        }
    }
}