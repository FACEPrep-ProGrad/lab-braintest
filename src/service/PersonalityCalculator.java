package service;

// Create a class called PersonalityCalculator
// PersonalityCalculator has two methods findAnswers and findYourBrainType
// int[] findAnswers(String options) and String findYourBrainType(String options) is the method prototype
// findAnswer() accepts String as an argument and returns integer array as an output
// findYourBrainType accepts String as an argument and returns String as an output
// option is a string which contains all the options selected as a string
// Use the split method to segregate the options and store it in a string array.
// Convert the string array into an integer array.
// return the entire integer array to findyourBrainType

//class personality calculator
public class  PersonalityCalculator
{
	
	//method find answer
	public int[] findAnswers(String options)
	{
		String c[]=options.split(",");
		int value=c.length;
		int array[]=new int[value];
		int i=0;
		for(String s:c)
		{
			array[i]=Integer.parseInt(s);
			i++;
		}
		
		return array;
		
	}
	
	
	//check brain type
	public String findYourBrainType(String options)
	{ 
		int array[]=findAnswers(options);
		int x=array[0]+array[1]+array[2]+array[4]+array[7]+array[9]+array[10]+array[11]+array[13]+array[17]+array[19];
		int y=array[3]+array[5]+array[6]+array[12]+array[14]+array[15]+array[16]+array[18];
		int z=66-x+y;
		System.out.println("Yor total score "+z);
		if((z>=22)&&(z<=55))
			return "Left-brained ";
		if((z>=56)&&(z<=64))
			return "No clear preference ";
		if((z>=65)&&(z<=100))
             return "Right-brained";
		return "false";		
				
	}
	
}