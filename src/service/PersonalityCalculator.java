package service;
import java.util.*;
public class PersonalityCalculator
{
	public String findYourBrainType(String options)
	{
		int x[] = findAnswers(options);
		int a,b,z;
		a= x[0]+x[1]+x[2]+x[4]+x[7]+x[9]+x[10]+x[11]+x[13]+x[17]+x[19];
		b=x[3]+x[5]+x[6]+x[8]+x[12]+x[14]+x[15]+x[16]+x[18];
		z= 66-a+b;
		if(z>=20 && z<=55)
			return "Left-brained";
		else if(z>=56 && z<=64)
			return "No clear preference";
		else if(z>=65 && z<=100)
			return "Right-brained";
		else
			return "Invalid Data";
	}
	public int[] findAnswers(String str)
	{
		String items[] = str.split(",");
		int newArray[] = new int[items.length];
		
	      for(int i=0; i<items.length; i++) 
	      {
	    	  
	    		  newArray[i] = Integer.parseInt(items[i]);
	    	 
	      }
	      return newArray;
	}
}