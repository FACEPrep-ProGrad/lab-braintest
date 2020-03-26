package service;

public class PersonalityCalculator
{
	public int findAnswers(String options)
	{
		String[] StringArray = options.split(",");
		int[] IntArray = new int[StringArray.length];
		for(int i=0;i<StringArray.length;i++) {
			IntArray[i]=Integer.parseInt(StringArray[i]);
		}
		return IntArray;
	}
	
	public String findYourBrainType(String options) {
		int[] option = findAnswers(options);
		int x = option[0]+option[1]+option[2]+option[4]+option[7]+option[9]+option[10]+option[11]+option[13]+option[17]+option[19];
		int y = option[3]+option[5]+option[6]+option[12]+option[14]+option[15]+option[16]+option[18];
		int z = 66 - x + y;
		System.out.println("Your total score "+z);
		if((z>=20)&&(z<=55))
			return "Left-brained ";
		if((z>=56)&&(z<=64))
			return "No clear preference ";
		if((z>=65)&&(z<=100))
	         return "Right-brained";
		return "false";	
	}
	
}
