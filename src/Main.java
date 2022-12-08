import Transport.*;

import java.util.ArrayList;

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


        audi.setTransportType(TransportType.CAR);
        busOne.setTransportType(TransportType.BUS);
        volvo.setTransportType(TransportType.TRUCK);
        audi.printType();
        busOne.printType();
        volvo.printType();
        reno.printType();


        ArrayList<Transport> allTransports = new ArrayList<>();
        allTransports.add(lada);
        allTransports.add(audi);
        allTransports.add(bmw);
        allTransports.add(kia);
        allTransports.add(kamaz);
        allTransports.add(volvo);
        allTransports.add(busOne);
        allTransports.add(busTwo);
        allTransports.add(busThree);
        allTransports.add(busFour);

        Mechanic mechanicOne = new Mechanic("Механик 1", "Копания 1", TransportType.CAR);
        Mechanic mechanicTwo = new Mechanic("Механик 2", "Копания 1", TransportType.BUS);
        Mechanic mechanicThree =new Mechanic("Механик 3", "Копания 1", TransportType.TRUCK);
        Mechanic mechanicFour =new Mechanic("Механик 4", "Копания 2", TransportType.CAR);
        Mechanic mechanicFife =new Mechanic("Механик 5", "Копания 2", TransportType.TRUCK);
        Mechanic mechanicSix = new Mechanic("Механик 6", "Копания 3", TransportType.BUS);
        Mechanic mechanicSeven =new Mechanic("Механик 7", "Копания 3", TransportType.CAR);
        Mechanic mechanicEight =new Mechanic("Механик 8", "Копания 4", TransportType.BUS);

        lada.getMechanicList().add(mechanicOne);
        lada.getMechanicList().add(mechanicTwo);
        lada.getMechanicList().add(mechanicThree);
        bmw.getMechanicList().add(mechanicThree);
        bmw.getMechanicList().add(mechanicFour);
        bmw.getMechanicList().add(mechanicFife);
        bmw.getMechanicList().add(mechanicSix);
        volvo.getMechanicList().add(mechanicSeven);
        volvo.getMechanicList().add(mechanicEight);

        Sponsor sponsorOne = new Sponsor("Спонсор 1", 10_000_000);
        Sponsor sponsorTwo = new Sponsor("Спонсор 2", 10_000_000);
        Sponsor sponsorThree = new Sponsor("Спонсор 3", 10_000_000);
        Sponsor sponsorFour = new Sponsor("Спонсор 4", 10_000_000);
        Sponsor sponsorFife = new Sponsor("Спонсор 5", 10_000_000);
        Sponsor sponsorSix = new Sponsor("Спонсор 6", 10_000_000);

        lada.getSponsorList().add(sponsorOne);
        lada.getSponsorList().add(sponsorTwo);
        bmw.getSponsorList().add(sponsorThree);
        volvo.getSponsorList().add(sponsorFour);
        kia.getSponsorList().add(sponsorFife);
        kamaz.getSponsorList().add(sponsorSix);

        for (Transport car :allTransports) {
            if (car.getMechanicList().size() != 0) {
                System.out.println(car.getMechanicList());
            }
            if (car.getSponsorList().size() != 0) {
                System.out.println(car.getSponsorList());
            }
        }

        ServiceStation<Transport> transportServiceStation = new ServiceStation<Transport>();
        transportServiceStation.addTransport(audi);
        transportServiceStation.addTransport(volvo);
        transportServiceStation.addTransport(kamaz);
        transportServiceStation.addTransport(busOne);
        transportServiceStation.addTransport(bmw);

        transportServiceStation.maintenance();

    }
}