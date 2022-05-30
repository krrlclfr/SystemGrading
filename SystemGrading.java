import java.util.*;
public class SystemGrading {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String Id_num, Last_name, First_name, Course, Section, Middle_name;
		double Prelim, Midterm, Prefinal, Finals,average,Maverage, percentage, Mpercentage;
		double Mprelim, Mmidterm, Mprefinal, Mfinals;
		int sio;
		System.out.print(" ");
		System.out.println("Grading System ");
		System.out.println(" ");
		System.out.println("Student Information");
		System.out.print("   Enter ID number:      ");
		Id_num = sc.nextLine();
		System.out.print("   Enter Last Name:      ");
		Last_name = sc.nextLine();
		System.out.print("   Enter First Name:     ");
		First_name = sc.nextLine();
		System.out.print("   Enter Middle Name:    ");
		Middle_name =  sc.nextLine();
		System.out.print("   Enter Couse:          ");
		Course =  sc.nextLine();
		System.out.print("   Enter Section:        ");
		Section = sc.nextLine();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Standing(40%)");
		System.out.print("   Enter Prelim:         ");
		Prelim = sc.nextInt();
		System.out.print("   Enter Midterm:        ");
		Midterm = sc.nextInt();	
		System.out.print("   Enter Pre-Finals:     ");
		Prefinal = sc.nextInt();
		System.out.print("   Enter Finals:         ");
		Finals = sc.nextInt();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Major exam(40%)");
		System.out.print("   Enter Prelim:         ");
		Mprelim = sc.nextInt();
		System.out.print("   Enter Midterm:        ");
		Mmidterm = sc.nextInt();	
		System.out.print("   Enter Pre-Finals:     ");
		Mprefinal = sc.nextInt();
		System.out.print("   Enter Finals:         ");
		Mfinals = sc.nextInt();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Special Integrated Output(20%)");
		System.out.print("    Enter SIO:            ");
		sio = sc.nextInt();
		System.out.println(" ");
		try {
		for(int j = 0; j < 70; j++) {
			Thread.sleep(100);
		System.out.print("#");
		}
		System.out.println(" ");
		System.out.print("Grading System ");
		System.out.println(" ");
		System.out.println(" ");
		Thread.sleep(1000);
		System.out.println("Student information ");
		Thread.sleep(1000);
		System.out.println("        ID number                   " + Id_num);
		Thread.sleep(1000);
		System.out.println("        Student Name:               " + First_name + " " + Middle_name + " " + Last_name );
		Thread.sleep(1000);
		System.out.println("        Course and Section:         " + Course + Section);
		Thread.sleep(1000);
		System.out.println(" ");
		for(int j = 0; j < 70; j++) {
			Thread.sleep(100);
			System.out.print("#");
			}
	    average = (Prelim + Midterm + Prefinal + Finals + sio) / 4;
	    Maverage = (Mprelim + Mmidterm + Mprefinal + Mfinals + sio) / 4;
	    percentage = average * 0.4;
	    Mpercentage = Maverage * 0.4;
	    System.out.println(" ");
	    Thread.sleep(1000);
	    System.out.println("Class Standing(40%)                          " + "  Major exam(40%)");
		System.out.println("    Prelim:         " + Prelim   +"                  " + "Prelim:           " + Mprelim );
		Thread.sleep(1000);
		System.out.println("    Midterm:        " + Midterm  +"                  " + "Midterm:          " + Mmidterm);	
		Thread.sleep(1000);
		System.out.println("    Pre-Finals:     " + Prefinal +"                  " + "Pre-Finals:       " + Mprefinal);	
		Thread.sleep(1000);
		System.out.println("    Finals:         " + Finals   +"                  " + "Finals:           " + Mfinals);
		Thread.sleep(1000);
		System.out.println("    Average:        " + average  +"                  " + "Average:          " + Maverage);
		Thread.sleep(1000);
		System.out.println("    Percentage      " + percentage+"                 " + "Percentage        " + Mpercentage);
		System.out.println(" ");
		System.out.println(" ");
		double final_grade = (average + Maverage) / 2;
		for(int i = 0; i < 40; i++) {
			Thread.sleep(150);
			System.out.print(" O");
			
		}
		Thread.sleep(1000);
		System.out.println(" ");
		System.out.println("                     Final grade: " + final_grade);
		
	   if (final_grade <= 74.99) {
			Thread.sleep(1000);
			System.out.println("                    Sorry you Failed ");
		
		}
	   else if(final_grade >= 75.99 && final_grade <= 78.99 ) {
			Thread.sleep(1000);
			System.out.println("                 Remarks: 1.0 ");
			Thread.sleep(1000);
			System.out.println("                    Passed ");
		}
		else if(final_grade >= 79.99 && final_grade <= 82.99 ) {
			Thread.sleep(1000);
			System.out.println("                 Remarks: 1.5 ");
			Thread.sleep(1000);
			System.out.println("                    Passed ");
		}
		else if(final_grade >= 83.99 && final_grade <= 86.99 ) {
			Thread.sleep(1000);
			System.out.println("                 Remarks: 2.0 ");
			Thread.sleep(1000);
			System.out.println("                    Passed ");
		}
		else if(final_grade >= 87.99 && final_grade <= 90.99 ) {
			Thread.sleep(1000);
			System.out.println("                 Remarks: 2.5 ");
			Thread.sleep(1000);
			System.out.println("                    Passed ");
		}
		else if(final_grade >= 91.99 && final_grade <= 93.99 ) {
			Thread.sleep(1000);
			System.out.println("                 Remarks: 3.0 ");
			Thread.sleep(1000);
			System.out.println("                    Passed ");
		}
		else if(final_grade >= 94.99 && final_grade <= 97.99 ) {
			Thread.sleep(1000);
			System.out.println("                 Remarks: 3.5 ");
			Thread.sleep(1000);
			System.out.println("                    Passed ");
		}
		else if(final_grade >= 98.99 && final_grade <= 100 ) {
			Thread.sleep(1000);
			System.out.println("                 Remarks: 4.0 ");
			Thread.sleep(1000);
			System.out.println("                    Passed ");
		}
	
		}catch(Exception e) {
			System.out.print(" ");
		}
			  
	}

}