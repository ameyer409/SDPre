// Objective 3 Lab 2 - Right Triangle

public class Objective3Lab2 {
	public static void main(String[] args) {
		double side1, side2, hypotenuse;
		side1 = 12;
		side2 = 9;

		hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));

		System.out.println("The hypotenuse of a right triangle with side lengths " + side1 + " and " + side2 + " is " + hypotenuse + ".");

	}

}