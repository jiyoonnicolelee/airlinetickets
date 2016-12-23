package airlinetickets;

import java.util.Scanner;

public class Tickets {
	
public String flight_type;
public String route;
public String placefrom;
public String placeto;
public String departDate;
public String returnDate;
public String seat_type;
public String airline_type;
public String seatNumber;
public String lastname;
public String firstmiddlename;
public String gender;
public String birthday;
public String phonenumber;
public String emailAdress;
public String gateNumber;
public String departTime;
public String boardingTime;
public String fNumber;
int response;
public static Scanner input = new Scanner(System.in);
public String[][] options;

public void outputTicket() {
	System.out.printf("--------------------------------------------------------------------------------------------%n");
	System.out.printf("|                              Ticket                              l     Boarding Pass     |%n");
	System.out.printf("|------------------------------------------------------------------------------------------|%n");
	System.out.printf("|  NAME LAST NAME %-10s FIRST NAME %-10s                 l NAME %-8s      %-2s |%n", lastname, lastname, firstmiddlename, gender);
	System.out.printf("|                                                                  l FROM %10s       |%n", placefrom);
	System.out.printf("|  FLIGHT %-5s %-10s          TO %-12s                l TO  %-12s      |%n", fNumber, departDate, placeto, placeto);
	System.out.printf("|                                                                  l DATE %9s        |%n", departDate);
	System.out.printf("|  DEP TIME  %-5s                                                 l SEAT %-3s FLIGHT %-5s |%n", departTime, seatNumber, fNumber);
	System.out.printf("|                                                                  l                       |%n");
	System.out.printf("|                                                                  l                       |%n");
	System.out.printf("|  BOARDING TIME                   GATE NUMBER                     l                       |%n");
	System.out.printf("|  %-5s                           %-2s                              l                       |%n", boardingTime, gateNumber);
	System.out.printf("|                                                                  l                       |%n");
	System.out.printf("|  *Boarding time is 30 minutes before departure time.             l                       |%n");
	System.out.printf("|__________________________________________________________________l_______________________|%n");
	//boarding time is 30 minutes before departure time
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
		
		//////////myTicket.options = myComp.selectFlightFromOptions();
		
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