package Day3_.Que1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws UserException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter name");
		String name =  scanner.next();
		System.out.println("Enter date of birth iin dd/MM/yyyy ");
		String dobString = scanner.next();
		Date dob;
		try {
			dob = new SimpleDateFormat("dd/MM/yyyy").parse(dobString);
			/* get instance of clalender */
			Calendar birthday = Calendar.getInstance();
			birthday.setTimeInMillis(dob.getTime());
			
			long currentTime =  System.currentTimeMillis();
			Calendar now = Calendar.getInstance();		
			now.setTimeInMillis(currentTime);
			
			int age =  now.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
			
				if(age>=18 && age<60)
					System.out.println("user accepted");
				else {
					
					throw new UserException("invalid age...");
				}
		} catch (ParseException e1) {
			System.out.println("please enter dob on  correct formate");
		}
		
			
		
			
				
					
			
	}

}
