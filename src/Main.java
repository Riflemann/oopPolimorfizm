import Transport.*;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada ", " Granta ", 1.7);
        Car audi = new Car("Audi ", " A8 ", 3.0);
        Car bmw = new Car("BMW ", " Z8 ", 3.0);
        Car kia = new Car("KIA ", " Sportage ", 2.4);

        Trucks kamaz = new Trucks("Kamaz ", " A-1 ", 5.5);
        Trucks man = new Trucks("Man ", " B-2 ", 4.5);
        Trucks volvo = new Trucks("Volvo ", " C-3 ", 5.0);
        Trucks reno = new Trucks("Reno ", " D-4 ", 3.5);

        Bus busOne = new Bus("busOne ", " A1 ", 3.0);
        Bus busTwo = new Bus("busTwo ", " A2 ", 3.0);
        Bus busThree = new Bus("busThree ", " A3 ", 2.4);
        Bus busFour = new Bus("busFour ", " A4 ", 2.5);

        lada.startMoving();
        lada.maxSpeed();
        lada.bestLapTime();
        lada.pitStop();
        lada.endMoving();

        audi.startMoving();
        audi.maxSpeed();
        audi.bestLapTime();
        audi.pitStop();
        audi.endMoving();

        bmw.startMoving();
        bmw.maxSpeed();
        bmw.bestLapTime();
        bmw.pitStop();
        bmw.endMoving();

        kia.startMoving();
        kia.maxSpeed();
        kia.bestLapTime();
        kia.pitStop();
        kia.endMoving();

        kamaz.startMoving();
        kamaz.maxSpeed();
        kamaz.bestLapTime();
        kamaz.pitStop();
        kamaz.endMoving();

        man.startMoving();
        man.maxSpeed();
        man.bestLapTime();
        man.pitStop();
        man.endMoving();

        volvo.startMoving();
        volvo.maxSpeed();
        volvo.bestLapTime();
        volvo.pitStop();
        volvo.endMoving();

        reno.startMoving();
        reno.maxSpeed();
        reno.bestLapTime();
        reno.pitStop();
        reno.endMoving();

        busOne.startMoving();
        busOne.maxSpeed();
        busOne.bestLapTime();
        busOne.pitStop();
        busOne.endMoving();

        busTwo.startMoving();
        busTwo.maxSpeed();
        busTwo.bestLapTime();
        busTwo.pitStop();
        busTwo.endMoving();

        busThree.startMoving();
        busThree.maxSpeed();
        busThree.bestLapTime();
        busThree.pitStop();
        busThree.endMoving();

        busFour.startMoving();
        busFour.maxSpeed();
        busFour.bestLapTime();
        busFour.pitStop();
        busFour.endMoving();


        DriverCatB<Car> carDriverCatB = new DriverCatB<Car>("Петя",5, audi);
        DriverCatD<Bus> busDriverCatD = new DriverCatD<Bus>("Вася", 20, busOne);
        DriverCatC<Trucks> truckDriverCatC = new DriverCatC<Trucks>("Иван", 2, volvo);

        System.out.println("Водитель " + carDriverCatB.getName() + " управляет автомобилем " +
                            carDriverCatB.getCar() + " и будет участвовать в заезде");
        System.out.println("Водитель " + busDriverCatD.getName() + " управляет автомобилем " +
                            busDriverCatD.getBus() + " и будет участвовать в заезде");
        System.out.println("Водитель " + truckDriverCatC.getName() + " управляет автомобилем " +
                            truckDriverCatC.getTruck() + " и будет участвовать в заезде");




    }
}