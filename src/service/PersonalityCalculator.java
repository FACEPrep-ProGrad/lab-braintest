package service;

public class PersonalityCalculator
{
	
	public String findYourBrainType(String options)
	{
		
		int newarr[]=findAnswers(options);
		int a=(newarr[0]+newarr[1]+newarr[2]+newarr[4]+newarr[7]+newarr[9]+newarr[10]+newarr[11]+newarr[13]+newarr[17]+newarr[19]);
		
		int b=newarr[3]+newarr[5]+newarr[6]+newarr[8]+newarr[12]+newarr[14]+newarr[15]+newarr[16]+newarr[18];
		int x=66-a+b;
		
		if(20<=x && x<=55) {
			 return "leftbrained";
		 }else if(56<=x && x<=64)
		 {
			return "No clear preference"; 
		 }else if(65<=x && x<=100)
		 {
			 return "rightbrained";
		 }else
		 {
			 return "wrong !!! ";
		 }
		
	}

	public int[] findAnswers(String options ) {
		
		String arr[]= options.split(",");
		int size=arr.length;
		int newarr []=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			newarr[i]=Integer.parseInt(arr[i]);
		}
		
		
		return newarr;
		
	}
}