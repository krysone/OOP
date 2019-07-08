package motorway;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Motorway {
/*
* 3. Stwórz klasę Highway która będzie posiadać :
    - kolekcję wszystkich pojazdów
    - metodę vehicleEntry(String numer_rejestracyjny, oraz CarType type) - która dodaje do kolekcji nową instancję VehicleInfo
     oraz wypisuje do konsoli komunikat. Metoda nic nie zwraca.
    - metodę searchVehicle(String numer_rejestracyjny) - która szuka pojazdu i wypisuje jego informacje
    * jeśli wciąż znajduje się na autostradzie. Metoda zwraca informacje o pojezdzie.
    - metodę wyjazdu - vehicleLeave(String numer_rejestracyjny) - która usuwa samochód z kolekcji,
    * wypisuje komunikat, oraz na podstawie czasu jaki samochód znajdował się na autostradzie oblicza jej kwotę do zapłaty
    *  i wypisuje ją do konsoli. Metoda zwraca kwotę do zapłaty.
Przyjmij pewną stałą kwotę do zapłaty za czas spędzony na autostradzie.
*  Jest to zabawna autostrada, bo zachęca do szybkiej jazdy. Im szybciej wyjedziemy tym mniej zapłacimy.

* */

    Map<String, VehicleInfo> motorwayRegistry = new HashMap<>();
    static double tollCharge = 1000.0;    //per min

    public double calculateCharge(Date entrance, Date leaving) {
        double chargeDueToPay = 0;
        Long timeOnMotorway = leaving.getTime() - entrance.getTime();
        chargeDueToPay = (timeOnMotorway * 0.001 * (1.0 / 60.0)) * tollCharge;
        return chargeDueToPay;
    }

    public void vehicleEntry(String registrationPlate, CarType type) {

        try {
            if (motorwayRegistry.containsKey(registrationPlate)) {
                throw new Exception();
            }else {
                VehicleInfo vehicle = new VehicleInfo.Builder()
                        .setRegistratonPlate(registrationPlate)
                        .setTypeOfCar(type)
                        .setMotorwayEntrance(VehicleInfo.getCurrentTimeUsingDate())
                        .build();

                motorwayRegistry.put(registrationPlate, vehicle);
                System.out.println(registrationPlate + "\t is using the motorway");
            }
        } catch (Exception e) {
            System.out.println("Sorry a vehicle of the given " + registrationPlate + " plates is already on the motorway");
        }
    }

    public VehicleInfo searchVehicle(String registrationPlate) throws Exception {
        try {
            if (motorwayRegistry.containsKey(registrationPlate)) {
                System.out.println("The vehicle " + registrationPlate + " is using the motorway as we speak");
                System.out.println(motorwayRegistry.get(registrationPlate).toString());
                return motorwayRegistry.get(registrationPlate);
            } else if
            (!motorwayRegistry.containsKey(registrationPlate)) {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("sorry we don't have him in the registry");
        }
        return motorwayRegistry.get(registrationPlate);
    }

    public double vehicleLeave(String registrationPlate) {
        double charge = 0.0;
        try {
            if (motorwayRegistry.containsKey(registrationPlate)) {

                System.out.println("vehicle " + registrationPlate + " is about to leave");
                Date leaving = VehicleInfo.getCurrentTimeUsingDate();
                charge = calculateCharge(motorwayRegistry.get(registrationPlate).getMotorwayEntrance(), leaving);
                String chargeDueToPayString = "there is " + charge + " due to pay";
                System.out.println(chargeDueToPayString);
                motorwayRegistry.remove(registrationPlate);

            } else if (!motorwayRegistry.containsKey(registrationPlate)) {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("vehicle " + registrationPlate + " is Not using the motorway");
        }
        return charge;
    }

    public void drive(Long drivingTime) {
        try {
            Thread.sleep(drivingTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
