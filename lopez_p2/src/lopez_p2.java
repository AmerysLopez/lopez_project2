import java.util.Scanner;
public class lopez_p2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	char unit;	
	char Metric = 'M';
	char Imperial = 'I';
	double weightInPounds;
	double weightInKilograms;
	double heightInInches;
	double heightInMeters = 0;
	double BMIinMETRIC;
	double BMIinIMPERIAL;

		
	while (true) {	
		System.out.print ("Would you like to calculate your BMI using Metric or Imperial units? Please enter 'M' for Metric or 'I' for Imperial: ");
		unit = scnr.next().charAt(0);
	
		if (unit == Metric) {
			System.out.println("\nPlease enter your weight in Kilograms: ");
			weightInKilograms = scnr.nextDouble();
			System.out.println("Please enter your hieght in Meters: ");
			heightInMeters = scnr.nextDouble();
			BMIinMETRIC = (float) (weightInKilograms)/(Math.pow(heightInMeters,2));
			System.out.println("Your BMI is " +BMIinMETRIC + " kg/m^2\n");
			System.out.println("BMI Categories\n" + "Underweight = <18.5\r\n" + "Normal weight = 18.5–24.9\r\n" + 	"Overweight = 25–29.9\r\n" + "Obesity = BMI of 30 or greater\n\n");


		}
		else {
			if (unit == Imperial) {
				System.out.println("\nPlease enter your weight in Pounds: ");
				weightInPounds = scnr.nextDouble();
				System.out.println("Please enter your hieght in Inches: ");
				heightInInches = scnr.nextDouble();
				BMIinIMPERIAL = (float) ((703*weightInPounds)/(Math.pow(heightInInches,2)));
				System.out.println("\nYour BMI is " +BMIinIMPERIAL + " lbs/in^2\n");
				System.out.println("BMI Categories\n" + "Underweight = <18.5\r\n" + "Normal weight = 18.5–24.9\r\n" + 	"Overweight = 25–29.9\r\n" + "Obesity = BMI of 30 or greater\n\n");


			}
			else {System.out.println("Invalid. Please enter either a 'M' or 'I' : \n");};
	

		
		}
	}
	}
}
