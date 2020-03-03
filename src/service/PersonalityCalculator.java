package service;
import java.util.Scanner;

// Create a class called PersonalityCalculator
// PersonalityCalculator has two methods findAnswers and findYourBrainType
// int[] findAnswers(String options) and String findYourBrainType(String options) is the method prototype
// findAnswer() accepts String as an argument and returns integer array as an output
// findYourBrainType accepts String as an argument and returns String as an output
// option is a string which contains all the options selected as a string
// Use the split method to segregate the options and store it in a string array.
// Convert the string array into an integer array.
// return the entire integer array to findyourBrainType
class PersonalityCalculator{
	findAnswers(){
		String[] array = new String[6];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=6;i++)
		{
			array[i]=sc.nextLine();
		}
	findYourBrainType(){
		String[] array = new String[6];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=6;i++)
		{
			array[i]=sc.nextLine();
		}
}
}