package airlinetickets;
import java.util.Scanner;
public class Customer {
	
public static Scanner input = new Scanner(System.in);

public static void  main(String[] ARGS){
	int response;
	System.out.println("Would you like to book an airline ticket? yes = 1");
	response = input.nextInt();
	
	if (response == 1){	
	//int myInput = input.nextInt();	
	Tickets myTicket = new Tickets();
	Computer myComp = new Computer();
	myTicket.flight_type = myComp.international_domestic();
	myTicket.route = myComp.oneWayRoundTrip();
	myTicket.placefrom = myComp.from();
	myTicket.placeto = myComp.to();
	myTicket.departDate= myComp.departDate();
	myTicket.returnDate = myComp.returnDate();
	myTicket.seat_type = myComp.cabinClass();
	
	
	myTicket.options = myComp.selectFlightFromOptions();
	
	myTicket.airline_type=myComp.airline();
	myTicket.seatNumber=myComp.seatNumber();
	//System.out.println(myTicket.seatNumber);
	myTicket.lastname =myComp.LastName();
	myTicket.firstmiddlename = myComp.FirstMiddleName();
	myTicket.gender=myComp.gender();
	//myTicket.gender= myComp.gender();
	myTicket.birthday = myComp.DateofBirth();
	myTicket.phonenumber = myComp.PhoneNumber();
	myTicket.emailAdress= myComp.EmailAdress();
	myTicket.gateNumber = myComp.gateNumber();
	myTicket.departTime = myComp.departTime();
	//myTicket.boardingTime = myComp.boardingTime();
	myTicket.fNumber = myComp.flightNumber();
	myTicket.outputTicket();
	}	
}
}