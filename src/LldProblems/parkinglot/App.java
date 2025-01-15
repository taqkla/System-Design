package LldProblems.parkinglot;

import DesignPatterns.creational.builder.solution.Address;
import LldProblems.parkinglot.actors.Admin;
import LldProblems.parkinglot.entities.Payment;
import LldProblems.parkinglot.entities.Ticket;
import LldProblems.parkinglot.entities.TwoWheelerVehicle;
import LldProblems.parkinglot.entities.Vehicle;
import LldProblems.parkinglot.entities.VehicleType;
import LldProblems.parkinglot.services.Floor;
import LldProblems.parkinglot.services.ParkingLot;
import LldProblems.parkinglot.services.gate.EntryGate;
import LldProblems.parkinglot.services.gate.ExitGate;
import LldProblems.parkinglot.services.parking.NaturalOrderParking;
import LldProblems.parkinglot.services.payment.HourPayment;
import LldProblems.parkinglot.services.payment.PaymentType;
import LldProblems.parkinglot.services.spot.FourWheelerParkingSpot;
import LldProblems.parkinglot.services.spot.ParkingSpot;
import LldProblems.parkinglot.services.spot.ParkingSpotType;
import LldProblems.parkinglot.services.spot.TwoWheelerParkingSpot;

public class App {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("Welcome To Parking Lot");
    ParkingLot parkingLot = ParkingLot.INSTANCE;

    parkingLot.setAddress(new Address(560037, "Fern City"));

    //Admin tests
    Admin admin = new Admin();
    //Admin Case 1 - should be able to add parking floor
    Floor f1 = new Floor("1");
    admin.addFloor(f1);
    //Admin Case 2 - should be able to add parking floor
    Floor f2 = new Floor("2");
    admin.addFloor(f2);
    //Admin Case 3 - should be able to add entrance gate
    EntryGate entry1 = new EntryGate("1");
    admin.addEntryGate(entry1);
    //Admin Case 4 - should be able to add entrance gate
    EntryGate entry2 = new EntryGate("1");
    admin.addEntryGate(entry2);
    //Admin Case 5 - should be able to add exit gate
    ExitGate exit1 = new ExitGate("1");
    admin.addExitGate(exit1);
    //Admin Case 6 - should be able to add parking strategy, use factory pattern to create Parking object
    admin.setParkingStrategy(new NaturalOrderParking());
    //Admin Case 7 - should be able to add car parking space
    ParkingSpot carSpot1 = new FourWheelerParkingSpot("1", ParkingSpotType.FOUR_WHEELER_PARKING);
    admin.addParkingSpot(f1, carSpot1);
    //Admin Case 8 - should be able to add bike parking space
    ParkingSpot bikeSpot1 = new TwoWheelerParkingSpot("2", ParkingSpotType.TWO_WHEELER_PARKING);
    admin.addParkingSpot(f1, bikeSpot1);
    //Admin Case 9 - should be able to add car parking space
    ParkingSpot carSpot2 = new FourWheelerParkingSpot("3", ParkingSpotType.FOUR_WHEELER_PARKING);
    admin.addParkingSpot(f1, carSpot2);

    // F1 -- 2 - 4 wheeler, 1 - 2 wheeler
    // F2 --

    // Parking Test Cases
    // Test Case 1 - check for availability of parking space for Car - TRUE
    System.out.println(ParkingLot.INSTANCE.isParkingSpaceAvailable(VehicleType.FOUR_WHEELER));
    //Test Case 2 - check for availability of parking space for Bike - TRUE
    System.out.println(ParkingLot.INSTANCE.isParkingSpaceAvailable(VehicleType.TWO_WHEELER));
    //Test Case 3 - check for availability of parking space for Truck - FALSE
    System.out.println(ParkingLot.INSTANCE.isParkingSpaceAvailable(VehicleType.HEAVY));
    //Test Case 4 - check for availability of parking space for Handicapped - FALSE
    System.out.println(ParkingLot.INSTANCE.isParkingSpaceAvailable(VehicleType.HANDICAPPED));
    //Test Case 4 - Entry Gate - 2
    System.out.println(ParkingLot.INSTANCE.getEntries().size());

    // Test Case 5 - get parking space for bike "KA05MR2311" entering from entry gate entry1
    Vehicle vehicle1 = new TwoWheelerVehicle("KA05MR2311");
    Ticket ticket1 = entry1.generateTicket(vehicle1);
    System.out.println(ticket1.toString());
    //
    // //Test Case 6 - Now we should not be able to park bike (only 1 parking space created for bike)
    System.out.println(ParkingLot.INSTANCE.isParkingSpaceAvailable(VehicleType.TWO_WHEELER));

    // Thread.sleep(3000);
    //Test Case 7 - make payment for ticket1 (vehicle exists from exit1)
    Payment p1 = exit1.makePayment(PaymentType.UPI, new HourPayment(), ticket1);
    System.out.println(p1.getAmount());

    //Test Case 8 - Now we should be able to park bike "GHFD3452" entering from entry gate entry2
    Vehicle vehicle2 = new TwoWheelerVehicle("GHFD3452");
    Ticket ticket2 = entry2.generateTicket(vehicle2);
    System.out.println(null == ticket2);
    //Test Case 9 - check for total parking space created for car
    System.out.println(ParkingLot.INSTANCE.getFloorList()
        .get(0).getParkingSpots().get(ParkingSpotType.FOUR_WHEELER_PARKING).size());
  }
}
