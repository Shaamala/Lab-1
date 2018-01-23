package LabNum1;

import java.util.Scanner; // Calling Scanneer to get user input

public class Labnum1 {

	public static void main(String[] args) {
		
		double roomLength = 0;				
		double roomWidth = 0;
		double roomArea;
		double roomPerimeter;
		boolean isNum;
		boolean newRoom = true;
		String answer;
	// identify scanner input function	
	Scanner scan = new Scanner(System.in);	
			
		while (newRoom == true) {
			// Room length input validate
			do {
				System.out.println(" please enter room length: ");
				if (scan.hasNextDouble()) {
					roomLength = scan.nextDouble();
					isNum = true;
				} else {
					System.out.println("please enter number only!");
					isNum = false;
					scan.next();
				}
			} while (!(isNum));
			// Room width input validate
			do {
				System.out.println(" please enter room Width: ");
				if (scan.hasNextDouble()) {
					roomWidth = scan.nextDouble();
					isNum = true;
				} else {
					System.out.println("please enter number only!");
					isNum = false;
					scan.next();
				}
			} while (!(isNum));
			// compute the room area
			roomArea = roomLength * roomWidth;
			// compute the room perimeter
			roomPerimeter = 2 * (roomLength + roomWidth);
			// print out the result
			System.out.println(" Room area is " + roomArea + " and room perimeter is " + roomPerimeter);
			// new room option
			System.out.println(" Do you want to check another room(Y/N)?");
			answer = scan.next();
			//check the answer 
			if (answer.equals("Y") ||answer.equals("y")) {
				newRoom = true;
				} 
			else {
			newRoom = false;
				}
		}
		
	scan.close();
	}

}
