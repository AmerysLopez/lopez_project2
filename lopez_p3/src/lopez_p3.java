import java.util.Scanner;
import java.util.Arrays;


public class lopez_p3 {
	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	
// initializing all variables and arrays
	
		int[][] responses = new int[5][10];
		String [] topics = new String[5];
		topics[0] = "Gun Control";
		topics[1] = "Enviromental regulations for large coperations";
		topics[2] = "LGBT+ rights and freedoms";
		topics[3] = "Funding for public health care";
		topics[4] = "Abortion Rights";
		int answer;
		int pick;
		int pointTotal=0;
		float iterations=0;
		int [] total = new int[5];
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		int maxFinal = 0;
		int min1 = 0;
		int min2 = 0;
		int min3 = 0;
		int minFinal = 0;

		
//This while loop prints topics, collects all the responses and stores them, keeps track of how many people have taken the survey, and gives a menu to either continue or exit.
		
		while(true) {	
		System.out.print("\n\nWelcome to the survey.");
		System.out.print("\n\nPlease rate each of the following from 1 to 10, 1 being least important, and 10 being most important.");
		
			for(int i=0; i<5; i++) {
			System.out.print("\n");
			System.out.print("\n"+topics[i]+": ");
			answer = scnr.nextInt();
					if (answer <11 && answer >0){
						if      (answer == 1) {responses[i][answer-1]  +=1;}
						else if (answer == 2) {responses[i][answer-1]  +=1;}
						else if (answer == 3) {responses[i][answer-1]  +=1;}
						else if (answer == 4) {responses[i][answer-1]  +=1;}
						else if (answer == 5) {responses[i][answer-1]  +=1;}
						else if (answer == 6) {responses[i][answer-1]  +=1;}
						else if (answer == 7) {responses[i][answer-1]  +=1;}
						else if (answer == 8) {responses[i][answer-1]  +=1;}
						else if (answer == 9) {responses[i][answer-1]  +=1;}
						else if (answer == 10) {responses[i][answer-1] +=1;}
					}
					
					else {
					System.out.println ("Invalid answer, please give a value between 1 and 10");
					i= (i--)-1;
					}
			}
			
		iterations = iterations + 1;
		System.out.println("\n\n\nThank you for your reponses! Would you like to: \n\n -allow another user to take the survey?\t Enter '1' \n -exit and recieve results? \t\t\t Enter any other number ");
		pick = scnr.nextInt();
		
					if (pick == 1) {continue;}
					else {break;}
		}
	
		
		
		
// This section prints out the results and also the averages for each topic		
		
	System.out.println("\n Thank you all for completing the survey! Below are the results.\n");
	System.out.printf("%50s", "\t\t\t\t  Rating:\t1 2 3 4 5 6 7 8 9 10  avg.\n\n");
	
		for(int i=0; i<5; i++) {
		System.out.printf("%50s",topics[i]);
		System.out.print("\t");
		pointTotal = 0;

			for (int j=0; j<10; j++) {
			System.out.printf("%d ", responses[i][j]);
			pointTotal = pointTotal + responses[i][j]*(j+1);
			}	
			
		System.out.print(" "+pointTotal/iterations);
	
			if (i==0) {total[0]= pointTotal;}
			else if (i==1) {total[1]= pointTotal;}
			else if (i==2) {total[2]= pointTotal;}
			else if (i==3) {total[3]= pointTotal;}
			else if (i==4) {total[4]= pointTotal;}
		System.out.print("\n");
		}
		
		
	
		
		
//This section calculates and prints the category with the highest point value		
		
	max1 = Math.max(total[0], total[1]);
	max2 = Math.max(total[2], total[3]);
	max3 = Math.max(max1, max2);
	maxFinal = Math.max (max3,total[4]);
	System.out.println("\nThe category(s) with the highest point total is/are:");	
		for(int i=0; i<5; i++) {
			if (maxFinal == total[i]) {System.out.print(topics[i]+". Point total = ");System.out.println(maxFinal);}
		}
	
	
	

		
		
//This section calculates and prints the category with the lowest point value		
		
	min1 = Math.min(total[0], total[1]);
	min2 = Math.min(total[2], total[3]);
	min3 = Math.min(min1, min2);
	minFinal = Math.min (min3,total[4]);
	System.out.println("\nThe category(s) with the lowest point total is/are:");
		for(int i=0; i<5; i++) {
			if (minFinal == total[i]) {System.out.print(topics[i]+". Point total = ");System.out.println(minFinal);}
		}
	

}

}

