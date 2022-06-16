import java.io.*;
import java.util.*;
public class emplyoee {

	
		// TODO Auto-generated method stub
		int emp_id;
		String empName;
		String projectName;
		String adress;
	}

class adress{
	String street,city,state;
	int pin;
	Scanner sc = new Scanner(System.in);
	public void adressInfo() {
		System.out.println("enter the street name");
		street=sc.nextLine();
		System.out.println("enter the city name");
		city=sc.nextLine();
		System.out.println("enter the state");
		state=sc.nextLine();
		System.out.println("enter the pin code");
		pin=sc.nextInt();
	}
}
class manager extends emplyoee{
	String clientName;
	int peopleReporting;
	
}
class timesheet{
	int timesheetId;
	int timesheetDate;
	String actvity;
	String description;
	int hoursSpent;
	enum status{
		approved,
		rejected,
		submitted
	}
}
