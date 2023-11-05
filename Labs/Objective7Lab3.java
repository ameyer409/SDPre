// Objective 7 Lab 3 - Identify Odd and Even Numbers

public class Objective7Lab3 {
	public static void main(String[] args) {
		int counter = 1;
		int evenOrOdd = 0;

		while(counter <= 20){
			evenOrOdd = counter % 2;
			switch(evenOrOdd){
			default:
				System.out.println(counter + " is even.");
				break;
			case 1:
				System.out.println(counter + " is odd.");
				break;
			}
			counter++;
		}
	}
}