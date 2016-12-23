package airlinetickets;
import java.util.Random;
import java.util.Scanner;
public class Computer {
	
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
	public char gender;
	public String birthday;
	public String phonenumber;
	public String emailAdress;
	public String gateNumber;
	public String departTime;
	public String boardingTime;
	public String fNumber;
	public static Scanner input = new Scanner(System.in);
	public static Random rand = new Random();
	
public String international_domestic (){
	System.out.println("1. international");
	System.out.println("2. domestic");
	int value;
	while(true) {
		while(!input.hasNextInt()) {
			while(input.hasNext()) {
				input.next();
			}
			System.out.println("Please enter a 1 or 2");
		}
		value = input.nextInt();
		if(value < 0 || value > 2) continue;
		if(value == 1) return "international";
		if(value == 2) return "domestic";
	}
}
	//get user input (1 or 2)
	//test to make sure user input is 1 or 2
	//if 1 return "international"
	//if 2 return "domestic"
	//if not 1 or 2, loop back to question

public String oneWayRoundTrip (){
	System.out.println("1. One way flight");
	System.out.println("2. Round trip");
	int value;
	while(true){
		while(!input.hasNextInt()){
			while(input.hasNext()){
				input.next();
			}
			System.out.println("Please enter a 1 or 2");
						}
		value = input.nextInt();
		if(value < 0 || value > 2) continue;
		if(value == 1) return "One way flight";
		if(value == 2) return "Round trip";
	}
		}
	
	public String from (){
	System.out.println("From:");
	placefrom = input.next();
	return placefrom;
	}
	
public String to (){
	System.out.println("To:");
	input.nextLine();
	placeto = input.next();
	return placeto;
}

public String departDate (){
	System.out.println("depart_date: DATE/MONTH/YEAR");
	input.nextLine();
	departDate = input.next();
	return departDate;
}

public String returnDate(){
	System.out.println("return_date: DATE/MONTH/YEAR");
	input.nextLine();
	returnDate = input.next();
	return returnDate;
}

public String cabinClass (){
	System.out.println("1. First Class, 2. Prestige Class, 3. Economy Class");
	int value;
	while(true){
		while(!input.hasNextInt()){
			while(input.hasNext()){
				input.next();
			}
			System.out.println("Please enter a 1 or 2");
						}
		value = input.nextInt();
		if(value < 0 || value > 3) continue;
		if(value == 1) return "First Class";
		if(value == 2) return "Prestige Class";
		if(value == 3) return "Economy Class";
	}
}

public String[] flight (){	
	System.out.println(this.departDate);
	int hour = rand.nextInt(24);
	int minute = rand.nextInt(60);
	String time = hour+":"+minute;
	System.out.println(time);
	
	//date of flight/time of flight/place from /place to
	
	String[] flight = {departDate, time, placefrom, placeto};
	return flight;
}

public String[][] selectFlightFromOptions() {
	String[][] options = new String[2][4]; //[option number][details in strings]
	for(int i = 0; i < options.length; i++) {
		options[i] = flight();
		
	}
	return options;
} 

public String departTime(){
	System.out.println("departure time: ");
	int hour = rand.nextInt(24);
	int minute = rand.nextInt(60);
	String time = hour+":"+minute;
	System.out.println(time);
	return time;
}

/*public String boardingTime(){
	System.out.println(this.departDate);
	int hour = rand.nextInt(24);
	int minute = rand.nextInt(60);
	String time = hour+":"+minute;
	System.out.println(time);
	return time;
	/*boardingTime = departTime-30min
}*/

public String airline (){

	return airline_type;
}

public String seatNumber (){
		Random rand = new Random();
		char myChar = 'A';
		//System.out.println(myChar);
		myChar = (char)(myChar + 1);
		//System.out.println(myChar);
		/*for(int i = 0; i < 500; i++) {
			System.out.printf("%c", (char)(myChar+rand.nextInt(10)));
		}*/
		//System.out.println();
		return String.format("%d%c", rand.nextInt(35), (char)(myChar+rand.nextInt(10)));
}
	
public String LastName(){
	System.out.println("Last Name:");
	lastname = input.next();
	return lastname;
}

public String FirstMiddleName(){
	System.out.println("FirstMiddleName:");
	firstmiddlename = input.next();
	return firstmiddlename;
}

public String gender(){
	System.out.println("gender(Please enter a M for MR or F for MS):");
	/*gender= input.next();*/
	char gender;
	while(true){
		gender = input.next().charAt(0);
		//if(gender == 'M' || gender == 'F' ) continue;
		if(gender == 'M') return "MR";
		if(gender == 'F') return "MS";
		System.out.println("Please enter a M or F");
	}
}

public String DateofBirth (){
	System.out.println("DateOfBirth: DATE/MONTH/YEAR");
	birthday = input.next();
	return birthday;
	//limit to 9 digits
}

public static boolean isInteger(String str) {
	try {
		int myInt = Integer.parseInt(str);
	} catch(NumberFormatException nfe) {
		return false;
	}
	return true;
} 
public String PhoneNumber (){
	System.out.println("PhoneNumber:");	
	
	do { // confirming final value is 10 
		phonenumber = input.next();
		//phonenumber = input.next();
		while(!isInteger(phonenumber)){ //validate that the value could be an integer
			System.out.println("Xinteger");
			phonenumber = input.next();
		}
		
		if(phonenumber.length() == 11) {
			return phonenumber;
		}
		System.out.println("X10 digits");//re input
	} while (phonenumber.length() != 11);
	return phonenumber;
	
	//than return re enter : your input is not 10 digits        
	//current problem with this code : doesnt do anything if input a single integer value
	// it seems like its chekcing for the digits, but not for whether or not its an integer 
}

public String EmailAdress (){
	System.out.println("Email Adress:");
	emailAdress = input.next();
	return emailAdress;
}

public String gateNumber (){
	Random gateNumber = new Random();
	int gNumber = gateNumber.nextInt(100);
	return String.valueOf(gNumber);
}

public String flightNumber(){ //LLNNN
	Random flightNumber = new Random();
	char myChar = 'A';
	char myChar2 = 'A';
	myChar = (char)(myChar + flightNumber.nextInt(26));
	myChar2 = (char)(myChar2+ flightNumber.nextInt(26));
	int number = flightNumber.nextInt(1000);
	System.out.println(myChar+myChar2);
	String fNumber = String.valueOf(myChar) + String.valueOf(myChar2) + String.format("%03d", number);
	return fNumber;
}
}