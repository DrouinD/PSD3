import java.util.Scanner;

public class javaUI {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String choice;
		System.out.println("Sprint Week 1");
		System.out.println("\nChoose operation:\n1.CSV Export\n2. Attendance Monitoring\n");
		choice = input.next();
		
		if(choice.equals("1")){
			System.out.println("CSV Export chosen");
		}
		else if(choice.equals("2")){
			System.out.println("Attendance Monitoring was chosen");
		}



	}
}
