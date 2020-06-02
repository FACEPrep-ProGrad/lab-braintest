package service;
import java.util.*;
public class  PersonalityCalculator
{
	// method
	public int findAnswer(String options) {
//		split the option and store in the separate string
		String sc[] = options.split(",");
		int n = sc.length;
		int arr[] = new int[n];
		for(int i=0; i<n ; i++) {
			//parse int convert the string into the integer.
			//change the type.
			arr[i] = Integer.parseInt(sc[i]);
			return arr[i];
			
		}

		 int x=arr[0]+arr[1]+arr[2]+arr[4]+arr[7]+arr[9]+arr[10]+arr[11]+arr[13]+arr[17]+arr[19];
		 System.out.println(x);
		 int y=arr[3]+arr[5]+arr[6]+arr[12]+arr[14]+arr[15]+arr[16]+arr[18];
		 System.out.println(y);
		 int Z=66-x+y;
		 return Z;
	}


public String findYourBrainType(String options) {
	
	 int Z=findAnswer(options);
	        
	 if((Z>=20)&&(Z<=25)) {
		 return "Left-Brained";
	 }
	 else if((Z>=56)&&(Z<=64)) {
		 return "No clear preference ";
	 }
	 else if((Z>=65)&&(Z<=100)) {
	    return "Right-brained";
	 }
	 else 
		 return "something went wrong";
	
}
}